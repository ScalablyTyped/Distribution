package typings.instagramPrivateApi.anon

import typings.lifeomicAttempt.mod.AttemptContext
import typings.lifeomicAttempt.mod.AttemptOptions
import typings.lifeomicAttempt.mod.BeforeAttempt
import typings.lifeomicAttempt.mod.CalculateDelay
import typings.lifeomicAttempt.mod.HandleError
import typings.lifeomicAttempt.mod.HandleTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@lifeomic/attempt.@lifeomic/attempt.AttemptOptions<any>> */
@js.native
trait PartialAttemptOptionsany extends js.Object {
  
  var beforeAttempt: js.UndefOr[BeforeAttempt[_] | Null] = js.native
  
  var calculateDelay: js.UndefOr[CalculateDelay[_] | Null] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var factor: js.UndefOr[Double] = js.native
  
  var handleError: js.UndefOr[HandleError[_] | Null] = js.native
  
  var handleTimeout: js.UndefOr[HandleTimeout[_] | Null] = js.native
  
  var initialDelay: js.UndefOr[Double] = js.native
  
  var jitter: js.UndefOr[Boolean] = js.native
  
  var maxAttempts: js.UndefOr[Double] = js.native
  
  var maxDelay: js.UndefOr[Double] = js.native
  
  var minDelay: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object PartialAttemptOptionsany {
  
  @scala.inline
  def apply(): PartialAttemptOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAttemptOptionsany]
  }
  
  @scala.inline
  implicit class PartialAttemptOptionsanyOps[Self <: PartialAttemptOptionsany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit): Self = this.set("beforeAttempt", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeAttempt: Self = this.set("beforeAttempt", js.undefined)
    
    @scala.inline
    def setBeforeAttemptNull: Self = this.set("beforeAttempt", null)
    
    @scala.inline
    def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Double): Self = this.set("calculateDelay", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalculateDelay: Self = this.set("calculateDelay", js.undefined)
    
    @scala.inline
    def setCalculateDelayNull: Self = this.set("calculateDelay", null)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    
    @scala.inline
    def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit): Self = this.set("handleError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandleError: Self = this.set("handleError", js.undefined)
    
    @scala.inline
    def setHandleErrorNull: Self = this.set("handleError", null)
    
    @scala.inline
    def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => js.Promise[_]): Self = this.set("handleTimeout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHandleTimeout: Self = this.set("handleTimeout", js.undefined)
    
    @scala.inline
    def setHandleTimeoutNull: Self = this.set("handleTimeout", null)
    
    @scala.inline
    def setInitialDelay(value: Double): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDelay: Self = this.set("initialDelay", js.undefined)
    
    @scala.inline
    def setJitter(value: Boolean): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
    
    @scala.inline
    def setMinDelay(value: Double): Self = this.set("minDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDelay: Self = this.set("minDelay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
