package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListToolbarItem extends js.Object {
  var click: js.UndefOr[js.Function] = js.undefined
  var imageClass: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TreeListToolbarItem {
  @scala.inline
  def apply(click: js.Function = null, imageClass: String = null, name: String = null, text: String = null): TreeListToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (name != null) __obj.updateDynamic("name")(name)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TreeListToolbarItem]
  }
}

