package typings.got.mod

import typings.got.gotNumbers.`408`
import typings.got.gotNumbers.`413`
import typings.got.gotNumbers.`429`
import typings.got.gotNumbers.`500`
import typings.got.gotNumbers.`502`
import typings.got.gotNumbers.`503`
import typings.got.gotNumbers.`504`
import typings.got.gotStrings.DELETE
import typings.got.gotStrings.GET
import typings.got.gotStrings.HEAD
import typings.got.gotStrings.OPTIONS
import typings.got.gotStrings.POST
import typings.got.gotStrings.PUT
import typings.got.gotStrings.TRACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  /**
    * Allowed error codes.
    */
  var errorCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxRetryAfter: js.UndefOr[Double] = js.undefined
  
  var methods: js.UndefOr[js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]] = js.undefined
  
  var retries: js.UndefOr[Double | RetryFunction] = js.undefined
  
  var statusCodes: js.UndefOr[js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setErrorCodes(value: js.Array[String]): Self = StObject.set(x, "errorCodes", value.asInstanceOf[js.Any])
    
    inline def setErrorCodesUndefined: Self = StObject.set(x, "errorCodes", js.undefined)
    
    inline def setErrorCodesVarargs(value: String*): Self = StObject.set(x, "errorCodes", js.Array(value :_*))
    
    inline def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryAfterUndefined: Self = StObject.set(x, "maxRetryAfter", js.undefined)
    
    inline def setMethods(value: js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: (GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE)*): Self = StObject.set(x, "methods", js.Array(value :_*))
    
    inline def setRetries(value: Double | RetryFunction): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesFunction2(value: (/* retry */ Double, /* error */ js.Any) => Double): Self = StObject.set(x, "retries", js.Any.fromFunction2(value))
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setStatusCodes(value: js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    
    inline def setStatusCodesVarargs(value: (`408` | `413` | `429` | `500` | `502` | `503` | `504`)*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
  }
}
