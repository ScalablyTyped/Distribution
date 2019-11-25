package typings.mathjax.MathJax

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
    if (Chrome != null) __obj.updateDynamic("Chrome")(Chrome.asInstanceOf[js.Any])
    if (Firefox != null) __obj.updateDynamic("Firefox")(Firefox.asInstanceOf[js.Any])
    if (MSIE != null) __obj.updateDynamic("MSIE")(MSIE.asInstanceOf[js.Any])
    if (Opera != null) __obj.updateDynamic("Opera")(Opera.asInstanceOf[js.Any])
    if (Safari != null) __obj.updateDynamic("Safari")(Safari.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserPreference]
  }
}

