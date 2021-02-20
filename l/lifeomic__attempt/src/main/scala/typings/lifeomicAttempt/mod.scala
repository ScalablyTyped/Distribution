package typings.lifeomicAttempt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lifeomic/attempt", "defaultCalculateDelay")
  @js.native
  def defaultCalculateDelay[T](context: AttemptContext, options: AttemptOptions[T]): Double = js.native
  
  @JSImport("@lifeomic/attempt", "retry")
  @js.native
  def retry[T](attemptFunc: AttemptFunction[T]): js.Promise[T] = js.native
  @JSImport("@lifeomic/attempt", "retry")
  @js.native
  def retry[T](attemptFunc: AttemptFunction[T], attemptOptions: PartialAttemptOptions[T]): js.Promise[T] = js.native
  
  @JSImport("@lifeomic/attempt", "sleep")
  @js.native
  def sleep(delay: Double): js.Promise[js.Object] = js.native
  
  @js.native
  trait AttemptContext extends StObject {
    
    def abort(): Unit = js.native
    
    var aborted: Boolean = js.native
    
    var attemptNum: Double = js.native
    
    var attemptsRemaining: Double = js.native
  }
  object AttemptContext {
    
    @scala.inline
    def apply(abort: () => Unit, aborted: Boolean, attemptNum: Double, attemptsRemaining: Double): AttemptContext = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted.asInstanceOf[js.Any], attemptNum = attemptNum.asInstanceOf[js.Any], attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttemptContext]
    }
    
    @scala.inline
    implicit class AttemptContextMutableBuilder[Self <: AttemptContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptNum(value: Double): Self = StObject.set(x, "attemptNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsRemaining(value: Double): Self = StObject.set(x, "attemptsRemaining", value.asInstanceOf[js.Any])
    }
  }
  
  type AttemptFunction[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  
  @js.native
  trait AttemptOptions[T] extends StObject {
    
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
    implicit class AttemptOptionsMutableBuilder[Self <: AttemptOptions[_], T] (val x: Self with AttemptOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "beforeAttempt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeAttemptNull: Self = StObject.set(x, "beforeAttempt", null)
      
      @scala.inline
      def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = StObject.set(x, "calculateDelay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCalculateDelayNull: Self = StObject.set(x, "calculateDelay", null)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "handleError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandleErrorNull: Self = StObject.set(x, "handleError", null)
      
      @scala.inline
      def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = StObject.set(x, "handleTimeout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleTimeoutNull: Self = StObject.set(x, "handleTimeout", null)
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJitter(value: Boolean): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDelay(value: Double): Self = StObject.set(x, "minDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type BeforeAttempt[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  
  type CalculateDelay[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Double]
  
  type HandleError[T] = js.Function3[/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  
  type HandleTimeout[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  
  /* Inlined {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]} */
  @js.native
  trait PartialAttemptOptions[T] extends StObject {
    
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
    implicit class PartialAttemptOptionsMutableBuilder[Self <: PartialAttemptOptions[_], T] (val x: Self with PartialAttemptOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "beforeAttempt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeAttemptNull: Self = StObject.set(x, "beforeAttempt", null)
      
      @scala.inline
      def setBeforeAttemptUndefined: Self = StObject.set(x, "beforeAttempt", js.undefined)
      
      @scala.inline
      def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = StObject.set(x, "calculateDelay", js.Any.fromFunction2(value))
      
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
      def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "handleError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHandleErrorNull: Self = StObject.set(x, "handleError", null)
      
      @scala.inline
      def setHandleErrorUndefined: Self = StObject.set(x, "handleError", js.undefined)
      
      @scala.inline
      def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = StObject.set(x, "handleTimeout", js.Any.fromFunction2(value))
      
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
}
