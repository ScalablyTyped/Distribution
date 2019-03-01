package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorString extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorString {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null): Anon_BackgroundColorString = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.asInstanceOf[Anon_BackgroundColorString]
  }
}

