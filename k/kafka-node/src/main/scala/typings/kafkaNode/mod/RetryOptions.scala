package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var maxTimeout: js.UndefOr[Double] = js.undefined
  
  var minTimeout: js.UndefOr[Double] = js.undefined
  
  var randomize: js.UndefOr[Boolean] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
    
    inline def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
    
    inline def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
  }
}
