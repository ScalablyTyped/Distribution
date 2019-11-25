package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyColor extends js.Object {
  var bodyColor: js.UndefOr[String] = js.undefined
  var bodyFontSize: js.UndefOr[Double] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
}

object Anon_BodyColor {
  @scala.inline
  def apply(bodyColor: String = null, bodyFontSize: Int | Double = null, titleFontSize: Int | Double = null): Anon_BodyColor = {
    val __obj = js.Dynamic.literal()
    if (bodyColor != null) __obj.updateDynamic("bodyColor")(bodyColor.asInstanceOf[js.Any])
    if (bodyFontSize != null) __obj.updateDynamic("bodyFontSize")(bodyFontSize.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyColor]
  }
}

