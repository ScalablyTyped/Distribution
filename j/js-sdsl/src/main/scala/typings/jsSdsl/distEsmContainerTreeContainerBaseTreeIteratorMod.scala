package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.ContainerIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerBaseTreeIteratorMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeIterator", JSImport.Default)
  @js.native
  open class default[K, V] () extends TreeIterator[K, V]
  
  @js.native
  trait TreeIterator[K, V]
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    @JSName("container")
    val container_TreeIterator: typings.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, V] = js.native
    
    /**
      * @description Get the sequential index of the iterator in the tree container.<br/>
      *              <strong>Note:</strong>
      *              This function only takes effect when the specified tree container `enableIndex = true`.
      * @returns The index subscript of the node in the tree.
      * @example
      * const st = new OrderedSet([1, 2, 3], true);
      * console.log(st.begin().next().index);  // 1
      */
    def index: Double = js.native
  }
}
