package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyColor extends js.Object {
  var bodyColor: js.UndefOr[java.lang.String] = js.undefined
  var bodyFontSize: js.UndefOr[scala.Double] = js.undefined
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BodyColor {
  @scala.inline
  def apply(
    bodyColor: java.lang.String = null,
    bodyFontSize: scala.Int | scala.Double = null,
    titleFontSize: scala.Int | scala.Double = null
  ): Anon_BodyColor = {
    val __obj = js.Dynamic.literal()
    if (bodyColor != null) __obj.updateDynamic("bodyColor")(bodyColor)
    if (bodyFontSize != null) __obj.updateDynamic("bodyFontSize")(bodyFontSize.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyColor]
  }
}

