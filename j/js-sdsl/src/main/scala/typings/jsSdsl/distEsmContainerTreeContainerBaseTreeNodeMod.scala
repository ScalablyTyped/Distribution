package typings.jsSdsl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerBaseTreeNodeMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeNode", "TreeNode")
  @js.native
  open class TreeNode[K, V] () extends StObject {
    def this(_key: K) = this()
    def this(_key: K, _value: V) = this()
    def this(_key: Unit, _value: V) = this()
    
    /**
      * @description Get the next node.
      * @return TreeNode about the next node.
      */
    def next(): TreeNode[K, V] = js.native
    
    /**
      * @description Get the pre node.
      * @return TreeNode about the pre node.
      */
    def pre(): TreeNode[K, V] = js.native
    
    /**
      * @description Rotate _left.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateLeft(): TreeNode[K, V] = js.native
    
    /**
      * @description Rotate _right.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateRight(): TreeNode[K, V] = js.native
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeNode", "TreeNodeEnableIndex")
  @js.native
  open class TreeNodeEnableIndex[K, V] () extends TreeNode[K, V] {
    def this(_key: K) = this()
    def this(_key: K, _value: V) = this()
    def this(_key: Unit, _value: V) = this()
    
    def recount(): Unit = js.native
  }
}
