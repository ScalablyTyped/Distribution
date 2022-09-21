package typings.itBatch

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T]): AsyncIterable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.Array[T]]]
  inline def apply[T](source: js.Iterable[T], size: Double): AsyncIterable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Array[T]]]
  /**
    * Takes an (async) iterable that emits things and returns an async iterable that
    * emits those things in fixed-sized batches.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {number} [size=1]
    * @returns {AsyncIterable<T[]>}
    */
  inline def apply[T](source: AsyncIterable[T]): AsyncIterable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.Array[T]]]
  inline def apply[T](source: AsyncIterable[T], size: Double): AsyncIterable[js.Array[T]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Array[T]]]
  
  @JSImport("it-batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
