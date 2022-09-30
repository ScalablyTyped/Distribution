package typings.jsSdsl

import typings.jsSdsl.baseTreeNodeMod.TreeNode
import typings.jsSdsl.containerContainerBaseMod.ContainerIterator
import typings.jsSdsl.containerContainerBaseMod.IteratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTreeIteratorMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeIterator", JSImport.Default)
  @js.native
  abstract class default[K, V] protected () extends TreeIterator[K, V] {
    def this(_node: TreeNode[K, V], _header: TreeNode[K, V]) = this()
    def this(_node: TreeNode[K, V], _header: TreeNode[K, V], iteratorType: IteratorType) = this()
  }
  
  @js.native
  trait TreeIterator[K, V]
    extends ContainerIterator[K | (js.Tuple2[K, V])] {
    
    def equals(obj: TreeIterator[K, V]): Boolean = js.native
    
    def index: Double = js.native
  }
}
