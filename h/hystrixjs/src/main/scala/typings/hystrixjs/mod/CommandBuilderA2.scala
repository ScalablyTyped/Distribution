package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilderA2[R, T, U] extends StObject {
  
  def build(): CommandA2[R, T, U]
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA2[R, T, U]
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA2[R, T, U]
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA2[R, T, U]
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA2[R, T, U]
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA2[R, T, U]
  
  def context(value: Any): CommandBuilderA2[R, T, U]
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilderA2[R, T, U]
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], PromiseLike[R]]): CommandBuilderA2[R, T, U]
  
  def percentileWindowLength(value: Double): CommandBuilderA2[R, T, U]
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA2[R, T, U]
  
  def run(value: js.Function2[/* t */ T, /* u */ U, PromiseLike[R]]): CommandBuilderA2[R, T, U]
  
  def statisticalWindowLength(value: Double): CommandBuilderA2[R, T, U]
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U]
  
  def timeout(value: Double): CommandBuilderA2[R, T, U]
}
object CommandBuilderA2 {
  
  inline def apply[R, T, U](
    build: () => CommandA2[R, T, U],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA2[R, T, U],
    circuitBreakerForceClosed: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerForceOpened: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA2[R, T, U],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA2[R, T, U],
    context: Any => CommandBuilderA2[R, T, U],
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilderA2[R, T, U],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], PromiseLike[R]] => CommandBuilderA2[R, T, U],
    percentileWindowLength: Double => CommandBuilderA2[R, T, U],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    requestVolumeRejectionThreshold: Double => CommandBuilderA2[R, T, U],
    run: js.Function2[/* t */ T, /* u */ U, PromiseLike[R]] => CommandBuilderA2[R, T, U],
    statisticalWindowLength: Double => CommandBuilderA2[R, T, U],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    timeout: Double => CommandBuilderA2[R, T, U]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
  
  extension [Self <: CommandBuilderA2[?, ?, ?], R, T, U](x: Self & (CommandBuilderA2[R, T, U])) {
    
    inline def setBuild(value: () => CommandA2[R, T, U]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], PromiseLike[R]] => CommandBuilderA2[R, T, U]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(value: js.Function2[/* t */ T, /* u */ U, PromiseLike[R]] => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
