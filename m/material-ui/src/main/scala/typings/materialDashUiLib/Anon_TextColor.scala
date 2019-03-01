package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextColor extends js.Object {
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TextColor {
  @scala.inline
  def apply(textColor: java.lang.String = null): Anon_TextColor = {
    val __obj = js.Dynamic.literal()
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_TextColor]
  }
}

