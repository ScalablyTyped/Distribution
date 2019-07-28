package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalletConfig extends js.Object {
  var mnemonic: js.UndefOr[String] = js.undefined
  var salt: js.UndefOr[String] = js.undefined
}

object WalletConfig {
  @scala.inline
  def apply(mnemonic: String = null, salt: String = null): WalletConfig = {
    val __obj = js.Dynamic.literal()
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[WalletConfig]
  }
}

