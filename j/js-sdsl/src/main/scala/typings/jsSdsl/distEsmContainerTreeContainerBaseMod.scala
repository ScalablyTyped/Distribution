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
      * @description Remove the element of the specified _key.
      * @param _key The _key you want to remove.
      */
    def eraseElementByKey(_key: K): Unit = js.native
    
    /**
      * @description Get the height of the tree.
      * @return Number about the height of the RB-tree.
      */
    def getHeight(): Double = js.native
    
    /**
      * @param _key The given _key you want to compare.
      * @return An iterator to the first element not less than the given _key.
      */
    def lowerBound(_key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param _key The given _key you want to compare.
      * @return An iterator to the first element not greater than the given _key.
      */
    def reverseLowerBound(_key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @param _key The given _key you want to compare.
      * @return An iterator to the first element less than the given _key.
      */
    def reverseUpperBound(_key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
    
    /**
      * @description Union the other tree to self.
      * @param other The other tree container you want to merge.
      */
    def union(other: TreeContainer[K, V]): Unit = js.native
    
    /**
      * @description Update node's _key by iterator.
      * @param iter The iterator you want to change.
      * @param _key The _key you want to update.
      * @return Boolean about if the modification is successful.
      */
    def updateKeyByIterator(iter: typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V], _key: K): Boolean = js.native
    
    /**
      * @param _key The given _key you want to compare.
      * @return An iterator to the first element greater than the given _key.
      */
    def upperBound(_key: K): typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] = js.native
  }
}
