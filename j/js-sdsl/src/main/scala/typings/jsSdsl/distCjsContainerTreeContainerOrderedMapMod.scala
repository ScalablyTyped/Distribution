package typings.jsSdsl

import typings.jsSdsl.distCjsContainerContainerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsContainerTreeContainerOrderedMapMod {
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/OrderedMap", JSImport.Default)
  @js.native
  /**
    * @param container The initialization container.
    * @param cmp The compare function.
    * @param enableIndex Whether to enable iterator indexing function.
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
  
  @JSImport("js-sdsl/dist/cjs/container/TreeContainer/OrderedMap", "OrderedMapIterator")
  @js.native
  open class OrderedMapIterator[K, V] ()
    extends typings.jsSdsl.distCjsContainerTreeContainerBaseTreeIteratorMod.default[K, V]
  
  @js.native
  trait OrderedMap[K, V]
    extends typings.jsSdsl.distCjsContainerTreeContainerBaseMod.default[K, V] {
    
    /**
      * @description Get the _value of the element of the specified _key.
      */
    def getElementByKey(_key: K): js.UndefOr[V] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_OrderedMap: js.Function0[Generator[js.Tuple2[K, V], Unit, Unit]] = js.native
    
    /**
      * @description Insert a _key-_value pair or set _value by the given _key.
      * @param _key The _key want to insert.
      * @param _value The _value want to set.
      * @param hint You can give an iterator hint to improve insertion efficiency.
      */
    def setElement(_key: K, _value: V): Unit = js.native
    def setElement(_key: K, _value: V, hint: OrderedMapIterator[K, V]): Unit = js.native
    
    def union(other: OrderedMap[K, V]): Unit = js.native
  }
}
