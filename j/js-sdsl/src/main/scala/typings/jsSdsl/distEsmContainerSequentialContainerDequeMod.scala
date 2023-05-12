package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerSequentialContainerBaseRandomIteratorMod.RandomIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerSequentialContainerDequeMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Deque", JSImport.Default)
  @js.native
  open class default[T] () extends Deque[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, _bucketSize: Double) = this()
    def this(container: initContainer[T], _bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Deque", "DequeIterator")
  @js.native
  open class DequeIterator[T] protected () extends RandomIterator[T] {
    def this(node: Double, container: Deque[T]) = this()
    def this(node: Double, container: Deque[T], iteratorType: IteratorType) = this()
    
    @JSName("container")
    val container_DequeIterator: Deque[T] = js.native
    
    def equals(iter: DequeIterator[T]): Boolean = js.native
  }
  
  @js.native
  trait Deque[T]
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T] {
    
    /**
      * @description Remove all elements after the specified position (excluding the specified position).
      * @param pos - The previous position of the first removed element.
      * @returns The size of the container after cutting.
      * @example
      * deque.cut(1); // Then deque's size will be 2. deque -> [0, 1]
      */
    def cut(pos: Double): Double = js.native
    
    def eraseElementByIterator(iter: DequeIterator[T]): DequeIterator[T] = js.native
    
    /**
      * @description Remove the _first element.
      * @returns The element you popped.
      */
    def popFront(): js.UndefOr[T] = js.native
    
    /**
      * @description Push the element to the front.
      * @param element - The element you want to push.
      * @returns The size of queue after pushing.
      */
    def pushFront(element: T): Double = js.native
    
    /**
      * @description Remove as much useless space as possible.
      */
    def shrinkToFit(): Unit = js.native
  }
}
