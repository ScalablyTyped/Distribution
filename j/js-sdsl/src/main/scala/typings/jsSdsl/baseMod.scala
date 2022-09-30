package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.Base
import typings.jsSdsl.jsSdslDoubles.`0.75`
import typings.jsSdsl.jsSdslInts.`1073741824`
import typings.jsSdsl.jsSdslInts.`64`
import typings.jsSdsl.jsSdslInts.`6`
import typings.jsSdsl.jsSdslInts.`8`
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", JSImport.Default)
  @js.native
  /* protected */ abstract class default[K] () extends HashContainer[K] {
    /* protected */ def this(initBucketNum: Double) = this()
    /* protected */ def this(initBucketNum: Double, hashFunc: js.Function1[/* x */ K, Double]) = this()
    /* protected */ def this(initBucketNum: Unit, hashFunc: js.Function1[/* x */ K, Double]) = this()
  }
  
  @js.native
  trait HashContainer[K] extends Base {
    
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
    
    def forEach(callback: js.Function2[/* element */ Any, /* index */ Double, Unit]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Any, Unit, Unit]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsSdsl.jsSdslDoubles.`0.75`
    - typings.jsSdsl.jsSdslInts.`8`
    - typings.jsSdsl.jsSdslInts.`6`
    - typings.jsSdsl.jsSdslInts.`64`
    - typings.jsSdsl.jsSdslInts.`1073741824`
  */
  trait HashContainerConst extends StObject
  object HashContainerConst {
    
    inline def maxBucketNum: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
    
    inline def minTreeifySize: `64` = 64.asInstanceOf[`64`]
    
    inline def sigma: `0.75` = 0.75d.asInstanceOf[`0.75`]
    
    inline def treeifyThreshold: `8` = 8.asInstanceOf[`8`]
    
    inline def untreeifyThreshold: `6` = 6.asInstanceOf[`6`]
  }
}
