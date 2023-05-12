package typings.jsts.global.jsts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("jsts.util.IntArrayList")
  @js.native
  /**
    * Constructs an empty list.
    */
  open class IntArrayList ()
    extends StObject
       with typings.jsts.jsts.util.IntArrayList {
    /**
      * Constructs an empty list with the specified initial capacity
      *
      * @param initialCapacity {integer} the initial capacity of the list
      */
    def this(initialCapacity: Double) = this()
    
    /**
      * Adds a value to the end of this list.
      *
      * @param value {integer} the value to add
      */
    /* CompleteClass */
    override def add(value: Double): Unit = js.native
    
    /**
      * Adds all values in an array to the end of this list.
      *
      * @param values an array of values
      */
    /* CompleteClass */
    override def addAll(values: js.Array[Double]): Unit = js.native
    
    /**
      * Increases the capacity of this list instance, if necessary,
      * to ensure that it can hold at least the number of elements specified by the capacity argument.
      *
      * @param capacity {integer} the desired capacity
      */
    /* CompleteClass */
    override def ensureCapacity(capacity: Double): Unit = js.native
    
    /**
      * Returns the number of values in this list.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    
    /**
      * Returns a int array containing a copy of the values in this list.
      */
    /* CompleteClass */
    override def toArray(): js.Array[Double] = js.native
  }
}
