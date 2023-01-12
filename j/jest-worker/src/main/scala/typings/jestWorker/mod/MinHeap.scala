package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinHeap[TItem /* <: HeapItem */] extends StObject {
  
  /* private */ val _heap: Any
  
  def add(item: TItem): Unit
  
  def peek(): TItem | Null
  
  def poll(): TItem | Null
}
object MinHeap {
  
  inline def apply[TItem /* <: HeapItem */](_heap: Any, add: TItem => Unit, peek: () => TItem | Null, poll: () => TItem | Null): MinHeap[TItem] = {
    val __obj = js.Dynamic.literal(_heap = _heap.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), peek = js.Any.fromFunction0(peek), poll = js.Any.fromFunction0(poll))
    __obj.asInstanceOf[MinHeap[TItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinHeap[?], TItem /* <: HeapItem */] (val x: Self & MinHeap[TItem]) extends AnyVal {
    
    inline def setAdd(value: TItem => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setPeek(value: () => TItem | Null): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    inline def setPoll(value: () => TItem | Null): Self = StObject.set(x, "poll", js.Any.fromFunction0(value))
    
    inline def set_heap(value: Any): Self = StObject.set(x, "_heap", value.asInstanceOf[js.Any])
  }
}
