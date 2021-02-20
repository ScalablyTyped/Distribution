package typings.keya

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localhostMod {
  
  @JSImport("keya/out/browser/localhost", JSImport.Default)
  @js.native
  class default[T] () extends LocalStoreStore[T]
  /* static members */
  object default {
    
    /**
      * Gets all stores
      */
    @JSImport("keya/out/browser/localhost", "default.stores")
    @js.native
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait LocalStoreStore[T]
    extends typings.keya.storeMod.default[T] {
    
    var prefix: String = js.native
  }
}
