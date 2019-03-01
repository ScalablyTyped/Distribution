package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontWeight extends js.Object {
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var subtitleColor: js.UndefOr[java.lang.String] = js.undefined
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FontWeight {
  @scala.inline
  def apply(
    fontWeight: scala.Int | scala.Double = null,
    subtitleColor: java.lang.String = null,
    titleColor: java.lang.String = null
  ): Anon_FontWeight = {
    val __obj = js.Dynamic.literal()
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    __obj.asInstanceOf[Anon_FontWeight]
  }
}

