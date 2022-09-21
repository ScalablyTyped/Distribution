package typings.jsSdsl

import typings.jsSdsl.containerBaseMod.Base
import typings.jsSdsl.containerBaseMod.Container
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
  object default {
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", "default.maxBucketNum")
    @js.native
    val maxBucketNum: Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", "default.minTreeifySize")
    @js.native
    val minTreeifySize: /* 64 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", "default.sigma")
    @js.native
    val sigma: /* 0.75 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", "default.treeifyThreshold")
    @js.native
    val treeifyThreshold: /* 8 */ Double = js.native
    
    /* static member */
    @JSImport("js-sdsl/dist/cjs/container/HashContainer/Base", "default.untreeifyThreshold")
    @js.native
    val untreeifyThreshold: /* 6 */ Double = js.native
  }
  
  @js.native
  trait HashContainer[K] extends Base {
    
    var `abstract`: Any = js.native
    
    /* protected */ var bucketNum: Double = js.native
    
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
    
    /* protected */ def hashFunc(x: K): Double = js.native
    
    /* protected */ var hashTable: js.Array[Container[Any]] = js.native
    
    /* protected */ var initBucketNum: Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[Any, Unit, Unit]] = js.native
    
    /**
      * @description Growth the hash table.
      * @protected
      */
    /* protected */ def reAllocate(): Unit = js.native
  }
}
