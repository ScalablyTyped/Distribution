package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeContainerBaseMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/Base", JSImport.Default)
  @js.native
  /* protected */ abstract class default[K, V] () extends TreeContainer[K, V] {
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
  }
  
  @js.native
  trait TreeContainer[K, V]
    extends Container[K | (js.Tuple2[K, V])] {
    
    /* protected */ def _lowerBound(curNode: Unit, key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    /**
      * @param curNode The starting node of the search.
      * @param key The key you want to search.
      * @return TreeNode which key is greater than or equals to the given key.
      * @protected
      */
    /* protected */ def _lowerBound(curNode: typings.jsSdsl.treeNodeMod.default[K, V], key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ def _reverseLowerBound(curNode: Unit, key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    /**
      * @param curNode The starting node of the search.
      * @param key The key you want to search.
      * @return TreeNode which key is less than or equals to the given key.
      * @protected
      */
    /* protected */ def _reverseLowerBound(curNode: typings.jsSdsl.treeNodeMod.default[K, V], key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ def _reverseUpperBound(curNode: Unit, key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    /**
      * @param curNode The starting node of the search.
      * @param key The key you want to search.
      * @return TreeNode which key is less than the given key.
      * @protected
      */
    /* protected */ def _reverseUpperBound(curNode: typings.jsSdsl.treeNodeMod.default[K, V], key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ def _upperBound(curNode: Unit, key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    /**
      * @param curNode The starting node of the search.
      * @param key The key you want to search.
      * @return TreeNode which key is greater than the given key.
      * @protected
      */
    /* protected */ def _upperBound(curNode: typings.jsSdsl.treeNodeMod.default[K, V], key: K): typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ def cmp(x: K, y: K): Double = js.native
    
    def eraseElementByIterator(iter: typings.jsSdsl.treeIteratorMod.default[K, V]): typings.jsSdsl.treeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Remove the element of the specified key.
      * @param key The key you want to remove.
      */
    def eraseElementByKey(key: K): Unit = js.native
    
    /**
      * @description Remove a node.
      * @param curNode The node you want to remove.
      * @protected
      */
    /* protected */ def eraseNode(curNode: typings.jsSdsl.treeNodeMod.default[K, V]): Unit = js.native
    
    /**
      * @description Make self balance after erase a node.
      * @param curNode The node want to remove.
      * @protected
      */
    /* protected */ def eraseNodeSelfBalance(curNode: typings.jsSdsl.treeNodeMod.default[K, V]): Unit = js.native
    
    /* protected */ def findElementNode(curNode: Unit, key: K): js.UndefOr[typings.jsSdsl.treeNodeMod.default[K, V]] = js.native
    /**
      * @description Find node which key is equals to the given key.
      * @param curNode The starting node of the search.
      * @param key The key you want to search.
      * @protected
      */
    /* protected */ def findElementNode(curNode: typings.jsSdsl.treeNodeMod.default[K, V], key: K): js.UndefOr[typings.jsSdsl.treeNodeMod.default[K, V]] = js.native
    
    /**
      * @description Get the height of the tree.
      * @return Number about the height of the RB-tree.
      */
    def getHeight(): Double = js.native
    
    /* protected */ var header: typings.jsSdsl.treeNodeMod.default[K, V] = js.native
    
    /* protected */ def inOrderTraversal(
      curNode: Unit,
      callback: js.Function1[/* curNode */ typings.jsSdsl.treeNodeMod.default[K, V], Boolean]
    ): Boolean = js.native
    /**
      * @description InOrder traversal the tree.
      * @protected
      */
    /* protected */ def inOrderTraversal(
      curNode: typings.jsSdsl.treeNodeMod.default[K, V],
      callback: js.Function1[/* curNode */ typings.jsSdsl.treeNodeMod.default[K, V], Boolean]
    ): Boolean = js.native
    
    /**
      * @description Make self balance after insert a node.
      * @param curNode The node want to insert.
      * @protected
      */
    /* protected */ def insertNodeSelfBalance(curNode: typings.jsSdsl.treeNodeMod.default[K, V]): Unit = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element not less than the given key.
      */
    def lowerBound(key: K): typings.jsSdsl.treeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element not greater than the given key.
      */
    def reverseLowerBound(key: K): typings.jsSdsl.treeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element less than the given key.
      */
    def reverseUpperBound(key: K): typings.jsSdsl.treeIteratorMod.default[K, V] = js.native
    
    /* protected */ var root: js.UndefOr[typings.jsSdsl.treeNodeMod.default[K, V]] = js.native
    
    /**
      * @description Insert a key-value pair or set value by the given key.
      * @param key The key want to insert.
      * @param value The value want to set.
      * @param hint You can give an iterator hint to improve insertion efficiency.
      * @protected
      */
    /* protected */ def set(key: K): Unit = js.native
    /* protected */ def set(key: K, value: V): Unit = js.native
    /* protected */ def set(key: K, value: V, hint: typings.jsSdsl.treeIteratorMod.default[K, V]): Unit = js.native
    /* protected */ def set(key: K, value: Unit, hint: typings.jsSdsl.treeIteratorMod.default[K, V]): Unit = js.native
    
    /**
      * @description Union the other tree to self.
      *              <br/>
      *              Waiting for optimization, this is O(mlog(n+m)) algorithm now,
      *              but we expect it to be O(mlog(n/m+1)).<br/>
      *              More information =>
      *              https://en.wikipedia.org/wiki/Red_black_tree
      *              <br/>
      * @param other The other tree container you want to merge.
      */
    def union(other: TreeContainer[K, V]): Unit = js.native
    
    /**
      * @description Update node's key by iterator.
      * @param iter The iterator you want to change.
      * @param key The key you want to update.
      * @return Boolean about if the modification is successful.
      */
    def updateKeyByIterator(iter: typings.jsSdsl.treeIteratorMod.default[K, V], key: K): Boolean = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element greater than the given key.
      */
    def upperBound(key: K): typings.jsSdsl.treeIteratorMod.default[K, V] = js.native
  }
}
