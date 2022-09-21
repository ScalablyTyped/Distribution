package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.ContainerIterator
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
      iteratorType: Boolean
    ) = this()
    
    def equals(obj: RandomIterator[T]): Boolean = js.native
    
    /* protected */ def getElementByPos(pos: Double): T = js.native
    
    /* protected */ @JSName("node")
    var node_RandomIterator: Double = js.native
    
    /* protected */ def setElementByPos(pos: Double, element: T): Unit = js.native
    
    /* protected */ def size(): Double = js.native
  }
}
