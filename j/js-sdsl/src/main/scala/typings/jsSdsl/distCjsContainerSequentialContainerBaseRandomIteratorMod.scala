package typings.jsSdsl

import typings.jsSdsl.distCjsContainerContainerBaseMod.ContainerIterator
import typings.jsSdsl.distCjsContainerContainerBaseMod.IteratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsContainerSequentialContainerBaseRandomIteratorMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs/container/SequentialContainer/Base/RandomIterator", "RandomIterator")
  @js.native
  /* protected */ open class RandomIterator[T] () extends ContainerIterator[T] {
    /* protected */ def this(iteratorType: IteratorType) = this()
    
    def equals(obj: RandomIterator[T]): Boolean = js.native
  }
}
