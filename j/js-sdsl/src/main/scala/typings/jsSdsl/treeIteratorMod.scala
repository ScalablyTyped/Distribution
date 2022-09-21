package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.ContainerIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeIteratorMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeIterator", JSImport.Default)
  @js.native
  abstract class default[K, V] protected () extends TreeIterator[K, V] {
    def this(node: typings.jsSdsl.treeNodeMod.default[K, V], header: typings.jsSdsl.treeNodeMod.default[K, V]) = this()
    def this(
      node: typings.jsSdsl.treeNodeMod.default[K, V],
      header: typings.jsSdsl.treeNodeMod.default[K, V],
      iteratorType: Boolean
    ) = this()
  }
  
  @js.native
  trait TreeIterator[K, V]
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    def equals(obj: TreeIterator[K, V]): Boolean = js.native
    
    /* protected */ var header: typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ @JSName("node")
    var node_TreeIterator: typings.jsSdsl.treeNodeMod.default[K, V] = js.native
  }
}
