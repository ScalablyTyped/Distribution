package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccentColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
}

object AccentColor {
  @scala.inline
  def apply(accentColor: String = null): AccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentColor]
  }
}

