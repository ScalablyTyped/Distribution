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
  }
  
  @js.native
  trait HashSet[K]
    extends typings.jsSdsl.distEsmContainerHashContainerBaseMod.default[K, Unit] {
    
    /**
      * @description Insert element to set.
      * @param key The key want to insert.
      * @param isObject Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                 If a `undefined` value is passed in, the type will be automatically judged.
      */
    def insert(key: K): Unit = js.native
    def insert(key: K, isObject: Boolean): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_HashSet: js.Function0[Generator[K, Unit, Any]] = js.native
  }
}
