package typings
package kyLib.umdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ky/umd", "default")
@js.native
object default extends js.Object {
  def apply(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: java.lang.String, options: kyLib.kyMod.OptionsWithBody): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: java.lang.String, options: kyLib.kyMod.OptionsWithoutBody): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` method added.
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		const parsed = await ky('https://example.com', {json: {foo: true}}).json();
  		console.log(parsed);
  		//=> `{data: '🦄'}`
  	})();
  	```
  	*/
  def apply(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: stdLib.Request, options: kyLib.kyMod.OptionsWithBody): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: stdLib.Request, options: kyLib.kyMod.OptionsWithoutBody): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: stdLib.URL, options: kyLib.kyMod.OptionsWithBody): kyLib.kyMod.ResponsePromise = js.native
  def apply(url: stdLib.URL, options: kyLib.kyMod.OptionsWithoutBody): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Create a new Ky instance with complete new defaults.
  	@returns A new Ky instance.
  	*/
  def create(defaultOptions: kyLib.kyMod.Options): kyLib.Anon_Body = js.native
  def delete(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  def delete(url: java.lang.String, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'delete'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def delete(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def delete(url: stdLib.Request, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def delete(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  def delete(url: stdLib.URL, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Create a new Ky instance with some defaults overridden with your own.
  	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
  	@returns A new Ky instance.
  	*/
  def extend(defaultOptions: kyLib.kyMod.Options): kyLib.Anon_Body = js.native
  def get(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'get'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def get(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def get(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  @JSName("get")
  def get_body(url: java.lang.String, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  @JSName("get")
  def get_body(url: stdLib.Request, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  @JSName("get")
  def get_body(url: stdLib.URL, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  def head(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'head'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def head(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def head(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  @JSName("head")
  def head_body(url: java.lang.String, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  @JSName("head")
  def head_body(url: stdLib.Request, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  @JSName("head")
  def head_body(url: stdLib.URL, options: kyLib._Omit[kyLib.kyMod.Options, kyLib.kyLibStrings.body]): kyLib.kyMod.ResponsePromise = js.native
  def patch(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  def patch(url: java.lang.String, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'patch'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def patch(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def patch(url: stdLib.Request, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def patch(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  def patch(url: stdLib.URL, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def post(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  def post(url: java.lang.String, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'post'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def post(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def post(url: stdLib.Request, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def post(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  def post(url: stdLib.URL, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def put(url: java.lang.String): kyLib.kyMod.ResponsePromise = js.native
  def put(url: java.lang.String, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'put'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def put(url: stdLib.Request): kyLib.kyMod.ResponsePromise = js.native
  def put(url: stdLib.Request, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
  def put(url: stdLib.URL): kyLib.kyMod.ResponsePromise = js.native
  def put(url: stdLib.URL, options: kyLib.kyMod.Options): kyLib.kyMod.ResponsePromise = js.native
}

