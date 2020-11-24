package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]} */
@js.native
trait PartialAttemptOptions[T] extends js.Object {
  
  val beforeAttempt: js.UndefOr[BeforeAttempt[T] | Null] = js.native
  
  val calculateDelay: js.UndefOr[CalculateDelay[T] | Null] = js.native
  
  val delay: js.UndefOr[Double] = js.native
  
  val factor: js.UndefOr[Double] = js.native
  
  val handleError: js.UndefOr[HandleError[T] | Null] = js.native
  
  val handleTimeout: js.UndefOr[HandleTimeout[T] | Null] = js.native
  
  val initialDelay: js.UndefOr[Double] = js.native
  
  val jitter: js.UndefOr[Boolean] = js.native
  
  val maxAttempts: js.UndefOr[Double] = js.native
  
  val maxDelay: js.UndefOr[Double] = js.native
  
  val minDelay: js.UndefOr[Double] = js.native
  
  val timeout: js.UndefOr[Double] = js.native
}
object PartialAttemptOptions {
  
  @scala.inline
  def apply[T](): PartialAttemptOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAttemptOptions[T]]
  }
  
  @scala.inline
  implicit class PartialAttemptOptionsOps[Self <: PartialAttemptOptions[_], T] (val x: Self with PartialAttemptOptions[T]) extends AnyVal {
    
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
    def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = this.set("beforeAttempt", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeAttempt: Self = this.set("beforeAttempt", js.undefined)
    
    @scala.inline
    def setBeforeAttemptNull: Self = this.set("beforeAttempt", null)
    
    @scala.inline
    def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = this.set("calculateDelay", js.Any.fromFunction2(value))
    
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
    def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = this.set("handleError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandleError: Self = this.set("handleError", js.undefined)
    
    @scala.inline
    def setHandleErrorNull: Self = this.set("handleError", null)
    
    @scala.inline
    def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = this.set("handleTimeout", js.Any.fromFunction2(value))
    
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
