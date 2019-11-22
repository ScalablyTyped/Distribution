package typings.keya

import typings.keya.outBrowserLocalhostMod.LocalStoreStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/browser/localhost", JSImport.Namespace)
@js.native
object outBrowserLocalhostMod extends js.Object {
  @js.native
  trait LocalStoreStore
    extends typings.keya.outCoreStoreMod.default
  
  @js.native
  class default () extends LocalStoreStore
  
  /* static members */
  @js.native
  object default extends js.Object {
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
}

