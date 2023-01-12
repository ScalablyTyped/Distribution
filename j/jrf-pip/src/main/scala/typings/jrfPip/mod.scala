package typings.jrfPip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](params: ParallelProcessingParams[T]): js.UndefOr[js.Promise[js.Array[StackError[T]]]] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.Array[StackError[T]]]]]
  
  @JSImport("jrf-pip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait NextValueFnParams[T] extends StObject {
    
    var arrayValues: js.Array[T]
    
    var index: Double
    
    var iteration: Double
    
    var value: T
  }
  object NextValueFnParams {
    
    inline def apply[T](arrayValues: js.Array[T], index: Double, iteration: Double, value: T): NextValueFnParams[T] = {
      val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextValueFnParams[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextValueFnParams[?], T] (val x: Self & NextValueFnParams[T]) extends AnyVal {
      
      inline def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      inline def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParallelProcessingParams[T] extends StObject {
    
    var arrayValues: js.Array[T]
    
    var awaitRes: js.UndefOr[Boolean] = js.undefined
    
    var cb: js.UndefOr[js.Function1[/* stackError */ StackError[T], Unit | js.Promise[Unit]]] = js.undefined
    
    var cycleTimeout: js.UndefOr[Double] = js.undefined
    
    var nextValueFn: js.UndefOr[js.Function1[/* params */ NextValueFnParams[T], Boolean | js.Promise[Boolean]]] = js.undefined
    
    var parallel: js.UndefOr[Double] = js.undefined
    
    def processingFn(params: ProcessingFnParams[T]): Unit | js.Promise[Unit]
  }
  object ParallelProcessingParams {
    
    inline def apply[T](arrayValues: js.Array[T], processingFn: ProcessingFnParams[T] => Unit | js.Promise[Unit]): ParallelProcessingParams[T] = {
      val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], processingFn = js.Any.fromFunction1(processingFn))
      __obj.asInstanceOf[ParallelProcessingParams[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParallelProcessingParams[?], T] (val x: Self & ParallelProcessingParams[T]) extends AnyVal {
      
      inline def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      inline def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value*))
      
      inline def setAwaitRes(value: Boolean): Self = StObject.set(x, "awaitRes", value.asInstanceOf[js.Any])
      
      inline def setAwaitResUndefined: Self = StObject.set(x, "awaitRes", js.undefined)
      
      inline def setCb(value: /* stackError */ StackError[T] => Unit | js.Promise[Unit]): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      inline def setCycleTimeout(value: Double): Self = StObject.set(x, "cycleTimeout", value.asInstanceOf[js.Any])
      
      inline def setCycleTimeoutUndefined: Self = StObject.set(x, "cycleTimeout", js.undefined)
      
      inline def setNextValueFn(value: /* params */ NextValueFnParams[T] => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "nextValueFn", js.Any.fromFunction1(value))
      
      inline def setNextValueFnUndefined: Self = StObject.set(x, "nextValueFn", js.undefined)
      
      inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setProcessingFn(value: ProcessingFnParams[T] => Unit | js.Promise[Unit]): Self = StObject.set(x, "processingFn", js.Any.fromFunction1(value))
    }
  }
  
  trait ProcessingFnParams[T] extends StObject {
    
    var arrayValues: js.Array[T]
    
    var index: Double
    
    var iteration: Double
    
    var value: T
  }
  object ProcessingFnParams {
    
    inline def apply[T](arrayValues: js.Array[T], index: Double, iteration: Double, value: T): ProcessingFnParams[T] = {
      val __obj = js.Dynamic.literal(arrayValues = arrayValues.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessingFnParams[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessingFnParams[?], T] (val x: Self & ProcessingFnParams[T]) extends AnyVal {
      
      inline def setArrayValues(value: js.Array[T]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
      
      inline def setArrayValuesVarargs(value: T*): Self = StObject.set(x, "arrayValues", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackError[T] extends StObject {
    
    var error: Any
    
    var index: Double
    
    var iteration: Double
    
    var value: T
  }
  object StackError {
    
    inline def apply[T](error: Any, index: Double, iteration: Double, value: T): StackError[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackError[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackError[?], T] (val x: Self & StackError[T]) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
