package typings.jsSdsl

import typings.jsSdsl.jsSdslInts.`0`
import typings.jsSdsl.jsSdslInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerBaseTreeNodeMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeNode", "TreeNode")
  @js.native
  open class TreeNode[K, V] () extends StObject {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    def this(key: Unit, value: V) = this()
    def this(key: K, value: V, color: TreeNodeColor) = this()
    def this(key: K, value: Unit, color: TreeNodeColor) = this()
    def this(key: Unit, value: V, color: TreeNodeColor) = this()
    def this(key: Unit, value: Unit, color: TreeNodeColor) = this()
    
    var _color: TreeNodeColor = js.native
    
    var _key: js.UndefOr[K] = js.native
    
    var _left: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Get the next node.
      * @returns TreeNode about the next node.
      */
    def _next(): TreeNode[K, V] = js.native
    
    var _parent: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Get the pre node.
      * @returns TreeNode about the pre node.
      */
    def _pre(): TreeNode[K, V] = js.native
    
    var _right: js.UndefOr[TreeNode[K, V]] = js.native
    
    /**
      * @description Rotate left.
      * @returns TreeNode about moved to original position after rotation.
      */
    def _rotateLeft(): TreeNode[K, V] = js.native
    
    /**
      * @description Rotate right.
      * @returns TreeNode about moved to original position after rotation.
      */
    def _rotateRight(): TreeNode[K, V] = js.native
    
    var _value: js.UndefOr[V] = js.native
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base/TreeNode", "TreeNodeEnableIndex")
  @js.native
  open class TreeNodeEnableIndex[K, V] () extends TreeNode[K, V] {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    def this(key: Unit, value: V) = this()
    def this(key: K, value: V, color: TreeNodeColor) = this()
    def this(key: K, value: Unit, color: TreeNodeColor) = this()
    def this(key: Unit, value: V, color: TreeNodeColor) = this()
    def this(key: Unit, value: Unit, color: TreeNodeColor) = this()
    
    def _recount(): Unit = js.native
    
    var _subTreeSize: Double = js.native
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
