package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeContainerOrderedMapMod {
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedMap", JSImport.Default)
  @js.native
  open class default[K, V] () extends OrderedMap[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
    def this(container: initContainer[js.Tuple2[K, V]], cmp: js.Function2[/* x */ K, /* y */ K, Double]) = this()
  }
  
  @JSImport("js-sdsl/dist/esm/container/TreeContainer/OrderedMap", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] protected ()
    extends typings.jsSdsl.baseTreeIteratorMod.default[K, V] {
    def this(
      node: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      header: typings.jsSdsl.baseTreeNodeMod.default[K, V]
    ) = this()
    def this(
      node: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      header: typings.jsSdsl.baseTreeNodeMod.default[K, V],
      iteratorType: Boolean
    ) = this()
  }
  
  @js.native
  trait OrderedMap[K, V]
    extends typings.jsSdsl.containerTreeContainerBaseMod.default[K, V] {
    
    /**
      * @description Get the value of the element of the specified key.
      */
    def getElementByKey(key: K): js.UndefOr[V] = js.native
    
    /* private */ val iterationFunc: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedMap: js.Function0[Generator[js.Tuple2[K, V], Unit, Unit]] = js.native
    
    /**
      * @description Insert a key-value pair or set value by the given key.
      * @param key The key want to insert.
      * @param value The value want to set.
      * @param hint You can give an iterator hint to improve insertion efficiency.
      */
    def setElement(key: K, value: V): Unit = js.native
    def setElement(key: K, value: V, hint: OrderedMapIterator[K, V]): Unit = js.native
    
    def union(other: OrderedMap[K, V]): Unit = js.native
  }
}
