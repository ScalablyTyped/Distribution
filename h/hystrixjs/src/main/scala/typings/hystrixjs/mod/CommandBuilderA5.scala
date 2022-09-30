package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilderA5[R, T, U, V, W, X] extends StObject {
  
  def build(): CommandA5[R, T, U, V, W, X]
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA5[R, T, U, V, W, X]
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def context(value: Any): CommandBuilderA5[R, T, U, V, W, X]
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilderA5[R, T, U, V, W, X]
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], PromiseLike[R]]): CommandBuilderA5[R, T, U, V, W, X]
  
  def percentileWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, PromiseLike[R]]): CommandBuilderA5[R, T, U, V, W, X]
  
  def statisticalWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X]
  
  def timeout(value: Double): CommandBuilderA5[R, T, U, V, W, X]
}
object CommandBuilderA5 {
  
  inline def apply[R, T, U, V, W, X](
    build: () => CommandA5[R, T, U, V, W, X],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceClosed: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceOpened: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA5[R, T, U, V, W, X],
    context: Any => CommandBuilderA5[R, T, U, V, W, X],
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], PromiseLike[R]] => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    requestVolumeRejectionThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    run: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, PromiseLike[R]] => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    timeout: Double => CommandBuilderA5[R, T, U, V, W, X]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
  
  extension [Self <: CommandBuilderA5[?, ?, ?, ?, ?, ?], R, T, U, V, W, X](x: Self & (CommandBuilderA5[R, T, U, V, W, X])) {
    
    inline def setBuild(value: () => CommandA5[R, T, U, V, W, X]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], PromiseLike[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(
      value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, PromiseLike[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
