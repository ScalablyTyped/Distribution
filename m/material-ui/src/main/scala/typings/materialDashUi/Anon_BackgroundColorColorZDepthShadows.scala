package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColorZDepthShadows extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var zDepthShadows: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_BackgroundColorColorZDepthShadows {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null, zDepthShadows: js.Array[String] = null): Anon_BackgroundColorColorZDepthShadows = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (zDepthShadows != null) __obj.updateDynamic("zDepthShadows")(zDepthShadows)
    __obj.asInstanceOf[Anon_BackgroundColorColorZDepthShadows]
  }
}

