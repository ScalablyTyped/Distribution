package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.wallet.CreateWallet
import typings.mangopay2NodejsSdk.mod.wallet.UpdateWallet
import typings.mangopay2NodejsSdk.mod.wallet.WalletData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Wallet")
@js.native
class Wallet protected () extends EntityBase[WalletData] {
  def this(data: CreateWallet) = this()
  def this(data: UpdateWallet) = this()
}
