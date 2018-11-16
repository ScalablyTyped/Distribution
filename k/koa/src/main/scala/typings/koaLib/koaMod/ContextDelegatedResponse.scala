package typings
package koaLib.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDelegatedResponse extends js.Object {
  /**
       * Get/Set response body.
       */
  var body: js.Any = js.native
  /**
       * Get/Set the ETag of a response.
       * This will normalize the quotes if necessary.
       *
       *     this.response.etag = 'md5hashsum';
       *     this.response.etag = '"md5hashsum"';
       *     this.response.etag = 'W/"123456789"';
       *
       * @param {String} etag
       * @api public
       */
  var etag: java.lang.String = js.native
  /**
       * Check if a header has been written to the socket.
       */
  var headerSent: scala.Boolean = js.native
  /**
       * Get the Last-Modified date in Date form, if it exists.
       * Set the Last-Modified date using a string or a Date.
       *
       *     this.response.lastModified = new Date();
       *     this.response.lastModified = '2013-09-13';
       */
  var lastModified: stdLib.Date = js.native
  /**
       * Return parsed response Content-Length when present.
       * Set Content-Length field to `n`.
       */
  var length: scala.Double = js.native
  /**
       * Get response status message
       */
  var message: java.lang.String = js.native
  /**
       * Get/Set response status code.
       */
  var status: scala.Double = js.native
  /**
       * Return the response mime type void of
       * parameters such as "charset".
       *
       * Set Content-Type response header with `type` through `mime.lookup()`
       * when it does not contain a charset.
       *
       * Examples:
       *
       *     this.type = '.html';
       *     this.type = 'html';
       *     this.type = 'json';
       *     this.type = 'application/json';
       *     this.type = 'png';
       */
  var `type`: java.lang.String = js.native
  /**
       * Checks if the request is writable.
       * Tests for the existence of the socket
       * as node sometimes does not set it.
       */
  var writable: scala.Boolean = js.native
  /**
       * Append additional header `field` with value `val`.
       *
       * Examples:
       *
       * ```
       * this.append('Link', ['<http://localhost/>', '<http://localhost:3000/>']);
       * this.append('Set-Cookie', 'foo=bar; Path=/; HttpOnly');
       * this.append('Warning', '199 Miscellaneous warning');
       * ```
       */
  def append(field: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  /**
       * Append additional header `field` with value `val`.
       *
       * Examples:
       *
       * ```
       * this.append('Link', ['<http://localhost/>', '<http://localhost:3000/>']);
       * this.append('Set-Cookie', 'foo=bar; Path=/; HttpOnly');
       * this.append('Warning', '199 Miscellaneous warning');
       * ```
       */
  def append(field: java.lang.String, `val`: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Set Content-Disposition header to "attachment" with optional `filename`.
       */
  def attachment(filename: java.lang.String): scala.Unit = js.native
  /**
       * Flush any set headers, and begin the body
       */
  def flushHeaders(): scala.Unit = js.native
  /**
       * Perform a 302 redirect to `url`.
       *
       * The string "back" is special-cased
       * to provide Referrer support, when Referrer
       * is not present `alt` or "/" is used.
       *
       * Examples:
       *
       *    this.redirect('back');
       *    this.redirect('back', '/index.html');
       *    this.redirect('/login');
       *    this.redirect('http://google.com');
       */
  def redirect(url: java.lang.String): scala.Unit = js.native
  /**
       * Perform a 302 redirect to `url`.
       *
       * The string "back" is special-cased
       * to provide Referrer support, when Referrer
       * is not present `alt` or "/" is used.
       *
       * Examples:
       *
       *    this.redirect('back');
       *    this.redirect('back', '/index.html');
       *    this.redirect('/login');
       *    this.redirect('http://google.com');
       */
  def redirect(url: java.lang.String, alt: java.lang.String): scala.Unit = js.native
  /**
       * Remove header `field`.
       */
  def remove(field: java.lang.String): scala.Unit = js.native
  /**
       * Set header `field` to `val`, or pass
       * an object of header fields.
       *
       * Examples:
       *
       *    this.set('Foo', ['bar', 'baz']);
       *    this.set('Accept', 'application/json');
       *    this.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
       */
  def set(field: ScalablyTyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def set(field: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def set(field: java.lang.String, `val`: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Vary on `field`.
       */
  def vary(field: java.lang.String): scala.Unit = js.native
}

