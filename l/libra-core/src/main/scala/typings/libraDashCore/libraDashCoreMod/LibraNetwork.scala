package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraNetwork extends js.Object

@JSImport("libra-core", "LibraNetwork")
@js.native
object LibraNetwork extends js.Object {
  @js.native
  sealed trait Testnet extends LibraNetwork
  
  /* "testnet" */ val Testnet: typings.libraDashCore.libraDashCoreMod.LibraNetwork.Testnet with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LibraNetwork with String] = js.native
}

