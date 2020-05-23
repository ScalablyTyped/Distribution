package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZDepthShadows extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var zDepthShadows: js.UndefOr[js.Array[String]] = js.undefined
}

object ZDepthShadows {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null, zDepthShadows: js.Array[String] = null): ZDepthShadows = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (zDepthShadows != null) __obj.updateDynamic("zDepthShadows")(zDepthShadows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZDepthShadows]
  }
}

