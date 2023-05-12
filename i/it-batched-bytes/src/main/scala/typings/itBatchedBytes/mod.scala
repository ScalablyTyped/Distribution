package typings.itBatchedBytes

import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-batched-bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[js.typedarray.Uint8Array | Uint8ArrayList]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default(source: js.Iterable[js.typedarray.Uint8Array | Uint8ArrayList], options: AsyncBatchedBytesOptions): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default(source: js.Iterable[js.typedarray.Uint8Array | Uint8ArrayList], options: BatchedBytesOptions): js.Iterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[js.typedarray.Uint8Array]]
  inline def default(source: AsyncIterable[js.typedarray.Uint8Array | Uint8ArrayList]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default(
    source: AsyncIterable[js.typedarray.Uint8Array | Uint8ArrayList],
    options: AsyncBatchedBytesOptions
  ): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default[T](source: js.Iterable[T], options: AsyncBatchedObjectsOptions[T]): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default[T](source: js.Iterable[T], options: BatchedObjectsOptions[T]): js.Iterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[js.typedarray.Uint8Array]]
  inline def default[T](source: AsyncIterable[T], options: AsyncBatchedObjectsOptions[T]): AsyncIterable[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  /**
    * Takes a stream of Uint8Arrays and/or Uint8ArrayLists and store them in
    * an internal buffer. Either once the buffer reaches the requested size
    * or the next event loop tick occurs, yield any bytes from the buffer.
    */
  inline def default_Iterable(source: js.Iterable[js.typedarray.Uint8Array | Uint8ArrayList]): js.Iterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[js.typedarray.Uint8Array]]
  
  inline def default_T[T](source: js.Iterable[T]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  inline def default_T[T](source: AsyncIterable[T]): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  inline def default_T_Iterable[T](source: js.Iterable[T]): js.Iterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[js.typedarray.Uint8Array]]
  
  trait AsyncBatchedBytesOptions
    extends StObject
       with BatchedBytesOptions {
    
    /**
      * If this amount of time passes, yield all the bytes in the batch even
      * if they are below `size` (default: 0 - e.g. on every tick)
      */
    var yieldAfter: js.UndefOr[Double] = js.undefined
  }
  object AsyncBatchedBytesOptions {
    
    inline def apply(): AsyncBatchedBytesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncBatchedBytesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncBatchedBytesOptions] (val x: Self) extends AnyVal {
      
      inline def setYieldAfter(value: Double): Self = StObject.set(x, "yieldAfter", value.asInstanceOf[js.Any])
      
      inline def setYieldAfterUndefined: Self = StObject.set(x, "yieldAfter", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.itBatchedBytes.mod.BatchedBytesOptions because Already inherited
  - typings.itBatchedBytes.mod.BatchedObjectsOptions because var conflicts: size. Inlined serialize */ trait AsyncBatchedObjectsOptions[T]
    extends StObject
       with AsyncBatchedBytesOptions {
    
    /**
      * This function should serialize the object and append the
      * result to the passed list
      */
    def serialize(`object`: T, list: Uint8ArrayList): Unit
  }
  object AsyncBatchedObjectsOptions {
    
    inline def apply[T](serialize: (T, Uint8ArrayList) => Unit): AsyncBatchedObjectsOptions[T] = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[AsyncBatchedObjectsOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncBatchedObjectsOptions[?], T] (val x: Self & AsyncBatchedObjectsOptions[T]) extends AnyVal {
      
      inline def setSerialize(value: (T, Uint8ArrayList) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    }
  }
  
  trait BatchedBytesOptions extends StObject {
    
    /**
      * The minimum number of bytes that should be in a batch (default: 1MB)
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object BatchedBytesOptions {
    
    inline def apply(): BatchedBytesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchedBytesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchedBytesOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait BatchedObjectsOptions[T]
    extends StObject
       with BatchedBytesOptions {
    
    /**
      * This function should serialize the object and append the
      * result to the passed list
      */
    def serialize(`object`: T, list: Uint8ArrayList): Unit
  }
  object BatchedObjectsOptions {
    
    inline def apply[T](serialize: (T, Uint8ArrayList) => Unit): BatchedObjectsOptions[T] = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[BatchedObjectsOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchedObjectsOptions[?], T] (val x: Self & BatchedObjectsOptions[T]) extends AnyVal {
      
      inline def setSerialize(value: (T, Uint8ArrayList) => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    }
  }
}
