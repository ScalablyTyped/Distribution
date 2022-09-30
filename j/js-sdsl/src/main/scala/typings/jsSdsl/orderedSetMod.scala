package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.IteratorType
import typings.jsSdsl.containerBaseMod.initContainer
import typings.jsSdsl.treeNodeMod.TreeNode
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderedSetMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/OrderedSet", JSImport.Default)
  @js.native
  open class default[K] () extends OrderedSet[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: Unit, cmp: Unit, enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: js.Function2[/* x */ K, /* y */ K, Double], enableIndex: Boolean) = this()
    def this(container: initContainer[K], cmp: Unit, enableIndex: Boolean) = this()
  }
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/OrderedSet", "OrderedSetIterator")
  @js.native
  open class OrderedSetIterator[K] protected ()
    extends typings.jsSdsl.treeIteratorMod.default[K, Unit] {
    def this(_node: TreeNode[K, Unit], _header: TreeNode[K, Unit]) = this()
    def this(_node: TreeNode[K, Unit], _header: TreeNode[K, Unit], iteratorType: IteratorType) = this()
  }
  
  @js.native
  trait OrderedSet[K]
    extends typings.jsSdsl.treeContainerBaseMod.default[K, Unit] {
    
    /**
      * @description Insert element to set.
      * @param key The key want to insert.
      * @param hint You can give an iterator hint to improve insertion efficiency.
      */
    def insert(key: K): Unit = js.native
    def insert(key: K, hint: OrderedSetIterator[K]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedSet: js.Function0[Generator[K, Unit, Unit]] = js.native
    
    def union(other: OrderedSet[K]): Unit = js.native
  }
}
