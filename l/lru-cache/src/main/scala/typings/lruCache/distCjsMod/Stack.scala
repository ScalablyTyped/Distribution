package typings.lruCache.distCjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  var heap: NumberArray
  
  var length: Double
  
  def pop(): Index
  
  /* private */ var `private`: Any
  
  def push(n: Index): Unit
}
object Stack {
  
  inline def apply(heap: NumberArray, length: Double, pop: () => Index, `private`: Any, push: Index => Unit): Stack = {
    val __obj = js.Dynamic.literal(heap = heap.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push))
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
    
    inline def setHeap(value: NumberArray): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
    
    inline def setHeapVarargs(value: Double*): Self = StObject.set(x, "heap", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPop(value: () => Index): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPrivate(value: Any): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPush(value: Index => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
