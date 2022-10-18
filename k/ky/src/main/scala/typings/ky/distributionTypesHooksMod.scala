package typings.ky

import typings.ky.distributionTypesOptionsMod.NormalizedOptions
import typings.ky.mod.HTTPError
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionTypesHooksMod {
  
  type AfterResponseHook = js.Function3[
    /* request */ Request, 
    /* options */ NormalizedOptions, 
    /* response */ Response, 
    Response | Unit | (js.Promise[Response | Unit])
  ]
  
  type BeforeErrorHook = js.Function1[/* error */ HTTPError, HTTPError | js.Promise[HTTPError]]
  
  type BeforeRequestHook = js.Function2[
    /* request */ Request, 
    /* options */ NormalizedOptions, 
    Request | Response | Unit | (js.Promise[Request | Response | Unit])
  ]
  
  type BeforeRetryHook = js.Function1[/* options */ BeforeRetryState, js.Symbol | Unit | (js.Promise[js.Symbol | Unit])]
  
  trait BeforeRetryState extends StObject {
    
    var error: js.Error
    
    var options: NormalizedOptions
    
    var request: Request
    
    var retryCount: Double
  }
  object BeforeRetryState {
    
    inline def apply(error: js.Error, options: NormalizedOptions, request: Request, retryCount: Double): BeforeRetryState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeRetryState]
    }
    
    extension [Self <: BeforeRetryState](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: NormalizedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hooks extends StObject {
    
    /**
      This hook enables you to read and optionally modify the response. The hook function receives normalized input, options, and a clone of the response as arguments. The return value of the hook function will be used by Ky as the response object if it's an instance of [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response).
      @default []
      @example
      ```
      import ky from 'ky';
      const response = await ky('https://example.com', {
      hooks: {
      afterResponse: [
      (_input, _options, response) => {
      // You could do something with the response, for example, logging.
      log(response);
      // Or return a `Response` instance to overwrite the response.
      return new Response('A different response', {status: 200});
      },
      // Or retry with a fresh token on a 403 error
      async (input, options, response) => {
      if (response.status === 403) {
      // Get a fresh token
      const token = await ky('https://example.com/token').text();
      // Retry with the token
      options.headers.set('Authorization', `token ${token}`);
      return ky(input, options);
      }
      }
      ]
      }
      });
      ```
      */
    var afterResponse: js.UndefOr[js.Array[AfterResponseHook]] = js.undefined
    
    /**
      This hook enables you to modify the `HTTPError` right before it is thrown. The hook function receives a `HTTPError` as an argument and should return an instance of `HTTPError`.
      @default []
      @example
      ```
      import ky from 'ky';
      await ky('https://example.com', {
      hooks: {
      beforeError: [
      error => {
      const {response} = error;
      if (response && response.body) {
      error.name = 'GitHubError';
      error.message = `${response.body.message} (${response.statusCode})`;
      }
      return error;
      }
      ]
      }
      });
      ```
      */
    var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.undefined
    
    /**
      This hook enables you to modify the request right before it is sent. Ky will make no further changes to the request after this. The hook function receives normalized input and options as arguments. You could, forf example, modiy `options.headers` here.
      A [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response) can be returned from this hook to completely avoid making a HTTP request. This can be used to mock a request, check an internal cache, etc. An **important** consideration when returning a `Response` from this hook is that all the following hooks will be skipped, so **ensure you only return a `Response` from the last hook**.
      @default []
      */
    var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook]] = js.undefined
    
    /**
      This hook enables you to modify the request right before retry. Ky will make no further changes to the request after this. The hook function receives an object with the normalized request and options, an error instance, and the retry count. You could, for example, modify `request.headers` here.
      If the request received a response, the error will be of type `HTTPError` and the `Response` object will be available at `error.response`. Be aware that some types of errors, such as network errors, inherently mean that a response was not received. In that case, the error will not be an instance of `HTTPError`.
      You can prevent Ky from retrying the request by throwing an error. Ky will not handle it in any way and the error will be propagated to the request initiator. The rest of the `beforeRetry` hooks will not be called in this case. Alternatively, you can return the [`ky.stop`](#ky.stop) symbol to do the same thing but without propagating an error (this has some limitations, see `ky.stop` docs for details).
      @example
      ```
      import ky from 'ky';
      const response = await ky('https://example.com', {
      hooks: {
      beforeRetry: [
      async ({request, options, error, retryCount}) => {
      const token = await ky('https://example.com/refresh-token');
      options.headers.set('Authorization', `token ${token}`);
      }
      ]
      }
      });
      ```
      @default []
      */
    var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook]] = js.undefined
  }
  object Hooks {
    
    inline def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setAfterResponse(value: js.Array[AfterResponseHook]): Self = StObject.set(x, "afterResponse", value.asInstanceOf[js.Any])
      
      inline def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
      
      inline def setAfterResponseVarargs(value: AfterResponseHook*): Self = StObject.set(x, "afterResponse", js.Array(value*))
      
      inline def setBeforeError(value: js.Array[BeforeErrorHook]): Self = StObject.set(x, "beforeError", value.asInstanceOf[js.Any])
      
      inline def setBeforeErrorUndefined: Self = StObject.set(x, "beforeError", js.undefined)
      
      inline def setBeforeErrorVarargs(value: BeforeErrorHook*): Self = StObject.set(x, "beforeError", js.Array(value*))
      
      inline def setBeforeRequest(value: js.Array[BeforeRequestHook]): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
      
      inline def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      inline def setBeforeRequestVarargs(value: BeforeRequestHook*): Self = StObject.set(x, "beforeRequest", js.Array(value*))
      
      inline def setBeforeRetry(value: js.Array[BeforeRetryHook]): Self = StObject.set(x, "beforeRetry", value.asInstanceOf[js.Any])
      
      inline def setBeforeRetryUndefined: Self = StObject.set(x, "beforeRetry", js.undefined)
      
      inline def setBeforeRetryVarargs(value: BeforeRetryHook*): Self = StObject.set(x, "beforeRetry", js.Array(value*))
    }
  }
}
