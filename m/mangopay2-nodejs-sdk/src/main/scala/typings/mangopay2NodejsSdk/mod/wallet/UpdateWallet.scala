package typings.mangopay2NodejsSdk.mod.wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Tag' | 'Description'> */
@js.native
trait UpdateWallet extends js.Object {
  var Description: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateWallet {
  @scala.inline
  def apply(): UpdateWallet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWallet]
  }
  @scala.inline
  implicit class UpdateWalletOps[Self <: UpdateWallet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

