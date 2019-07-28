package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorString extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorString {
  @scala.inline
  def apply(backgroundColor: String = null): Anon_BackgroundColorString = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.asInstanceOf[Anon_BackgroundColorString]
  }
}

