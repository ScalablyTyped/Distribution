package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraNetwork extends js.Object

@JSImport("libra-core", "LibraNetwork")
@js.native
object LibraNetwork extends js.Object {
  @js.native
  sealed trait Testnet
    extends libraDashCoreLib.libraDashCoreMod.LibraNetwork
  
  /* "testnet" */ val Testnet: Testnet with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraNetwork with java.lang.String] = js.native
}

