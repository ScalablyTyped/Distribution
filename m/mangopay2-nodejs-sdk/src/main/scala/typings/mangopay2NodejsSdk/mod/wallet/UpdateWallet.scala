package typings.mangopay2NodejsSdk.mod.wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Tag' | 'Description'> */
trait UpdateWallet extends js.Object {
  var Description: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object UpdateWallet {
  @scala.inline
  def apply(Description: String = null, Tag: String = null): UpdateWallet = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWallet]
  }
}

