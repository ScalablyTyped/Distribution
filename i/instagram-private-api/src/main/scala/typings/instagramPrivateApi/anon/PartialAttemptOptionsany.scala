package typings.instagramPrivateApi.anon

import typings.lifeomicAttempt.mod.AttemptContext
import typings.lifeomicAttempt.mod.AttemptOptions
import typings.lifeomicAttempt.mod.BeforeAttempt
import typings.lifeomicAttempt.mod.CalculateDelay
import typings.lifeomicAttempt.mod.HandleError
import typings.lifeomicAttempt.mod.HandleTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@lifeomic/attempt.@lifeomic/attempt.AttemptOptions<any>> */
trait PartialAttemptOptionsany extends StObject {
  
  var beforeAttempt: js.UndefOr[BeforeAttempt[js.Any] | Null] = js.undefined
  
  var calculateDelay: js.UndefOr[CalculateDelay[js.Any] | Null] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var handleError: js.UndefOr[HandleError[js.Any] | Null] = js.undefined
  
  var handleTimeout: js.UndefOr[HandleTimeout[js.Any] | Null] = js.undefined
  
  var initialDelay: js.UndefOr[Double] = js.undefined
  
  var jitter: js.UndefOr[Boolean] = js.undefined
  
  var maxAttempts: js.UndefOr[Double] = js.undefined
  
  var maxDelay: js.UndefOr[Double] = js.undefined
  
  var minDelay: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialAttemptOptionsany {
  
  @scala.inline
  def apply(): PartialAttemptOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAttemptOptionsany]
  }
  
  @scala.inline
  implicit class PartialAttemptOptionsanyMutableBuilder[Self <: PartialAttemptOptionsany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[js.Any]) => Unit): Self = StObject.set(x, "beforeAttempt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeAttemptNull: Self = StObject.set(x, "beforeAttempt", null)
    
    @scala.inline
    def setBeforeAttemptUndefined: Self = StObject.set(x, "beforeAttempt", js.undefined)
    
    @scala.inline
    def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[js.Any]) => Double): Self = StObject.set(x, "calculateDelay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalculateDelayNull: Self = StObject.set(x, "calculateDelay", null)
    
    @scala.inline
    def setCalculateDelayUndefined: Self = StObject.set(x, "calculateDelay", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setHandleError(
      value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[js.Any]) => Unit
    ): Self = StObject.set(x, "handleError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandleErrorNull: Self = StObject.set(x, "handleError", null)
    
    @scala.inline
    def setHandleErrorUndefined: Self = StObject.set(x, "handleError", js.undefined)
    
    @scala.inline
    def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[js.Any]) => js.Promise[js.Any]): Self = StObject.set(x, "handleTimeout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleTimeoutNull: Self = StObject.set(x, "handleTimeout", null)
    
    @scala.inline
    def setHandleTimeoutUndefined: Self = StObject.set(x, "handleTimeout", js.undefined)
    
    @scala.inline
    def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
    
    @scala.inline
    def setJitter(value: Boolean): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    
    @scala.inline
    def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    
    @scala.inline
    def setMinDelay(value: Double): Self = StObject.set(x, "minDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDelayUndefined: Self = StObject.set(x, "minDelay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
