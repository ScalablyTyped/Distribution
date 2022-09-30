package typings.hystrixjs.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilderA1[R, T] extends StObject {
  
  def build(): CommandA1[R, T]
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA1[R, T]
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA1[R, T]
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA1[R, T]
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA1[R, T]
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA1[R, T]
  
  def context(value: Any): CommandBuilderA1[R, T]
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilderA1[R, T]
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Array[T], PromiseLike[R]]): CommandBuilderA1[R, T]
  
  def percentileWindowLength(value: Double): CommandBuilderA1[R, T]
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA1[R, T]
  
  def run(value: js.Function1[/* t */ T, PromiseLike[R]]): CommandBuilderA1[R, T]
  
  def statisticalWindowLength(value: Double): CommandBuilderA1[R, T]
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T]
  
  def timeout(value: Double): CommandBuilderA1[R, T]
}
object CommandBuilderA1 {
  
  inline def apply[R, T](
    build: () => CommandA1[R, T],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA1[R, T],
    circuitBreakerForceClosed: Boolean => CommandBuilderA1[R, T],
    circuitBreakerForceOpened: Boolean => CommandBuilderA1[R, T],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA1[R, T],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA1[R, T],
    context: Any => CommandBuilderA1[R, T],
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilderA1[R, T],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Array[T], PromiseLike[R]] => CommandBuilderA1[R, T],
    percentileWindowLength: Double => CommandBuilderA1[R, T],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    requestVolumeRejectionThreshold: Double => CommandBuilderA1[R, T],
    run: js.Function1[/* t */ T, PromiseLike[R]] => CommandBuilderA1[R, T],
    statisticalWindowLength: Double => CommandBuilderA1[R, T],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    timeout: Double => CommandBuilderA1[R, T]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
  
  extension [Self <: CommandBuilderA1[?, ?], R, T](x: Self & (CommandBuilderA1[R, T])) {
    
    inline def setBuild(value: () => CommandA1[R, T]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilderA1[R, T]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilderA1[R, T]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Array[T], PromiseLike[R]] => CommandBuilderA1[R, T]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(value: js.Function1[/* t */ T, PromiseLike[R]] => CommandBuilderA1[R, T]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
