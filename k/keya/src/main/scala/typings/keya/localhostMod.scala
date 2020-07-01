package typings.keya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/browser/localhost", JSImport.Namespace)
@js.native
object localhostMod extends js.Object {
  @js.native
  trait LocalStoreStore[T]
    extends typings.keya.storeMod.default[T] {
    var prefix: String = js.native
  }
  
  @js.native
  class default[T] () extends LocalStoreStore[T]
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Gets all stores
      */
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
}

