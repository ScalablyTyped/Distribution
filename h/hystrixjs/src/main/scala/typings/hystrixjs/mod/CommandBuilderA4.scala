package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  
  def build(): CommandA4[R, T, U, V, W] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  
  def timeout(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
}
object CommandBuilderA4 {
  
  @scala.inline
  def apply[R, T, U, V, W](
    build: () => CommandA4[R, T, U, V, W],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceClosed: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceOpened: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA4[R, T, U, V, W],
    context: js.Any => CommandBuilderA4[R, T, U, V, W],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA4[R, T, U, V, W],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    percentileWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    requestVolumeRejectionThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    run: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    timeout: Double => CommandBuilderA4[R, T, U, V, W]
  ): CommandBuilderA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
  
  @scala.inline
  implicit class CommandBuilderA4Ops[Self <: CommandBuilderA4[_, _, _, _, _], R, T, U, V, W] (val x: Self with (CommandBuilderA4[R, T, U, V, W])) extends AnyVal {
    
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
    def setBuild(value: () => CommandA4[R, T, U, V, W]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA4[R, T, U, V, W]): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA4[R, T, U, V, W]): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA4[R, T, U, V, W]): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA4[R, T, U, V, W]): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W]
    ): Self = this.set("fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W]
    ): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA4[R, T, U, V, W]): Self = this.set("timeout", js.Any.fromFunction1(value))
  }
}
