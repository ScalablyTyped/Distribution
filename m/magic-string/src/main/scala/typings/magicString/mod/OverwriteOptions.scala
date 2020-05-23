package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwriteOptions extends js.Object {
  var contentOnly: js.UndefOr[Boolean] = js.undefined
  var storeName: js.UndefOr[Boolean] = js.undefined
}

object OverwriteOptions {
  @scala.inline
  def apply(contentOnly: js.UndefOr[Boolean] = js.undefined, storeName: js.UndefOr[Boolean] = js.undefined): OverwriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentOnly)) __obj.updateDynamic("contentOnly")(contentOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storeName)) __obj.updateDynamic("storeName")(storeName.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteOptions]
  }
}

