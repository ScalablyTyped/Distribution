package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerMini extends js.Object {
  var template: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DrawerMini {
  @scala.inline
  def apply(template: String = null, width: js.UndefOr[Double] = js.undefined): DrawerMini = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerMini]
  }
}

