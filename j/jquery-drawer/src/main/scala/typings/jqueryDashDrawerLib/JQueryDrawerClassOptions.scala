package typings
package jqueryDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryDrawerClassOptions extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var dropdown: js.UndefOr[java.lang.String] = js.undefined
  var nav: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[java.lang.String] = js.undefined
  var overlay: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[java.lang.String] = js.undefined
}

object JQueryDrawerClassOptions {
  @scala.inline
  def apply(
    close: java.lang.String = null,
    dropdown: java.lang.String = null,
    nav: java.lang.String = null,
    open: java.lang.String = null,
    overlay: java.lang.String = null,
    toggle: java.lang.String = null
  ): JQueryDrawerClassOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    if (nav != null) __obj.updateDynamic("nav")(nav)
    if (open != null) __obj.updateDynamic("open")(open)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[JQueryDrawerClassOptions]
  }
}

