package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBuilder extends StObject {
  
  def build(): Command
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilder
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilder
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilder
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilder
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilder
  
  def context(value: Any): CommandBuilder
  
  def errorHandler(value: js.Function1[/* error */ Any, Boolean]): CommandBuilder
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[Any]], js.Thenable[Any]]): CommandBuilder
  
  def percentileWindowLength(value: Double): CommandBuilder
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilder
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilder
  
  def run(value: js.Function1[/* repeated */ Any, js.Thenable[Any]]): CommandBuilder
  
  def statisticalWindowLength(value: Double): CommandBuilder
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilder
  
  def timeout(value: Double): CommandBuilder
}
object CommandBuilder {
  
  inline def apply(
    build: () => Command,
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilder,
    circuitBreakerForceClosed: Boolean => CommandBuilder,
    circuitBreakerForceOpened: Boolean => CommandBuilder,
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilder,
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilder,
    context: Any => CommandBuilder,
    errorHandler: js.Function1[/* error */ Any, Boolean] => CommandBuilder,
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[Any]], js.Thenable[Any]] => CommandBuilder,
    percentileWindowLength: Double => CommandBuilder,
    percentileWindowNumberOfBuckets: Double => CommandBuilder,
    requestVolumeRejectionThreshold: Double => CommandBuilder,
    run: js.Function1[/* repeated */ Any, js.Thenable[Any]] => CommandBuilder,
    statisticalWindowLength: Double => CommandBuilder,
    statisticalWindowNumberOfBuckets: Double => CommandBuilder,
    timeout: Double => CommandBuilder
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilder]
  }
  
  extension [Self <: CommandBuilder](x: Self) {
    
    inline def setBuild(value: () => Command): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceClosed(value: Boolean => CommandBuilder): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerForceOpened(value: Boolean => CommandBuilder): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    inline def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => CommandBuilder): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setErrorHandler(value: js.Function1[/* error */ Any, Boolean] => CommandBuilder): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[Any]], js.Thenable[Any]] => CommandBuilder
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowLength(value: Double => CommandBuilder): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    inline def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilder): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setRequestVolumeRejectionThreshold(value: Double => CommandBuilder): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    inline def setRun(value: js.Function1[/* repeated */ Any, js.Thenable[Any]] => CommandBuilder): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowLength(value: Double => CommandBuilder): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    inline def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilder): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: Double => CommandBuilder): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
