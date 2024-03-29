package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.IteratorType
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.jsSdsl.distEsmContainerTreeContainerBaseTreeNodeMod.TreeNode
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerTreeContainerOrderedSetMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedSet", JSImport.Default)
  @js.native
  /**
    * @param container - The initialization container.
    * @param cmp - The compare function.
    * @param enableIndex - Whether to enable iterator indexing function.
    * @example
    * new OrderedSet();
    * new OrderedSet([0, 1, 2]);
    * new OrderedSet([0, 1, 2], (x, y) => x - y);
    * new OrderedSet([0, 1, 2], (x, y) => x - y, true);
    */
  open class default[K] () extends OrderedSet[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedSet", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] protected ()
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseTreeIteratorMod.default[K, Unit] {
    def this(node: TreeNode[K, Unit], header: TreeNode[K, Unit], container: OrderedSet[K]) = this()
    def this(
      node: TreeNode[K, Unit],
      header: TreeNode[K, Unit],
      container: OrderedSet[K],
      iteratorType: IteratorType
    ) = this()
    
    @JSName("container")
    var container_OrderedSetIterator: OrderedSet[K] = js.native
    
    def equals(iter: OrderedSetIterator[K]): Boolean = js.native
  }
  
  @js.native
  trait OrderedSet[K]
    extends typings.jsSdsl.distEsmContainerTreeContainerBaseMod.default[K, Unit] {
    
    def eraseElementByIterator(iter: OrderedSetIterator[K]): OrderedSetIterator[K] = js.native
    
    /**
      * @description Insert element to set.
      * @param key - The key want to insert.
      * @param hint - You can give an iterator hint to improve insertion efficiency.
      * @return The size of container after setting.
      * @example
      * const st = new OrderedSet([2, 4, 5]);
      * const iter = st.begin();
      * st.insert(1);
      * st.insert(3, iter);  // give a hint will be faster.
      */
    def insert(key: K): Double = js.native
    def insert(key: K, hint: OrderedSetIterator[K]): Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedSet: js.Function0[Generator[K, Unit, Any]] = js.native
    
    def union(other: OrderedSet[K]): Double = js.native
  }
}
