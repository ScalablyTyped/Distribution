package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerSequentialContainerBaseRandomIteratorMod.RandomIterator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerSequentialContainerVectorMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Vector", JSImport.Default)
  @js.native
  /**
    * @description Vector's constructor.
    * @param container Initialize container, must have a forEach function.
    * @param copy When the container is an array, you can choose to directly operate on the original object of
    *             the array or perform a shallow copy. The default is shallow copy.
    */
  open class default[T] () extends Vector[T] {
    def this(container: initContainer[T]) = this()
    def this(container: Unit, copy: Boolean) = this()
    def this(container: initContainer[T], copy: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Vector", "VectorIterator")
  @js.native
  /* protected */ open class VectorIterator[T] () extends RandomIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
  }
  
  @js.native
  trait Vector[T]
    extends typings.jsSdsl.distEsmContainerSequentialContainerBaseMod.default[T] {
    
    def eraseElementByIterator(iter: VectorIterator[T]): VectorIterator[T] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Vector: js.Function0[Generator[T, Any, Unit]] = js.native
  }
}
