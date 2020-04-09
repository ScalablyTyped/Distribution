package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var className: String
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  var submenu: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var submenuTitle: js.UndefOr[String] = js.undefined
  var text: String
  var title: String
  var `type`: js.UndefOr[separator] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    className: String,
    text: String,
    title: String,
    click: () => Unit = null,
    submenu: js.Array[MenuItem] = null,
    submenuTitle: String = null,
    `type`: separator = null
  ): MenuItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction0(click))
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    if (submenuTitle != null) __obj.updateDynamic("submenuTitle")(submenuTitle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
}

