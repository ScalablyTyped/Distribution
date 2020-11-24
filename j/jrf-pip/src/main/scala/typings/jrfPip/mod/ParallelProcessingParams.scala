package typings.jrfPip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelProcessingParams[T] extends js.Object {
  
  var arrayValues: js.Array[T] = js.native
  
  var awaitRes: js.UndefOr[Boolean] = js.native
  
  var cb: js.UndefOr[js.Function1[/* stackError */ StackError[T], Unit | js.Promise[Unit]]] = js.native
  
  var cycleTimeout: js.UndefOr[Double] = js.native
  
  var nextValueFn: js.UndefOr[js.Function1[/* params */ NextValueFnParams[T], Boolean | js.Promise[Boolean]]] = js.native
  
  var parallel: js.UndefOr[Double] = js.native
  
  def processingFn(params: ProcessingFnParams[T]): Unit | js.Promise[Unit] = js.native
}
object ParallelProcessingParams {
  
  @scala.inline
  def apply[T](arrayValues: js.Array[T], processingFn: ProcessingFnParams[T] => Unit | js.Promise[Unit]): ParallelProcessingParams[T] = {
    val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], processingFn = js.Any.fromFunction1(processingFn))
    __obj.asInstanceOf[ParallelProcessingParams[T]]
  }
  
  @scala.inline
  implicit class ParallelProcessingParamsOps[Self <: ParallelProcessingParams[_], T] (val x: Self with ParallelProcessingParams[T]) extends AnyVal {
    
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
    def setArrayValuesVarargs(value: T*): Self = this.set("arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setArrayValues(value: js.Array[T]): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingFn(value: ProcessingFnParams[T] => Unit | js.Promise[Unit]): Self = this.set("processingFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAwaitRes(value: Boolean): Self = this.set("awaitRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwaitRes: Self = this.set("awaitRes", js.undefined)
    
    @scala.inline
    def setCb(value: /* stackError */ StackError[T] => Unit | js.Promise[Unit]): Self = this.set("cb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCb: Self = this.set("cb", js.undefined)
    
    @scala.inline
    def setCycleTimeout(value: Double): Self = this.set("cycleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycleTimeout: Self = this.set("cycleTimeout", js.undefined)
    
    @scala.inline
    def setNextValueFn(value: /* params */ NextValueFnParams[T] => Boolean | js.Promise[Boolean]): Self = this.set("nextValueFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNextValueFn: Self = this.set("nextValueFn", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
  }
}
