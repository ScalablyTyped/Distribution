package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.Base
import typings.jsSdsl.containerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityQueueMod {
  
  @JSImport("js-sdsl/dist/cjs/container/OtherContainer/PriorityQueue", JSImport.Default)
  @js.native
  /**
    * @description PriorityQueue's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param _cmp Compare function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class default[T] () extends PriorityQueue[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: initContainer[T], _cmp: js.Function2[/* x */ T, /* y */ T, Double]) = this()
    def this(container: Unit, _cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: Unit, _cmp: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], _cmp: js.Function2[/* x */ T, /* y */ T, Double], copy: Boolean) = this()
    def this(container: initContainer[T], _cmp: Unit, copy: Boolean) = this()
  }
  
  @js.native
  trait PriorityQueue[T] extends Base {
    
    /**
      * @description Removes the top element.
      */
    def pop(): Unit = js.native
    
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
