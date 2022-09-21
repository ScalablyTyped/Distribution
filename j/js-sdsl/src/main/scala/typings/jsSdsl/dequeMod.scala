package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.initContainer
import typings.jsSdsl.randomIteratorMod.RandomIterator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dequeMod {
  
  @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/Deque", JSImport.Default)
  @js.native
  open class default[T] () extends Deque[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, bucketSize: Double) = this()
    def this(container: initContainer[T], bucketSize: Double) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/Deque", "DequeIterator")
  @js.native
  open class DequeIterator[T] protected () extends RandomIterator[T] {
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit]
    ) = this()
    def this(
      index: Double,
      size: js.Function0[Double],
      getElementByPos: js.Function1[/* pos */ Double, T],
      setElementByPos: js.Function2[/* pos */ Double, /* element */ T, Unit],
      iteratorType: Boolean
    ) = this()
  }
  
  @js.native
  trait Deque[T]
    extends typings.jsSdsl.sequentialContainerBaseMod.default[T] {
    
    /* private */ var bucketNum: Any = js.native
    
    /* private */ val bucketSize: Any = js.native
    
    /* private */ var curFirst: Any = js.native
    
    /* private */ var curLast: Any = js.native
    
    /**
      * @description Remove all elements after the specified position (excluding the specified position).
      * @param pos The previous position of the first removed element.
      * @example deque.cut(1); // Then deque's size will be 2. deque -> [0, 1]
      */
    def cut(pos: Double): Unit = js.native
    
    def eraseElementByIterator(iter: DequeIterator[T]): DequeIterator[T] = js.native
    
    /* private */ var first: Any = js.native
    
    /**
      * @description Get the bucket position of the element and the pointer position by index.
      * @param pos The element's index.
      * @private
      */
    /* private */ var getElementIndex: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Deque: js.Function0[Generator[T, Unit, Any]] = js.native
    
    /* private */ var last: Any = js.native
    
    /* private */ var map: Any = js.native
    
    /**
      * @description Remove the first element.
      */
    def popFront(): Unit = js.native
    
    /**
      * @description Push the element to the front.
      * @param element The element you want to push.
      */
    def pushFront(element: T): Unit = js.native
    
    /**
      * @description Growth the Deque.
      * @private
      */
    /* private */ var reAllocate: Any = js.native
    
    /**
      * @description Remove as much useless space as possible.
      */
    def shrinkToFit(): Unit = js.native
  }
}
