package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewCheckboxes extends js.Object {
  var checkChildren: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
}

object TreeViewCheckboxes {
  @scala.inline
  def apply(
    checkChildren: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    template: String | js.Function = null
  ): TreeViewCheckboxes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkChildren)) __obj.updateDynamic("checkChildren")(checkChildren)
    if (name != null) __obj.updateDynamic("name")(name)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewCheckboxes]
  }
}

