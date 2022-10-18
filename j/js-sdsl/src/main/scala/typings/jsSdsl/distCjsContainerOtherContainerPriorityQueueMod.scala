package typings.jsSdsl

import typings.jsSdsl.distCjsContainerContainerBaseMod.Base
import typings.jsSdsl.distCjsContainerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsContainerOtherContainerPriorityQueueMod {
  
  @JSImport("js-sdsl/dist/cjs/container/OtherContainer/PriorityQueue", JSImport.Default)
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class default[T] () extends PriorityQueue[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], cmp: Unit, copy: Boolean) = this()
  }
  
  @js.native
  trait PriorityQueue[T] extends Base {
    
    /**
      * @description Check if element is in heap.
      * @param item The item want to find.
      * @return Boolean about if element is in heap.
      */
    def find(item: T): Boolean = js.native
    
    /**
      * @description Removes the top element.
      */
    def pop(): Unit = js.native
    
    /**
      * @description Push element into a container in order.
      * @param item The element you want to push.
      */
    def push(item: T): Unit = js.native
    
    /**
      * @description Remove specified item from heap.
      * @param item The item want to remove.
      * @return Boolean about if remove success.
      */
    def remove(item: T): Boolean = js.native
    
    /**
      * @return Return a copy array of heap.
      */
    def toArray(): js.Array[T] = js.native
    
    /**
      * @description Accesses the top element.
      */
    def top(): js.UndefOr[T] = js.native
    
    /**
      * @description Update item and it's pos in the heap.
      * @param item The item want to update.
      * @return Boolean about if update success.
      */
    def updateItem(item: T): Boolean = js.native
  }
}
