package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnCommandItem extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var click: js.UndefOr[js.Function] = js.undefined
  var imageClass: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TreeListColumnCommandItem {
  @scala.inline
  def apply(
    className: String = null,
    click: js.Function = null,
    imageClass: String = null,
    name: String = null,
    text: String = null
  ): TreeListColumnCommandItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnCommandItem]
  }
}

