package typings.ky.umdMod

import typings.ky.Anon_Body
import typings.ky._Omit
import typings.ky.kyMod.Options
import typings.ky.kyMod.OptionsWithBody
import typings.ky.kyMod.OptionsWithoutBody
import typings.ky.kyMod.ResponsePromise
import typings.ky.kyStrings.body
import typings.std.Request
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ky/umd", "default")
@js.native
object default extends js.Object {
  def apply(url: String): ResponsePromise = js.native
  def apply(url: String, options: OptionsWithBody): ResponsePromise = js.native
  def apply(url: String, options: OptionsWithoutBody): ResponsePromise = js.native
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
  def apply(url: Request): ResponsePromise = js.native
  def apply(url: Request, options: OptionsWithBody): ResponsePromise = js.native
  def apply(url: Request, options: OptionsWithoutBody): ResponsePromise = js.native
  def apply(url: URL): ResponsePromise = js.native
  def apply(url: URL, options: OptionsWithBody): ResponsePromise = js.native
  def apply(url: URL, options: OptionsWithoutBody): ResponsePromise = js.native
  /**
  	Create a new Ky instance with complete new defaults.
  	@returns A new Ky instance.
  	*/
  def create(defaultOptions: Options): Anon_Body = js.native
  def delete(url: String): ResponsePromise = js.native
  def delete(url: String, options: Options): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'delete'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def delete(url: Request): ResponsePromise = js.native
  def delete(url: Request, options: Options): ResponsePromise = js.native
  def delete(url: URL): ResponsePromise = js.native
  def delete(url: URL, options: Options): ResponsePromise = js.native
  /**
  	Create a new Ky instance with some defaults overridden with your own.
  	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
  	@returns A new Ky instance.
  	*/
  def extend(defaultOptions: Options): Anon_Body = js.native
  def get(url: String): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'get'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def get(url: Request): ResponsePromise = js.native
  def get(url: URL): ResponsePromise = js.native
  @JSName("get")
  def get_body(url: String, options: _Omit[Options, body]): ResponsePromise = js.native
  @JSName("get")
  def get_body(url: Request, options: _Omit[Options, body]): ResponsePromise = js.native
  @JSName("get")
  def get_body(url: URL, options: _Omit[Options, body]): ResponsePromise = js.native
  def head(url: String): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'head'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def head(url: Request): ResponsePromise = js.native
  def head(url: URL): ResponsePromise = js.native
  @JSName("head")
  def head_body(url: String, options: _Omit[Options, body]): ResponsePromise = js.native
  @JSName("head")
  def head_body(url: Request, options: _Omit[Options, body]): ResponsePromise = js.native
  @JSName("head")
  def head_body(url: URL, options: _Omit[Options, body]): ResponsePromise = js.native
  def patch(url: String): ResponsePromise = js.native
  def patch(url: String, options: Options): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'patch'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def patch(url: Request): ResponsePromise = js.native
  def patch(url: Request, options: Options): ResponsePromise = js.native
  def patch(url: URL): ResponsePromise = js.native
  def patch(url: URL, options: Options): ResponsePromise = js.native
  def post(url: String): ResponsePromise = js.native
  def post(url: String, options: Options): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'post'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def post(url: Request): ResponsePromise = js.native
  def post(url: Request, options: Options): ResponsePromise = js.native
  def post(url: URL): ResponsePromise = js.native
  def post(url: URL, options: Options): ResponsePromise = js.native
  def put(url: String): ResponsePromise = js.native
  def put(url: String, options: Options): ResponsePromise = js.native
  /**
  	Fetch the given `url` using the option `{method: 'put'}`.
  	@param url - `Request` object, `URL` object, or URL string.
  	@returns A promise with `Body` methods added.
  	*/
  def put(url: Request): ResponsePromise = js.native
  def put(url: Request, options: Options): ResponsePromise = js.native
  def put(url: URL): ResponsePromise = js.native
  def put(url: URL, options: Options): ResponsePromise = js.native
}

