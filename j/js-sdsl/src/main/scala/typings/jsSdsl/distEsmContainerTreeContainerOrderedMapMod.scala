package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerTreeContainerBaseTreeNodeMod.TreeNode
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerOrderedMapMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedMap", JSImport.Default)
  @js.native
  /**
    * @param container - The initialization container.
    * @param cmp - The compare function.
    * @param enableIndex - Whether to enable iterator indexing function.
    * @example
    * new OrderedMap();
    * new OrderedMap([[0, 1], [2, 1]]);
    * new OrderedMap([[0, 1], [2, 1]], (x, y) => x - y);
    * new OrderedMap([[0, 1], [2, 1]], (x, y) => x - y, true);
    */
  open class default[K, V] () extends OrderedMap[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      cmp: js.Function2[/* x */ K, /* y */ K, Double],
      enableIndex: Boolean
    ) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedMap", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] protected ()
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, V] {
    def this(node: TreeNode[K, V], header: TreeNode[K, V], container: OrderedMap[K, V]) = this()
    def this(
      node: TreeNode[K, V],
      header: TreeNode[K, V],
      container: OrderedMap[K, V],
      iteratorType: IteratorType
    ) = this()
    
    @JSName("container")
    var container_OrderedMapIterator: OrderedMap[K, V] = js.native
    
    def equals(iter: OrderedMapIterator[K, V]): Boolean = js.native
  }
  
  @js.native
  trait OrderedMap[K, V]
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, V] {
    
    def eraseElementByIterator(iter: OrderedMapIterator[K, V]): OrderedMapIterator[K, V] = js.native
    
    /**
      * @description Get the value of the element of the specified key.
      * @param key - The specified key you want to get.
      * @example
      * const val = container.getElementByKey(1);
      */
    def getElementByKey(key: K): js.UndefOr[V] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedMap: js.Function0[Generator[js.Tuple2[K, V], Unit, Any]] = js.native
    
    /**
      * @description Insert a key-value pair or set value by the given key.
      * @param key - The key want to insert.
      * @param value - The value want to set.
      * @param hint - You can give an iterator hint to improve insertion efficiency.
      * @return The size of container after setting.
      * @example
      * const mp = new OrderedMap([[2, 0], [4, 0], [5, 0]]);
      * const iter = mp.begin();
      * mp.setElement(1, 0);
      * mp.setElement(3, 0, iter);  // give a hint will be faster.
      */
    def setElement(key: K, value: V): Double = js.native
    def setElement(key: K, value: V, hint: OrderedMapIterator[K, V]): Double = js.native
    
    def union(other: OrderedMap[K, V]): Double = js.native
  }
}
