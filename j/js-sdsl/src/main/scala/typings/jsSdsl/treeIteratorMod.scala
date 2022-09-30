package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.ContainerIterator
import typings.jsSdsl.containerBaseMod.IteratorType
import typings.jsSdsl.treeNodeMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeIteratorMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeIterator", JSImport.Default)
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
