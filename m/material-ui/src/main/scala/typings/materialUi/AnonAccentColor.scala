package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccentColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
}

object AnonAccentColor {
  @scala.inline
  def apply(accentColor: String = null): AnonAccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccentColor]
  }
}

