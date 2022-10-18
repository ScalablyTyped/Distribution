package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Base
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerHashContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/HashContainer/Base", JSImport.Default)
  @js.native
  /* protected */ open class default[K] () extends HashContainer[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @js.native
  trait HashContainer[K] extends Base {
    
    /**
      * @description Using for `for...of` syntax like Array.
      */
    var `abstract`: Any = js.native
    
    /**
      * @description Remove the elements of the specified value.
      * @param key The element you want to remove.
      */
    def eraseElementByKey(key: K): Unit = js.native
    
    /**
      * @param key The element you want to find.
      * @return Boolean about if the specified element in the hash set.
      */
    def find(key: K): Unit = js.native
    
    /**
      * @description Iterate over all elements in the container.
      * @param callback Callback function like Array.forEach.
      */
    def forEach(callback: js.Function2[/* element */ Any, /* index */ Double, Unit]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[K | (js.Tuple2[K, Any]), Unit, Unit]] = js.native
  }
}
