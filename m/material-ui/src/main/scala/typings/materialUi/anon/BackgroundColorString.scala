package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorString extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
}

object BackgroundColorString {
  @scala.inline
  def apply(backgroundColor: String = null): BackgroundColorString = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorString]
  }
}

