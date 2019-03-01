package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPreference extends js.Object {
  var Chrome: js.UndefOr[java.lang.String] = js.undefined
  var Firefox: js.UndefOr[java.lang.String] = js.undefined
  var MSIE: js.UndefOr[java.lang.String] = js.undefined
  var Opera: js.UndefOr[java.lang.String] = js.undefined
  var Safari: js.UndefOr[java.lang.String] = js.undefined
  var other: js.UndefOr[java.lang.String] = js.undefined
}

object BrowserPreference {
  @scala.inline
  def apply(
    Chrome: java.lang.String = null,
    Firefox: java.lang.String = null,
    MSIE: java.lang.String = null,
    Opera: java.lang.String = null,
    Safari: java.lang.String = null,
    other: java.lang.String = null
  ): BrowserPreference = {
    val __obj = js.Dynamic.literal()
    if (Chrome != null) __obj.updateDynamic("Chrome")(Chrome)
    if (Firefox != null) __obj.updateDynamic("Firefox")(Firefox)
    if (MSIE != null) __obj.updateDynamic("MSIE")(MSIE)
    if (Opera != null) __obj.updateDynamic("Opera")(Opera)
    if (Safari != null) __obj.updateDynamic("Safari")(Safari)
    if (other != null) __obj.updateDynamic("other")(other)
    __obj.asInstanceOf[BrowserPreference]
  }
}

