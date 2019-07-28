package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "LibraWallet")
@js.native
class LibraWallet () extends js.Object {
  def this(config: WalletConfig) = this()
  def addAccount(account: Account): Unit = js.native
  def generateAccount(depth: Double): Account = js.native
  def getConfig(): WalletConfig = js.native
  def newAccount(): Account = js.native
}

