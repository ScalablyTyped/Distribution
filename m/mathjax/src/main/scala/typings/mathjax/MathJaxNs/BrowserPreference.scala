package typings.mathjax.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPreference extends js.Object {
  var Chrome: js.UndefOr[String] = js.undefined
  var Firefox: js.UndefOr[String] = js.undefined
  var MSIE: js.UndefOr[String] = js.undefined
  var Opera: js.UndefOr[String] = js.undefined
  var Safari: js.UndefOr[String] = js.undefined
  var other: js.UndefOr[String] = js.undefined
}

object BrowserPreference {
  @scala.inline
  def apply(
    Chrome: String = null,
    Firefox: String = null,
    MSIE: String = null,
    Opera: String = null,
    Safari: String = null,
    other: String = null
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

