package typings.ky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  trait RetryOptions extends StObject {
    
    /**
      The HTTP status codes allowed to retry with a `Retry-After` header.
      @default [413, 429, 503]
      */
    var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      The number of times to retry failed requests.
      @default 2
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
      @default Infinity
      */
    var maxRetryAfter: js.UndefOr[Double] = js.undefined
    
    /**
      The HTTP methods allowed to retry.
      @default ['get', 'put', 'head', 'delete', 'options', 'trace']
      */
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      The HTTP status codes allowed to retry.
      @default [408, 413, 429, 500, 502, 503, 504]
      */
    var statusCodes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    extension [Self <: RetryOptions](x: Self) {
      
      inline def setAfterStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "afterStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setAfterStatusCodesUndefined: Self = StObject.set(x, "afterStatusCodes", js.undefined)
      
      inline def setAfterStatusCodesVarargs(value: Double*): Self = StObject.set(x, "afterStatusCodes", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryAfterUndefined: Self = StObject.set(x, "maxRetryAfter", js.undefined)
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      inline def setStatusCodesVarargs(value: Double*): Self = StObject.set(x, "statusCodes", js.Array(value*))
    }
  }
}
