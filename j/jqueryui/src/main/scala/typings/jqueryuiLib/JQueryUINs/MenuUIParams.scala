package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuUIParams extends js.Object {
  var item: js.UndefOr[jqueryuiLib.JQuery] = js.undefined
}

object MenuUIParams {
  @scala.inline
  def apply(item: jqueryuiLib.JQuery = null): MenuUIParams = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[MenuUIParams]
  }
}

