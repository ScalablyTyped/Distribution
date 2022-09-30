package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashMapMod {
  
  @JSImport("js-sdsl/dist/cjs/container/HashContainer/HashMap", JSImport.Default)
  @js.native
  open class default[K, V] () extends HashMap[K, V] {
    def this(container: initContainer[js.Tuple2[K, V]]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[js.Tuple2[K, V]], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      initBucketNum: Double,
      hashFunc: js.Function1[/* x */ K, Double]
    ) = this()
    def this(
      container: initContainer[js.Tuple2[K, V]],
      initBucketNum: Unit,
      hashFunc: js.Function1[/* x */ K, Double]
    ) = this()
  }
  
  @js.native
  trait HashMap[K, V]
    extends typings.jsSdsl.baseMod.default[K] {
    
    /**
      * @description Get the value of the element which has the specified key.
      * @param key The key you want to get.
      */
    def getElementByKey(key: K): js.UndefOr[V] = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashMap: js.Function0[Generator[js.Tuple2[K, V], Unit, Any]] = js.native
    
    /**
      * @description Insert a new key-value pair to hash map or set value by key.
      * @param key The key you want to insert.
      * @param value The value you want to insert.
      * @example HashMap.setElement(1, 2); // insert a key-value pair [1, 2]
      */
    def setElement(key: K, value: V): Unit = js.native
  }
}
