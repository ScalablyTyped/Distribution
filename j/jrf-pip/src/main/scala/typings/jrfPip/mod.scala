package typings.jrfPip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jrf-pip", JSImport.Namespace)
  @js.native
  def apply[T](params: ParallelProcessingParams[T]): js.UndefOr[js.Promise[js.Array[StackError[T]]]] = js.native
  
  @js.native
  trait NextValueFnParams[T] extends StObject {
    
    var arrayValues: js.Array[T] = js.native
    
    var index: Double = js.native
    
    var iteration: Double = js.native
    
    var value: T = js.native
  }
  object NextValueFnParams {
    
    @scala.inline
    def apply[T](arrayValues: js.Array[T], index: Double, iteration: Double, value: T): NextValueFnParams[T] = {
      val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextValueFnParams[T]]
    }
    
    @scala.inline
    implicit class NextValueFnParamsMutableBuilder[Self <: NextValueFnParams[_], T] (val x: Self with NextValueFnParams[T]) extends AnyVal {
      
      @scala.inline
      def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParallelProcessingParams[T] extends StObject {
    
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
    implicit class ParallelProcessingParamsMutableBuilder[Self <: ParallelProcessingParams[_], T] (val x: Self with ParallelProcessingParams[T]) extends AnyVal {
      
      @scala.inline
      def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
      
      @scala.inline
      def setAwaitRes(value: Boolean): Self = StObject.set(x, "awaitRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitResUndefined: Self = StObject.set(x, "awaitRes", js.undefined)
      
      @scala.inline
      def setCb(value: /* stackError */ StackError[T] => Unit | js.Promise[Unit]): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      @scala.inline
      def setCycleTimeout(value: Double): Self = StObject.set(x, "cycleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleTimeoutUndefined: Self = StObject.set(x, "cycleTimeout", js.undefined)
      
      @scala.inline
      def setNextValueFn(value: /* params */ NextValueFnParams[T] => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "nextValueFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextValueFnUndefined: Self = StObject.set(x, "nextValueFn", js.undefined)
      
      @scala.inline
      def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setProcessingFn(value: ProcessingFnParams[T] => Unit | js.Promise[Unit]): Self = StObject.set(x, "processingFn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ProcessingFnParams[T] extends StObject {
    
    var arrayValues: js.Array[T] = js.native
    
    var index: Double = js.native
    
    var iteration: Double = js.native
    
    var value: T = js.native
  }
  object ProcessingFnParams {
    
    @scala.inline
    def apply[T](arrayValues: js.Array[T], index: Double, iteration: Double, value: T): ProcessingFnParams[T] = {
      val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessingFnParams[T]]
    }
    
    @scala.inline
    implicit class ProcessingFnParamsMutableBuilder[Self <: ProcessingFnParams[_], T] (val x: Self with ProcessingFnParams[T]) extends AnyVal {
      
      @scala.inline
      def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackError[T] extends StObject {
    
    var error: js.Any = js.native
    
    var index: Double = js.native
    
    var iteration: Double = js.native
    
    var value: T = js.native
  }
  object StackError {
    
    @scala.inline
    def apply[T](error: js.Any, index: Double, iteration: Double, value: T): StackError[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackError[T]]
    }
    
    @scala.inline
    implicit class StackErrorMutableBuilder[Self <: StackError[_], T] (val x: Self with StackError[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
