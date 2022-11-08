package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Base
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerHashContainerBaseMod {
  
  /* note: abstract class */ @JSImport("js-sdsl/dist/esm/container/HashContainer/Base", JSImport.Default)
  @js.native
  /* protected */ open class default[K, V] () extends HashContainer[K, V]
  
  @js.native
  trait HashContainer[K, V] extends Base {
    
    /**
      * @description Using for `for...of` syntax like Array.
      * @example
      * for (const element of container) {
      *   console.log(element);
      * }
      */
    var `abstract`: Any = js.native
    
    /**
      * @description Remove the element of the specified key.
      * @param key The key you want to remove.
      * @param isObject Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                 If a `undefined` value is passed in, the type will be automatically judged.
      */
    def eraseElementByKey(key: K): Unit = js.native
    def eraseElementByKey(key: K, isObject: Boolean): Unit = js.native
    
    /**
      * @description Check key if exist in container.
      * @param key The element you want to search.
      * @param isObject Tell us if the type of inserted key is `object` to improve efficiency.<br/>
      *                 If a `undefined` value is passed in, the type will be automatically judged.
      * @return Boolean about if key exist in container.
      */
    def find(key: K): Boolean = js.native
    def find(key: K, isObject: Boolean): Boolean = js.native
    
    /**
      * @description Iterate over all elements in the container.
      * @param callback Callback function like Array.forEach.
      * @example container.forEach((element, index) => console.log(element, index));
      */
    def forEach(
      callback: js.Function3[
          /* element */ K | (js.Tuple2[K, V]), 
          /* index */ Double, 
          /* hashContainer */ HashContainer[K, V], 
          Unit
        ]
    ): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[K | (js.Tuple2[K, V]), Unit, Unit]] = js.native
  }
}
