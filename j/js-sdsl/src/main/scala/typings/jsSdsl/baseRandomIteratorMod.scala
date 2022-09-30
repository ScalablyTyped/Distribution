package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.ContainerIterator
import typings.jsSdsl.containerContainerBaseMod.IteratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseRandomIteratorMod {
  
  @JSImport("js-sdsl/dist/esm/container/SequentialContainer/Base/RandomIterator", "RandomIterator")
  @js.native
  abstract class RandomIterator[T] protected () extends ContainerIterator[T] {
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
      iteratorType: IteratorType
    ) = this()
    
    def equals(obj: RandomIterator[T]): Boolean = js.native
  }
}
