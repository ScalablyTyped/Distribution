package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// mixin
trait MixinOptions extends js.Object {
  var chain: js.UndefOr[scala.Boolean] = js.undefined
}

object MixinOptions {
  @scala.inline
  def apply(chain: js.UndefOr[scala.Boolean] = js.undefined): MixinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chain)) __obj.updateDynamic("chain")(chain)
    __obj.asInstanceOf[MixinOptions]
  }
}

