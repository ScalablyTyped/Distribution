package typings.jsts.jsts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  trait IntArrayList extends StObject {
    
    /**
      * Adds a value to the end of this list.
      *
      * @param value {integer} the value to add
      */
    def add(value: Double): Unit
    
    /**
      * Adds all values in an array to the end of this list.
      *
      * @param values an array of values
      */
    def addAll(values: js.Array[Double]): Unit
    
    /**
      * Increases the capacity of this list instance, if necessary,
      * to ensure that it can hold at least the number of elements specified by the capacity argument.
      *
      * @param capacity {integer} the desired capacity
      */
    def ensureCapacity(capacity: Double): Unit
    
    /**
      * Returns the number of values in this list.
      */
    def size(): Double
    
    /**
      * Returns a int array containing a copy of the values in this list.
      */
    def toArray(): js.Array[Double]
  }
  object IntArrayList {
    
    inline def apply(
      add: Double => Unit,
      addAll: js.Array[Double] => Unit,
      ensureCapacity: Double => Unit,
      size: () => Double,
      toArray: () => js.Array[Double]
    ): IntArrayList = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), ensureCapacity = js.Any.fromFunction1(ensureCapacity), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[IntArrayList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntArrayList] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Double => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddAll(value: js.Array[Double] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      inline def setEnsureCapacity(value: Double => Unit): Self = StObject.set(x, "ensureCapacity", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setToArray(value: () => js.Array[Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
}
