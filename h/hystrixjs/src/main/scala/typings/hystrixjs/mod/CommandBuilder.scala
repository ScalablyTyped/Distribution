package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilder extends js.Object {
  
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
  implicit class CommandBuilderOps[Self <: CommandBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => Command): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilder): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilder): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilder): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilder): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilder): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilder): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder
    ): Self = this.set("fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilder): Self = this.set("percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilder): Self = this.set("percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilder): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilder): Self = this.set("statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilder): Self = this.set("statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilder): Self = this.set("timeout", js.Any.fromFunction1(value))
  }
}
