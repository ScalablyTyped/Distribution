package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.ContainerIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTreeIteratorMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeIterator", JSImport.Default)
  @js.native
  abstract class default[K, V] protected () extends TreeIterator[K, V] {
    def this(
      node: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      header: typings.jsSdsl.baseTreeNodeMod.default[K, V]
    ) = this()
    def this(
      node: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      header: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      iteratorType: Boolean
    ) = this()
  }
  
  @js.native
  trait TreeIterator[K, V]
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    def equals(obj: TreeIterator[K, V]): Boolean = js.native
    
    /* protected */ var header: typings.jsSdsl.baseTreeNodeMod.default[K, V] = js.native
    
    /* protected */ @JSName("node")
    var node_TreeIterator: typings.jsSdsl.baseTreeNodeMod.default[K, V] = js.native
  }
}
