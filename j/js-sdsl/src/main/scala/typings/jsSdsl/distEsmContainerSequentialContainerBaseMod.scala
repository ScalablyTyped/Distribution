package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerSequentialContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Base", JSImport.Default)
  @js.native
  open class default[T] () extends SequentialContainer[T]
  
  @js.native
  trait SequentialContainer[T] extends Container[T] {
    
    /**
      * @description Removes the elements of the specified value.
      * @param value The value you want to remove.
      * @example container.eraseElementByValue(-1);
      */
    def eraseElementByValue(value: T): Unit = js.native
    
    /**
      * @description Insert several elements after the specified position.
      * @param pos The position you want to insert.
      * @param element The element you want to insert.
      * @param num The number of elements you want to insert (default 1).
      * @example
      * const container = new Vector([1, 2, 3]);
      * container.insert(1, 4);  // [1, 4, 2, 3]
      * container.insert(1, 5, 3); // [1, 5, 5, 5, 4, 2, 3]
      */
    def insert(pos: Double, element: T): Unit = js.native
    def insert(pos: Double, element: T, num: Double): Unit = js.native
    
    /**
      * @description Removes the last element.
      */
    def popBack(): Unit = js.native
    
    /**
      * @description Push the element to the back.
      * @param element The element you want to push.
      */
    def pushBack(element: T): Unit = js.native
    
    /**
      * @description Reverses the container.
      * @example
      * const container = new Vector([1, 2, 3]);
      * container.reverse(); // [3, 2, 1]
      */
    def reverse(): Unit = js.native
    
    /**
      * @description Sets element by position.
      * @param pos The position you want to change.
      * @param element The element's value you want to update.
      * @example container.setElementByPos(-1, 1); // throw a RangeError
      */
    def setElementByPos(pos: Double, element: T): Unit = js.native
    
    /**
      * @description Sort the container.
      * @param cmp Comparison function.
      * @example
      * const container = new Vector([3, 1, 10]);
      * container.sort();  // [1, 10, 3]
      * container.sort((x, y) => x - y); // [1, 3, 10]
      */
    def sort(): Unit = js.native
    def sort(cmp: js.Function2[/* x */ T, /* y */ T, Double]): Unit = js.native
    
    /**
      * @description Removes the duplication of elements in the container.
      * @example
      * const container = new Vector([1, 1, 3, 2, 2, 5, 5, 2]);
      * container.unique(); // [1, 3, 2, 5, 2]
      */
    def unique(): Unit = js.native
  }
}
