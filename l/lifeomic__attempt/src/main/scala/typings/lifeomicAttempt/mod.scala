package typings.lifeomicAttempt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lifeomic/attempt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultCalculateDelay[T](context: AttemptContext, options: AttemptOptions[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultCalculateDelay")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def retry[T](attemptFunc: AttemptFunction[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(attemptFunc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def retry[T](attemptFunc: AttemptFunction[T], attemptOptions: PartialAttemptOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(attemptFunc.asInstanceOf[js.Any], attemptOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def sleep(delay: Double): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  trait AttemptContext extends StObject {
    
    def abort(): Unit
    
    var aborted: Boolean
    
    var attemptNum: Double
    
    var attemptsRemaining: Double
  }
  object AttemptContext {
    
    inline def apply(abort: () => Unit, aborted: Boolean, attemptNum: Double, attemptsRemaining: Double): AttemptContext = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted.asInstanceOf[js.Any], attemptNum = attemptNum.asInstanceOf[js.Any], attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttemptContext]
    }
    
    extension [Self <: AttemptContext](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAttemptNum(value: Double): Self = StObject.set(x, "attemptNum", value.asInstanceOf[js.Any])
      
      inline def setAttemptsRemaining(value: Double): Self = StObject.set(x, "attemptsRemaining", value.asInstanceOf[js.Any])
    }
  }
  
  type AttemptFunction[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  
  trait AttemptOptions[T] extends StObject {
    
    val beforeAttempt: BeforeAttempt[T] | Null
    
    val calculateDelay: CalculateDelay[T] | Null
    
    val delay: Double
    
    val factor: Double
    
    val handleError: HandleError[T] | Null
    
    val handleTimeout: HandleTimeout[T] | Null
    
    val initialDelay: Double
    
    val jitter: Boolean
    
    val maxAttempts: Double
    
    val maxDelay: Double
    
    val minDelay: Double
    
    val timeout: Double
  }
  object AttemptOptions {
    
    inline def apply[T](
      delay: Double,
      factor: Double,
      initialDelay: Double,
      jitter: Boolean,
      maxAttempts: Double,
      maxDelay: Double,
      minDelay: Double,
      timeout: Double
    ): AttemptOptions[T] = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], minDelay = minDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], beforeAttempt = null, calculateDelay = null, handleError = null, handleTimeout = null)
      __obj.asInstanceOf[AttemptOptions[T]]
    }
    
    extension [Self <: AttemptOptions[?], T](x: Self & AttemptOptions[T]) {
      
      inline def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "beforeAttempt", js.Any.fromFunction2(value))
      
      inline def setBeforeAttemptNull: Self = StObject.set(x, "beforeAttempt", null)
      
      inline def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = StObject.set(x, "calculateDelay", js.Any.fromFunction2(value))
      
      inline def setCalculateDelayNull: Self = StObject.set(x, "calculateDelay", null)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "handleError", js.Any.fromFunction3(value))
      
      inline def setHandleErrorNull: Self = StObject.set(x, "handleError", null)
      
      inline def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = StObject.set(x, "handleTimeout", js.Any.fromFunction2(value))
      
      inline def setHandleTimeoutNull: Self = StObject.set(x, "handleTimeout", null)
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setJitter(value: Boolean): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMinDelay(value: Double): Self = StObject.set(x, "minDelay", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type BeforeAttempt[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  
  type CalculateDelay[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], Double]
  
  type HandleError[T] = js.Function3[/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T], Unit]
  
  type HandleTimeout[T] = js.Function2[/* context */ AttemptContext, /* options */ AttemptOptions[T], js.Promise[T]]
  
  /* Inlined {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]} */
  trait PartialAttemptOptions[T] extends StObject {
    
    val beforeAttempt: js.UndefOr[BeforeAttempt[T] | Null] = js.undefined
    
    val calculateDelay: js.UndefOr[CalculateDelay[T] | Null] = js.undefined
    
    val delay: js.UndefOr[Double] = js.undefined
    
    val factor: js.UndefOr[Double] = js.undefined
    
    val handleError: js.UndefOr[HandleError[T] | Null] = js.undefined
    
    val handleTimeout: js.UndefOr[HandleTimeout[T] | Null] = js.undefined
    
    val initialDelay: js.UndefOr[Double] = js.undefined
    
    val jitter: js.UndefOr[Boolean] = js.undefined
    
    val maxAttempts: js.UndefOr[Double] = js.undefined
    
    val maxDelay: js.UndefOr[Double] = js.undefined
    
    val minDelay: js.UndefOr[Double] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialAttemptOptions {
    
    inline def apply[T](): PartialAttemptOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAttemptOptions[T]]
    }
    
    extension [Self <: PartialAttemptOptions[?], T](x: Self & PartialAttemptOptions[T]) {
      
      inline def setBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "beforeAttempt", js.Any.fromFunction2(value))
      
      inline def setBeforeAttemptNull: Self = StObject.set(x, "beforeAttempt", null)
      
      inline def setBeforeAttemptUndefined: Self = StObject.set(x, "beforeAttempt", js.undefined)
      
      inline def setCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self = StObject.set(x, "calculateDelay", js.Any.fromFunction2(value))
      
      inline def setCalculateDelayNull: Self = StObject.set(x, "calculateDelay", null)
      
      inline def setCalculateDelayUndefined: Self = StObject.set(x, "calculateDelay", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self = StObject.set(x, "handleError", js.Any.fromFunction3(value))
      
      inline def setHandleErrorNull: Self = StObject.set(x, "handleError", null)
      
      inline def setHandleErrorUndefined: Self = StObject.set(x, "handleError", js.undefined)
      
      inline def setHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self = StObject.set(x, "handleTimeout", js.Any.fromFunction2(value))
      
      inline def setHandleTimeoutNull: Self = StObject.set(x, "handleTimeout", null)
      
      inline def setHandleTimeoutUndefined: Self = StObject.set(x, "handleTimeout", js.undefined)
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setJitter(value: Boolean): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setMinDelay(value: Double): Self = StObject.set(x, "minDelay", value.asInstanceOf[js.Any])
      
      inline def setMinDelayUndefined: Self = StObject.set(x, "minDelay", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
