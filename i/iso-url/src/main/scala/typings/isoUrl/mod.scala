package typings.isoUrl

import typings.isoUrl.isoUrlStrings.httpColonSlashSlashlocalhost
import typings.isoUrl.urlMod.URLWithLegacySupport
import typings.node.urlMod.URLFormatOptions
import typings.node.urlMod.URL_
import typings.node.urlMod.UrlObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso-url/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iso-url/dist", "URL")
  @js.native
  open class URL () extends URLWithLegacySupport {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: Unit, base: String) = this()
  }
  
  /**
    * The `URLSearchParams` API provides read and write access to the query of a`URL`. The `URLSearchParams` class can also be used standalone with one of the
    * four following constructors.
    * The `URLSearchParams` class is also available on the global object.
    *
    * The WHATWG `URLSearchParams` interface and the `querystring` module have
    * similar purpose, but the purpose of the `querystring` module is more
    * general, as it allows the customization of delimiter characters (`&#x26;` and `=`).
    * On the other hand, this API is designed purely for URL query strings.
    *
    * ```js
    * const myURL = new URL('https://example.org/?abc=123');
    * console.log(myURL.searchParams.get('abc'));
    * // Prints 123
    *
    * myURL.searchParams.append('abc', 'xyz');
    * console.log(myURL.href);
    * // Prints https://example.org/?abc=123&#x26;abc=xyz
    *
    * myURL.searchParams.delete('abc');
    * myURL.searchParams.set('a', 'b');
    * console.log(myURL.href);
    * // Prints https://example.org/?a=b
    *
    * const newSearchParams = new URLSearchParams(myURL.searchParams);
    * // The above is equivalent to
    * // const newSearchParams = new URLSearchParams(myURL.search);
    *
    * newSearchParams.append('a', 'c');
    * console.log(myURL.href);
    * // Prints https://example.org/?a=b
    * console.log(newSearchParams.toString());
    * // Prints a=b&#x26;a=c
    *
    * // newSearchParams.toString() is implicitly called
    * myURL.search = newSearchParams;
    * console.log(myURL.href);
    * // Prints https://example.org/?a=b&#x26;a=c
    * newSearchParams.delete('a');
    * console.log(myURL.href);
    * // Prints https://example.org/?a=b&#x26;a=c
    * ```
    * @since v7.5.0, v6.13.0
    */
  @JSImport("iso-url/dist", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typings.isoUrl.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Record[String, String | js.Array[String]]) = this()
  }
  
  @JSImport("iso-url/dist", "defaultBase")
  @js.native
  val defaultBase: httpColonSlashSlashlocalhost = js.native
  
  inline def format(urlObject: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * The `url.format()` method returns a formatted URL string derived from`urlObject`.
    *
    * ```js
    * const url = require('url');
    * url.format({
    *   protocol: 'https',
    *   hostname: 'example.com',
    *   pathname: '/some/path',
    *   query: {
    *     page: 1,
    *     format: 'json'
    *   }
    * });
    *
    * // => 'https://example.com/some/path?page=1&#x26;format=json'
    * ```
    *
    * If `urlObject` is not an object or a string, `url.format()` will throw a `TypeError`.
    *
    * The formatting process operates as follows:
    *
    * * A new empty string `result` is created.
    * * If `urlObject.protocol` is a string, it is appended as-is to `result`.
    * * Otherwise, if `urlObject.protocol` is not `undefined` and is not a string, an `Error` is thrown.
    * * For all string values of `urlObject.protocol` that _do not end_ with an ASCII
    * colon (`:`) character, the literal string `:` will be appended to `result`.
    * * If either of the following conditions is true, then the literal string `//`will be appended to `result`:
    *    * `urlObject.slashes` property is true;
    *    * `urlObject.protocol` begins with `http`, `https`, `ftp`, `gopher`, or`file`;
    * * If the value of the `urlObject.auth` property is truthy, and either`urlObject.host` or `urlObject.hostname` are not `undefined`, the value of`urlObject.auth` will be coerced into a string
    * and appended to `result`followed by the literal string `@`.
    * * If the `urlObject.host` property is `undefined` then:
    *    * If the `urlObject.hostname` is a string, it is appended to `result`.
    *    * Otherwise, if `urlObject.hostname` is not `undefined` and is not a string,
    *    an `Error` is thrown.
    *    * If the `urlObject.port` property value is truthy, and `urlObject.hostname`is not `undefined`:
    *          * The literal string `:` is appended to `result`, and
    *          * The value of `urlObject.port` is coerced to a string and appended to`result`.
    * * Otherwise, if the `urlObject.host` property value is truthy, the value of`urlObject.host` is coerced to a string and appended to `result`.
    * * If the `urlObject.pathname` property is a string that is not an empty string:
    *    * If the `urlObject.pathname`_does not start_ with an ASCII forward slash
    *    (`/`), then the literal string `'/'` is appended to `result`.
    *    * The value of `urlObject.pathname` is appended to `result`.
    * * Otherwise, if `urlObject.pathname` is not `undefined` and is not a string, an `Error` is thrown.
    * * If the `urlObject.search` property is `undefined` and if the `urlObject.query`property is an `Object`, the literal string `?` is appended to `result`followed by the output of calling the
    * `querystring` module's `stringify()`method passing the value of `urlObject.query`.
    * * Otherwise, if `urlObject.search` is a string:
    *    * If the value of `urlObject.search`_does not start_ with the ASCII question
    *    mark (`?`) character, the literal string `?` is appended to `result`.
    *    * The value of `urlObject.search` is appended to `result`.
    * * Otherwise, if `urlObject.search` is not `undefined` and is not a string, an `Error` is thrown.
    * * If the `urlObject.hash` property is a string:
    *    * If the value of `urlObject.hash`_does not start_ with the ASCII hash (`#`)
    *    character, the literal string `#` is appended to `result`.
    *    * The value of `urlObject.hash` is appended to `result`.
    * * Otherwise, if the `urlObject.hash` property is not `undefined` and is not a
    * string, an `Error` is thrown.
    * * `result` is returned.
    * @since v0.1.25
    * @deprecated Legacy: Use the WHATWG URL API instead.
    * @param urlObject A URL object (as returned by `url.parse()` or constructed otherwise). If a string, it is converted to an object by passing it to `url.parse()`.
    */
  inline def format(urlObject: URL_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(urlObject: URL_, options: URLFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * The `url.format()` method returns a formatted URL string derived from`urlObject`.
    *
    * ```js
    * const url = require('url');
    * url.format({
    *   protocol: 'https',
    *   hostname: 'example.com',
    *   pathname: '/some/path',
    *   query: {
    *     page: 1,
    *     format: 'json'
    *   }
    * });
    *
    * // => 'https://example.com/some/path?page=1&#x26;format=json'
    * ```
    *
    * If `urlObject` is not an object or a string, `url.format()` will throw a `TypeError`.
    *
    * The formatting process operates as follows:
    *
    * * A new empty string `result` is created.
    * * If `urlObject.protocol` is a string, it is appended as-is to `result`.
    * * Otherwise, if `urlObject.protocol` is not `undefined` and is not a string, an `Error` is thrown.
    * * For all string values of `urlObject.protocol` that _do not end_ with an ASCII
    * colon (`:`) character, the literal string `:` will be appended to `result`.
    * * If either of the following conditions is true, then the literal string `//`will be appended to `result`:
    *    * `urlObject.slashes` property is true;
    *    * `urlObject.protocol` begins with `http`, `https`, `ftp`, `gopher`, or`file`;
    * * If the value of the `urlObject.auth` property is truthy, and either`urlObject.host` or `urlObject.hostname` are not `undefined`, the value of`urlObject.auth` will be coerced into a string
    * and appended to `result`followed by the literal string `@`.
    * * If the `urlObject.host` property is `undefined` then:
    *    * If the `urlObject.hostname` is a string, it is appended to `result`.
    *    * Otherwise, if `urlObject.hostname` is not `undefined` and is not a string,
    *    an `Error` is thrown.
    *    * If the `urlObject.port` property value is truthy, and `urlObject.hostname`is not `undefined`:
    *          * The literal string `:` is appended to `result`, and
    *          * The value of `urlObject.port` is coerced to a string and appended to`result`.
    * * Otherwise, if the `urlObject.host` property value is truthy, the value of`urlObject.host` is coerced to a string and appended to `result`.
    * * If the `urlObject.pathname` property is a string that is not an empty string:
    *    * If the `urlObject.pathname`_does not start_ with an ASCII forward slash
    *    (`/`), then the literal string `'/'` is appended to `result`.
    *    * The value of `urlObject.pathname` is appended to `result`.
    * * Otherwise, if `urlObject.pathname` is not `undefined` and is not a string, an `Error` is thrown.
    * * If the `urlObject.search` property is `undefined` and if the `urlObject.query`property is an `Object`, the literal string `?` is appended to `result`followed by the output of calling the
    * `querystring` module's `stringify()`method passing the value of `urlObject.query`.
    * * Otherwise, if `urlObject.search` is a string:
    *    * If the value of `urlObject.search`_does not start_ with the ASCII question
    *    mark (`?`) character, the literal string `?` is appended to `result`.
    *    * The value of `urlObject.search` is appended to `result`.
    * * Otherwise, if `urlObject.search` is not `undefined` and is not a string, an `Error` is thrown.
    * * If the `urlObject.hash` property is a string:
    *    * If the value of `urlObject.hash`_does not start_ with the ASCII hash (`#`)
    *    character, the literal string `#` is appended to `result`.
    *    * The value of `urlObject.hash` is appended to `result`.
    * * Otherwise, if the `urlObject.hash` property is not `undefined` and is not a
    * string, an `Error` is thrown.
    * * `result` is returned.
    * @since v0.1.25
    * @deprecated Legacy: Use the WHATWG URL API instead.
    * @param urlObject A URL object (as returned by `url.parse()` or constructed otherwise). If a string, it is converted to an object by passing it to `url.parse()`.
    */
  inline def format(urlObject: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def relative(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relative")().asInstanceOf[String]
  inline def relative(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def relative(url: String, location: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Any, protocolMap: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Any, protocolMap: Any, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Any, protocolMap: Unit, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Unit, protocolMap: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Unit, protocolMap: Any, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: String, location: Unit, protocolMap: Unit, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Any, protocolMap: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Any, protocolMap: Any, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Any, protocolMap: Unit, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Unit, protocolMap: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Unit, protocolMap: Any, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def relative(url: Unit, location: Unit, protocolMap: Unit, defaultProtocol: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(url.asInstanceOf[js.Any], location.asInstanceOf[js.Any], protocolMap.asInstanceOf[js.Any], defaultProtocol.asInstanceOf[js.Any])).asInstanceOf[String]
}
