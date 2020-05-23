package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: js.UndefOr[Boolean] = js.undefined
  var list: js.UndefOr[Boolean] = js.undefined
}

object Field {
  @scala.inline
  def apply(field: js.UndefOr[Boolean] = js.undefined, list: js.UndefOr[Boolean] = js.undefined): Field = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.get.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

