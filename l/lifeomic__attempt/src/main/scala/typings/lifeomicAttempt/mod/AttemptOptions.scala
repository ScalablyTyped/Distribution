package typings.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttemptOptions[T] extends js.Object {
  
  val beforeAttempt: BeforeAttempt[T] | Null = js.native
  
  val calculateDelay: CalculateDelay[T] | Null = js.native
  
  val delay: Double = js.native
  
  val factor: Double = js.native
  
  val handleError: HandleError[T] | Null = js.native
  
  val handleTimeout: HandleTimeout[T] | Null = js.native
  
  val initialDelay: Double = js.native
  
  val jitter: Boolean = js.native
  
  val maxAttempts: Double = js.native
  
  val maxDelay: Double = js.native
  
  val minDelay: Double = js.native
  
  val timeout: Double = js.native
}
object AttemptOptions {
  
  @scala.inline
  def apply[T](
    delay: Double,
    factor: Double,
    initialDelay: Double,
    jitter: Boolean,
    maxAttempts: Double,
    maxDelay: Double,
    minDelay: Double,
    timeout: Double
  ): AttemptOptions[T] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], minDelay = minDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptOptions[T]]
  }
  
  @scala.inline
  implicit class AttemptOptionsOps[Self <: AttemptOptions[_], T] (val x: Self with AttemptOptions[T]) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelay(value: Double): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitter(value: Boolean): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDelay(value: Double): Self = this.set("minDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = this.set("beforeAttempt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeAttemptNull: Self = this.set("beforeAttempt", null)
    
    @scala.inline
    def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = this.set("calculateDelay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalculateDelayNull: Self = this.set("calculateDelay", null)
    
    @scala.inline
    def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = this.set("handleError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandleErrorNull: Self = this.set("handleError", null)
    
    @scala.inline
    def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = this.set("handleTimeout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleTimeoutNull: Self = this.set("handleTimeout", null)
  }
}
