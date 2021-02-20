package typings.hystrixjs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends StObject {
  
  def build(): CommandA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  
  def timeout(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
}
object CommandBuilderA7 {
  
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](
    build: () => CommandA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceClosed: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceOpened: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    context: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    requestVolumeRejectionThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    run: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    timeout: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  }
  
  @scala.inline
  implicit class CommandBuilderA7MutableBuilder[Self <: CommandBuilderA7[_, _, _, _, _, _, _, _], R, T, U, V, W, X, Y, Z] (val x: Self with (CommandBuilderA7[R, T, U, V, W, X, Y, Z])) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => CommandA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
