package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "LibraWallet")
@js.native
class LibraWallet () extends js.Object {
  def this(config: WalletConfig) = this()
  def addAccount(account: Account): scala.Unit = js.native
  def generateAccount(depth: scala.Double): Account = js.native
  def getConfig(): WalletConfig = js.native
  def newAccount(): Account = js.native
}

