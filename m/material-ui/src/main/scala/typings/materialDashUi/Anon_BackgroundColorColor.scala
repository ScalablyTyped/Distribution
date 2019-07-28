package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorColor {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null): Anon_BackgroundColorColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_BackgroundColorColor]
  }
}

