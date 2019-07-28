package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Menu //////////////////////////////////////////////////
trait MenuOptions extends MenuEvents {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var menus: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // TODO
  var role: js.UndefOr[String] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(
    blur: MenuEvent = null,
    create: MenuEvent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: MenuEvent = null,
    icons: js.Any = null,
    menus: String = null,
    position: js.Any = null,
    role: String = null,
    select: MenuEvent = null
  ): MenuOptions = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (menus != null) __obj.updateDynamic("menus")(menus)
    if (position != null) __obj.updateDynamic("position")(position)
    if (role != null) __obj.updateDynamic("role")(role)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[MenuOptions]
  }
}

