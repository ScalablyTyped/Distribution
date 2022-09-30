package typings.jsSdsl

import typings.jsSdsl.jsSdslInts.`0`
import typings.jsSdsl.jsSdslInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeNode", "TreeNode")
  @js.native
  open class TreeNode[K, V] () extends StObject {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    def this(key: Unit, value: V) = this()
    
    var color: TreeNodeColor = js.native
    
    var key: js.UndefOr[K] = js.native
    
    var left: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Get the next node.
      * @return TreeNode about the next node.
      */
    def next(): TreeNode[K, V] = js.native
    
    var parent: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Get the pre node.
      * @return TreeNode about the pre node.
      */
    def pre(): TreeNode[K, V] = js.native
    
    var right: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Rotate left.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateLeft(): TreeNode[K, V] = js.native
    
    /**
      * @description Rotate right.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateRight(): TreeNode[K, V] = js.native
    
    var value: js.UndefOr[V] = js.native
  }
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeNode", "TreeNodeEnableIndex")
  @js.native
  open class TreeNodeEnableIndex[K, V] () extends TreeNode[K, V] {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    def this(key: Unit, value: V) = this()
    
    @JSName("left")
    var left_TreeNodeEnableIndex: js.UndefOr[TreeNodeEnableIndex[K, V]] = js.native
    
    @JSName("parent")
    var parent_TreeNodeEnableIndex: js.UndefOr[TreeNodeEnableIndex[K, V]] = js.native
    
    def recount(): Unit = js.native
    
    @JSName("right")
    var right_TreeNodeEnableIndex: js.UndefOr[TreeNodeEnableIndex[K, V]] = js.native
    
    var subTreeSize: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsSdsl.jsSdslInts.`1`
    - typings.jsSdsl.jsSdslInts.`0`
  */
  trait TreeNodeColor extends StObject
  object TreeNodeColor {
    
    inline def BLACK: `0` = 0.asInstanceOf[`0`]
    
    inline def RED: `1` = 1.asInstanceOf[`1`]
  }
}
