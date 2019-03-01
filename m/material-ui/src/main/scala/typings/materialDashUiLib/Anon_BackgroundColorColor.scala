package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorColor {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null, color: java.lang.String = null): Anon_BackgroundColorColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_BackgroundColorColor]
  }
}

