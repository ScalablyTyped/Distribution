package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.Base
import typings.jsSdsl.containerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherContainerPriorityQueueMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/PriorityQueue", JSImport.Default)
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
      * @description Adjusting parent's children to suit the nature of the heap.
      * @param parent Parent's index.
      * @private
      */
    /* private */ var adjust: Any = js.native
    
    /* private */ val cmp: Any = js.native
    
    /**
      * @description Removes the top element.
      */
    def pop(): Unit = js.native
    
    /* private */ val priorityQueue: Any = js.native
    
    /**
      * @description Push element into a container in order.
      * @param element The element you want to push.
      */
    def push(element: T): Unit = js.native
    
    /**
      * @description Accesses the top element.
      */
    def top(): js.UndefOr[T] = js.native
  }
}
