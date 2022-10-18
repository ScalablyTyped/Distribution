package typings.jsSdsl

import typings.jsSdsl.distCjsContainerContainerBaseMod.ContainerIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsContainerTreeContainerBaseTreeIteratorMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeIterator", JSImport.Default)
  @js.native
  open class default[K, V] () extends TreeIterator[K, V]
  
  @js.native
  trait TreeIterator[K, V]
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    def equals(obj: TreeIterator[K, V]): Boolean = js.native
    
    /**
      * @description Get the sequential index of the iterator in the tree container.<br/>
      *              <strong>
      *                Note:
      *              </strong>
      *              This function only takes effect when the specified tree container `enableIndex = true`.
      */
    def index: Double = js.native
  }
}
