package typings.ky

import typings.ky.anon.Call
import typings.ky.mod.Input
import typings.ky.mod.Options
import typings.ky.mod.ResponsePromise
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object umdMod {
  
  object default {
    
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
    @scala.inline
    def apply(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def apply(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    @JSImport("ky/umd", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Create a new Ky instance with complete new defaults.
    	@returns A new Ky instance.
    	*/
    @scala.inline
    def create(defaultOptions: Options): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[Call]
    
    /**
    	Fetch the given `url` using the option `{method: 'delete'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def delete(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def delete(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	Create a new Ky instance with some defaults overridden with your own.
    	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
    	@returns A new Ky instance.
    	*/
    @scala.inline
    def extend(defaultOptions: Options): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[Call]
    
    /**
    	Fetch the given `url` using the option `{method: 'get'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def get(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def get(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	Fetch the given `url` using the option `{method: 'head'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def head(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def head(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	Fetch the given `url` using the option `{method: 'patch'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def patch(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def patch(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	Fetch the given `url` using the option `{method: 'post'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def post(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def post(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	Fetch the given `url` using the option `{method: 'put'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @scala.inline
    def put(url: Input): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
    @scala.inline
    def put(url: Input, options: Options): ResponsePromise = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResponsePromise]
    
    /**
    	A `Symbol` that can be returned by a `beforeRetry` hook to stop the retry.
    	This will also short circuit the remaining `beforeRetry` hooks.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		await ky('https://example.com', {
    			hooks: {
    				beforeRetry: [
    					async (request, options, errors, retryCount) => {
    						const shouldStopRetry = await ky('https://example.com/api');
    						if (shouldStopRetry) {
    							return ky.stop;
    						}
    					}
    				]
    			}
    		});
    	})();
    	```
    	*/
    @JSImport("ky/umd", "default.stop")
    @js.native
    val stop: js.Symbol = js.native
  }
  
  @JSImport("ky/umd", "HTTPError")
  @js.native
  class HTTPError protected ()
    extends typings.ky.mod.HTTPError {
    def this(response: Response) = this()
  }
  
  @JSImport("ky/umd", "TimeoutError")
  @js.native
  class TimeoutError ()
    extends typings.ky.mod.TimeoutError
}
