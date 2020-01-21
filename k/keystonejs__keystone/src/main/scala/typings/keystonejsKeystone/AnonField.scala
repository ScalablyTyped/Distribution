package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: js.UndefOr[Boolean] = js.undefined
  var list: js.UndefOr[Boolean] = js.undefined
}

object AnonField {
  @scala.inline
  def apply(field: js.UndefOr[Boolean] = js.undefined, list: js.UndefOr[Boolean] = js.undefined): AnonField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
}

