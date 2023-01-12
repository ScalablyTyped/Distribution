package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var initialRetryTime: js.UndefOr[Double] = js.undefined
  
  var maxRetryTime: js.UndefOr[Double] = js.undefined
  
  var multiplier: js.UndefOr[Double] = js.undefined
  
  var restartOnFailure: js.UndefOr[js.Function1[/* e */ js.Error, js.Promise[Boolean]]] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setInitialRetryTime(value: Double): Self = StObject.set(x, "initialRetryTime", value.asInstanceOf[js.Any])
    
    inline def setInitialRetryTimeUndefined: Self = StObject.set(x, "initialRetryTime", js.undefined)
    
    inline def setMaxRetryTime(value: Double): Self = StObject.set(x, "maxRetryTime", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryTimeUndefined: Self = StObject.set(x, "maxRetryTime", js.undefined)
    
    inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    inline def setRestartOnFailure(value: /* e */ js.Error => js.Promise[Boolean]): Self = StObject.set(x, "restartOnFailure", js.Any.fromFunction1(value))
    
    inline def setRestartOnFailureUndefined: Self = StObject.set(x, "restartOnFailure", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
  }
}
