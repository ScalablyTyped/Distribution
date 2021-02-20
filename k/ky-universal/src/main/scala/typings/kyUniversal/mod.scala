package typings.kyUniversal

import typings.ky.anon.Call
import typings.ky.mod.Input
import typings.ky.mod.Options
import typings.ky.mod.ResponsePromise
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    @JSImport("ky-universal", "default.<apply>")
    @js.native
    def apply(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.<apply>")
    @js.native
    def apply(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with complete new defaults.
    	@returns A new Ky instance.
    	*/
    @JSImport("ky-universal", "default.create")
    @js.native
    def create(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'delete'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.delete")
    @js.native
    def delete(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.delete")
    @js.native
    def delete(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with some defaults overridden with your own.
    	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
    	@returns A new Ky instance.
    	*/
    @JSImport("ky-universal", "default.extend")
    @js.native
    def extend(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'get'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.get")
    @js.native
    def get(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.get")
    @js.native
    def get(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'head'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.head")
    @js.native
    def head(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.head")
    @js.native
    def head(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'patch'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.patch")
    @js.native
    def patch(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.patch")
    @js.native
    def patch(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'post'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.post")
    @js.native
    def post(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.post")
    @js.native
    def post(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'put'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky-universal", "default.put")
    @js.native
    def put(url: Input): ResponsePromise = js.native
    @JSImport("ky-universal", "default.put")
    @js.native
    def put(url: Input, options: Options): ResponsePromise = js.native
    
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
    @JSImport("ky-universal", "default.stop")
    @js.native
    val stop: js.Symbol = js.native
  }
  
  @JSImport("ky-universal", "HTTPError")
  @js.native
  class HTTPError protected ()
    extends typings.ky.mod.HTTPError {
    def this(response: Response) = this()
  }
  
  @JSImport("ky-universal", "TimeoutError")
  @js.native
  class TimeoutError ()
    extends typings.ky.mod.TimeoutError
}
