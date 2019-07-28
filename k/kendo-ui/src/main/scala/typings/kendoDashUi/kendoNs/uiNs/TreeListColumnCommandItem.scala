package typings.kendoDashUi.kendoNs.uiNs

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
    if (className != null) __obj.updateDynamic("className")(className)
    if (click != null) __obj.updateDynamic("click")(click)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TreeListColumnCommandItem]
  }
}

