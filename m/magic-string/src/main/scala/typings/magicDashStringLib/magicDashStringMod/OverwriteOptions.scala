package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwriteOptions extends js.Object {
  var contentOnly: js.UndefOr[scala.Boolean] = js.undefined
  var storeName: js.UndefOr[scala.Boolean] = js.undefined
}

object OverwriteOptions {
  @scala.inline
  def apply(
    contentOnly: js.UndefOr[scala.Boolean] = js.undefined,
    storeName: js.UndefOr[scala.Boolean] = js.undefined
  ): OverwriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentOnly)) __obj.updateDynamic("contentOnly")(contentOnly)
    if (!js.isUndefined(storeName)) __obj.updateDynamic("storeName")(storeName)
    __obj.asInstanceOf[OverwriteOptions]
  }
}

