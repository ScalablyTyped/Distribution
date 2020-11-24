package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  
  def build(): CommandA6[R, T, U, V, W, X, Y] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  
  def timeout(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
}
object CommandBuilderA6 {
  
  @scala.inline
  def apply[R, T, U, V, W, X, Y](
    build: () => CommandA6[R, T, U, V, W, X, Y],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceClosed: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceOpened: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    context: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    requestVolumeRejectionThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    timeout: Double => CommandBuilderA6[R, T, U, V, W, X, Y]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
  
  @scala.inline
  implicit class CommandBuilderA6Ops[Self <: CommandBuilderA6[_, _, _, _, _, _, _], R, T, U, V, W, X, Y] (val x: Self with (CommandBuilderA6[R, T, U, V, W, X, Y])) extends AnyVal {
    
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
    def setBuild(value: () => CommandA6[R, T, U, V, W, X, Y]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self = this.set("fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self = this.set("timeout", js.Any.fromFunction1(value))
  }
}
