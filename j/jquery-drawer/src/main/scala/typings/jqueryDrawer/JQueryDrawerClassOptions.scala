package typings.jqueryDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryDrawerClassOptions extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var dropdown: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
}

object JQueryDrawerClassOptions {
  @scala.inline
  def apply(
    close: String = null,
    dropdown: String = null,
    nav: String = null,
    open: String = null,
    overlay: String = null,
    toggle: String = null
  ): JQueryDrawerClassOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (nav != null) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryDrawerClassOptions]
  }
}

