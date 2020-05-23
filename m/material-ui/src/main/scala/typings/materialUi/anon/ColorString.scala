package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorString extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ColorString {
  @scala.inline
  def apply(color: String = null): ColorString = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorString]
  }
}

