package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashSetMod {
  
  @JSImport("js-sdsl/dist/cjs/container/HashContainer/HashSet", JSImport.Default)
  @js.native
  open class default[K] () extends HashSet[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[K], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @js.native
  trait HashSet[K]
    extends typings.jsSdsl.baseMod.default[K] {
    
    /* protected */ @JSName("hashTable")
    var hashTable_HashSet: js.Array[typings.jsSdsl.vectorMod.default[K] | typings.jsSdsl.orderedSetMod.default[K]] = js.native
    
    /**
      * @description Insert element to hash set.
      * @param element The element you want to insert.
      */
    def insert(element: K): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashSet: js.Function0[Generator[K, Unit, Any]] = js.native
  }
}
