package typings.jsSdsl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeNode", JSImport.Default)
  @js.native
  open class default[K, V] ()
    extends StObject
       with TreeNode[K, V] {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    def this(key: Unit, value: V) = this()
    
    /* CompleteClass */
    var color: Boolean = js.native
    
    /**
      * @description Get the next node.
      * @return TreeNode about the next node.
      */
    /* CompleteClass */
    override def next(): TreeNode[K, V] = js.native
    
    /**
      * @description Get the pre node.
      * @return TreeNode about the pre node.
      */
    /* CompleteClass */
    override def pre(): TreeNode[K, V] = js.native
    
    /**
      * @description Remove this.
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /**
      * @description Rotate left.
      * @return TreeNode about moved to original position after rotation.
      */
    /* CompleteClass */
    override def rotateLeft(): TreeNode[K, V] = js.native
    
    /**
      * @description Rotate left.
      * @return TreeNode about moved to original position after rotation.
      */
    /* CompleteClass */
    override def rotateRight(): TreeNode[K, V] = js.native
  }
  object default {
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeNode", "default.BLACK")
    @js.native
    val BLACK: /* false */ Boolean = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base/TreeNode", "default.RED")
    @js.native
    val RED: /* true */ Boolean = js.native
  }
  
  trait TreeNode[K, V] extends StObject {
    
    var color: Boolean
    
    var key: js.UndefOr[K] = js.undefined
    
    var left: js.UndefOr[TreeNode[K, V]] = js.undefined
    
    /**
      * @description Get the next node.
      * @return TreeNode about the next node.
      */
    def next(): TreeNode[K, V]
    
    var parent: js.UndefOr[TreeNode[K, V]] = js.undefined
    
    /**
      * @description Get the pre node.
      * @return TreeNode about the pre node.
      */
    def pre(): TreeNode[K, V]
    
    /**
      * @description Remove this.
      */
    def remove(): Unit
    
    var right: js.UndefOr[TreeNode[K, V]] = js.undefined
    
    /**
      * @description Rotate left.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateLeft(): TreeNode[K, V]
    
    /**
      * @description Rotate left.
      * @return TreeNode about moved to original position after rotation.
      */
    def rotateRight(): TreeNode[K, V]
    
    var value: js.UndefOr[V] = js.undefined
  }
  object TreeNode {
    
    inline def apply[K, V](
      color: Boolean,
      next: () => TreeNode[K, V],
      pre: () => TreeNode[K, V],
      remove: () => Unit,
      rotateLeft: () => TreeNode[K, V],
      rotateRight: () => TreeNode[K, V]
    ): TreeNode[K, V] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), pre = js.Any.fromFunction0(pre), remove = js.Any.fromFunction0(remove), rotateLeft = js.Any.fromFunction0(rotateLeft), rotateRight = js.Any.fromFunction0(rotateRight))
      __obj.asInstanceOf[TreeNode[K, V]]
    }
    
    extension [Self <: TreeNode[?, ?], K, V](x: Self & (TreeNode[K, V])) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLeft(value: TreeNode[K, V]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setNext(value: () => TreeNode[K, V]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setParent(value: TreeNode[K, V]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPre(value: () => TreeNode[K, V]): Self = StObject.set(x, "pre", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRight(value: TreeNode[K, V]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotateLeft(value: () => TreeNode[K, V]): Self = StObject.set(x, "rotateLeft", js.Any.fromFunction0(value))
      
      inline def setRotateRight(value: () => TreeNode[K, V]): Self = StObject.set(x, "rotateRight", js.Any.fromFunction0(value))
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
