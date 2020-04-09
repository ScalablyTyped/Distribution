package typings.isBase64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsBase64Options extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var allowMime: js.UndefOr[Boolean] = js.undefined
  var mimeRequired: js.UndefOr[Boolean] = js.undefined
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
}

object IsBase64Options {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    allowMime: js.UndefOr[Boolean] = js.undefined,
    mimeRequired: js.UndefOr[Boolean] = js.undefined,
    paddingRequired: js.UndefOr[Boolean] = js.undefined
  ): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMime)) __obj.updateDynamic("allowMime")(allowMime.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeRequired)) __obj.updateDynamic("mimeRequired")(mimeRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRequired)) __obj.updateDynamic("paddingRequired")(paddingRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBase64Options]
  }
}

