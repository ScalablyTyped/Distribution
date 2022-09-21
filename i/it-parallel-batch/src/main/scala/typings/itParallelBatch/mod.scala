package typings.itParallelBatch

import typings.itParallelBatch.itParallelBatchBooleans.`false`
import typings.itParallelBatch.itParallelBatchBooleans.`true`
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @template T
    * @typedef {{ok:true, value:T}} Success
    */
  /**
    * @typedef {{ok:false, err:Error}} Failure
    */
  /**
    * Takes an (async) iterator that emits promise-returning functions,
    * invokes them in parallel and emits the results as they become available but
    * in the same order as the input
    *
    * @template T
    * @param {AsyncIterable<() => Promise<T>>} source
    * @param {number} [size=1]
    * @returns {AsyncIterable<T>}
    */
  inline def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: Double): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("it-parallel-batch/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Failure extends StObject {
    
    var err: js.Error
    
    var ok: `false`
  }
  object Failure {
    
    inline def apply(err: js.Error): Failure = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = false)
      __obj.asInstanceOf[Failure]
    }
    
    extension [Self <: Failure](x: Self) {
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setOk(value: `false`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait Success[T] extends StObject {
    
    var ok: `true`
    
    var value: T
  }
  object Success {
    
    inline def apply[T](value: T): Success[T] = {
      val __obj = js.Dynamic.literal(ok = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success[T]]
    }
    
    extension [Self <: Success[?], T](x: Self & Success[T]) {
      
      inline def setOk(value: `true`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
