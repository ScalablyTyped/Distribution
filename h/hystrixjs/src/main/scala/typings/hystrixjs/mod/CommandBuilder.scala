package typings.hystrixjs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilder extends StObject {
  
  def build(): Command = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilder = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilder = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilder = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilder = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilder = js.native
  
  def context(value: js.Any): CommandBuilder = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilder = js.native
  
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]]): CommandBuilder = js.native
  
  def percentileWindowLength(value: Double): CommandBuilder = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilder = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilder = js.native
  
  def run(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): CommandBuilder = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilder = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilder = js.native
  
  def timeout(value: Double): CommandBuilder = js.native
}
object CommandBuilder {
  
  @scala.inline
  def apply(
    build: () => Command,
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilder,
    circuitBreakerForceClosed: Boolean => CommandBuilder,
    circuitBreakerForceOpened: Boolean => CommandBuilder,
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilder,
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilder,
    context: js.Any => CommandBuilder,
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder,
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder,
    percentileWindowLength: Double => CommandBuilder,
    percentileWindowNumberOfBuckets: Double => CommandBuilder,
    requestVolumeRejectionThreshold: Double => CommandBuilder,
    run: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder,
    statisticalWindowLength: Double => CommandBuilder,
    statisticalWindowNumberOfBuckets: Double => CommandBuilder,
    timeout: Double => CommandBuilder
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilder]
  }
  
  @scala.inline
  implicit class CommandBuilderMutableBuilder[Self <: CommandBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => Command): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilder): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilder): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilder): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilder): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilder): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilder): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilder): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilder): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilder): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilder): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
