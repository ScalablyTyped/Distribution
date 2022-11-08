package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/TreeContainer/Base", JSImport.Default)
  @js.native
  /**
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
    */
  /* protected */ open class default[K, V] () extends TreeContainer[K, V] {
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    /* protected */ def this(cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    /* protected */ def this(cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @js.native
  trait TreeContainer[K, V]
    extends Container[K | (js.Tuple2[K, V])] {
    
    def eraseElementByIterator(iter: typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V]): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Remove the element of the specified key.
      * @param key The key you want to remove.
      */
    def eraseElementByKey(key: K): Unit = js.native
    
    /**
      * @description Get the height of the tree.
      * @return Number about the height of the RB-tree.
      */
    def getHeight(): Double = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element not less than the given key.
      */
    def lowerBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element not greater than the given key.
      */
    def reverseLowerBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element less than the given key.
      */
    def reverseUpperBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Union the other tree to self.
      * @param other The other tree container you want to merge.
      */
    def union(other: TreeContainer[K, V]): Unit = js.native
    
    /**
      * @description Update node's key by iterator.
      * @param iter The iterator you want to change.
      * @param key The key you want to update.
      * @return Boolean about if the modification is successful.
      * @example
      * const st = new orderedSet([1, 2, 5]);
      * const iter = st.find(2);
      * st.updateKeyByIterator(iter, 3); // then st will become [1, 3, 5]
      */
    def updateKeyByIterator(iter: typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V], key: K): Boolean = js.native
    
    /**
      * @param key The given key you want to compare.
      * @return An iterator to the first element greater than the given key.
      */
    def upperBound(key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
  }
}
