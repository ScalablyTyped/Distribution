package typings.ky

import typings.ky.optionsMod.Input
import typings.ky.optionsMod.Options
import typings.ky.responsePromiseMod.ResponsePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKyMod {
  
  @js.native
  trait KyInstance extends StObject {
    
    /**
      Fetch the given `url`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` method added.
      @example
      ```
      import ky from 'ky';
      const json = await ky('https://example.com', {json: {foo: true}}).json();
      console.log(json);
      //=> `{data: '🦄'}`
      ```
      */
    def apply(url: Input): ResponsePromise = js.native
    def apply(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Create a new Ky instance with complete new defaults.
      @returns A new Ky instance.
      */
    def create(defaultOptions: Options): KyInstance = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'delete'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def delete(url: Input): ResponsePromise = js.native
    def delete(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Create a new Ky instance with some defaults overridden with your own.
      In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
      @returns A new Ky instance.
      */
    def extend(defaultOptions: Options): KyInstance = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'get'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def get(url: Input): ResponsePromise = js.native
    def get(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'head'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def head(url: Input): ResponsePromise = js.native
    def head(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'patch'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def patch(url: Input): ResponsePromise = js.native
    def patch(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'post'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def post(url: Input): ResponsePromise = js.native
    def post(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      Fetch the given `url` using the option `{method: 'put'}`.
      @param url - `Request` object, `URL` object, or URL string.
      @returns A promise with `Body` methods added.
      */
    def put(url: Input): ResponsePromise = js.native
    def put(url: Input, options: Options): ResponsePromise = js.native
    
    /**
      A `Symbol` that can be returned by a `beforeRetry` hook to stop the retry. This will also short circuit the remaining `beforeRetry` hooks.
      Note: Returning this symbol makes Ky abort and return with an `undefined` response. Be sure to check for a response before accessing any properties on it or use [optional chaining](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Optional_chaining). It is also incompatible with body methods, such as `.json()` or `.text()`, because there is no response to parse. In general, we recommend throwing an error instead of returning this symbol, as that will cause Ky to abort and then throw, which avoids these limitations.
      A valid use-case for `ky.stop` is to prevent retries when making requests for side effects, where the returned data is not important. For example, logging client activity to the server.
      @example
      ```
      import ky from 'ky';
      const options = {
      hooks: {
      beforeRetry: [
      async ({request, options, error, retryCount}) => {
      const shouldStopRetry = await ky('https://example.com/api');
      if (shouldStopRetry) {
      return ky.stop;
      }
      }
      ]
      }
      };
      // Note that response will be `undefined` in case `ky.stop` is returned.
      const response = await ky.post('https://example.com', options);
      // Using `.text()` or other body methods is not supported.
      const text = await ky('https://example.com', options).text();
      ```
      */
    val stop: js.Symbol = js.native
  }
}
