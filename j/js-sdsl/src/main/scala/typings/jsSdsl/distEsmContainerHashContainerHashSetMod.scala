package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerHashContainerHashSetMod {
  
  @JSImport("js-sdsl/dist/esm/container/HashContainer/HashSet", JSImport.Default)
  @js.native
  open class default[K] () extends HashSet[K] {
    def this(container: initContainer[K]) = this()
    def this(container: Unit, initBucketNum: Double) = this()
    def this(container: initContainer[K], initBucketNum: Double) = this()
    def this(container: Unit, initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: Unit, initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Double, _hashFunc: js.Function1[/* x */ K, Double]) = this()
    def this(container: initContainer[K], initBucketNum: Unit, _hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @js.native
  trait HashSet[K]
    extends typings.jsSdsl.distEsmContainerHashContainerBaseMod.default[K] {
    
    /**
      * @description Insert element to hash set.
      * @param element The element you want to insert.
      */
    def insert(element: K): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashSet: js.Function0[Generator[K, Unit, Any]] = js.native
  }
}
