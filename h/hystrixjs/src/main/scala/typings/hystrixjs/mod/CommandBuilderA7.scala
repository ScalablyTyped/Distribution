package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  
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
  implicit class CommandBuilderA7Ops[Self <: CommandBuilderA7[_, _, _, _, _, _, _, _], R, T, U, V, W, X, Y, Z] (val x: Self with (CommandBuilderA7[R, T, U, V, W, X, Y, Z])) extends AnyVal {
    
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
    def setBuild(value: () => CommandA7[R, T, U, V, W, X, Y, Z]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self = this.set("fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self = this.set("timeout", js.Any.fromFunction1(value))
  }
}
