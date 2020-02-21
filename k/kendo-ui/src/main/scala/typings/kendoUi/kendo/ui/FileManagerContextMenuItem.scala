package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerContextMenuItem extends js.Object {
  var command: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var spriteCssClass: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object FileManagerContextMenuItem {
  @scala.inline
  def apply(command: String = null, name: String = null, spriteCssClass: String = null, text: String = null): FileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerContextMenuItem]
  }
}

