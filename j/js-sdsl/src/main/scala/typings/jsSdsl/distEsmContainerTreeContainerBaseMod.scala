package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Container
import typings.jsSdsl.distEsmContainerTreeContainerBaseTreeNodeMod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base", JSImport.Default)
  @js.native
  open class default[K, V] () extends TreeContainer[K, V]
  
  @js.native
  trait TreeContainer[K, V]
    extends Container[K | (js.Tuple2[K, V])] {
    
    /* protected */ def _inOrderTraversal(): js.Array[TreeNode[K, V]] = js.native
    /* protected */ def _inOrderTraversal(callback: js.Function3[/* node */ TreeNode[K, V], /* index */ Double, /* map */ this.type, Unit]): TreeNode[K, V] = js.native
    /* protected */ def _inOrderTraversal(pos: Double): TreeNode[K, V] = js.native
    
    var enableIndex: Boolean = js.native
    
    def eraseElementByIterator(iter: typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V]): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Remove the element of the specified key.
      * @param key - The key you want to remove.
      * @returns Whether erase successfully.
      */
    def eraseElementByKey(key: K): Boolean = js.native
    
    /**
      * @description Get the height of the tree.
      * @returns Number about the height of the RB-tree.
      */
    def getHeight(): Double = js.native
    
    /**
      * @param key - The given key you want to compare.
      * @returns An iterator to the first element not less than the given key.
      */
    def lowerBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key - The given key you want to compare.
      * @returns An iterator to the first element not greater than the given key.
      */
    def reverseLowerBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key - The given key you want to compare.
      * @returns An iterator to the first element less than the given key.
      */
    def reverseUpperBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Union the other tree to self.
      * @param other - The other tree container you want to merge.
      * @returns The size of the tree after union.
      */
    def union(other: TreeContainer[K, V]): Double = js.native
    
    /**
      * @description Update node's key by iterator.
      * @param iter - The iterator you want to change.
      * @param key - The key you want to update.
      * @returns Whether the modification is successful.
      * @example
      * const st = new orderedSet([1, 2, 5]);
      * const iter = st.find(2);
      * st.updateKeyByIterator(iter, 3); // then st will become [1, 3, 5]
      */
    def updateKeyByIterator(iter: typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V], key: K): Boolean = js.native
    
    /**
      * @param key - The given key you want to compare.
      * @returns An iterator to the first element greater than the given key.
      */
    def upperBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
  }
}
