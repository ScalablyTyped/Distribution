package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalletConfig extends js.Object {
  var mnemonic: js.UndefOr[java.lang.String] = js.undefined
  var salt: js.UndefOr[java.lang.String] = js.undefined
}

object WalletConfig {
  @scala.inline
  def apply(mnemonic: java.lang.String = null, salt: java.lang.String = null): WalletConfig = {
    val __obj = js.Dynamic.literal()
    if (mnemonic != null) __obj.updateDynamic("mnemonic")(mnemonic)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[WalletConfig]
  }
}

