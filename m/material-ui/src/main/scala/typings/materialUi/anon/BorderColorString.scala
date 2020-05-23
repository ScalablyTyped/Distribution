package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorString extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
}

object BorderColorString {
  @scala.inline
  def apply(borderColor: String = null): BorderColorString = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorString]
  }
}

