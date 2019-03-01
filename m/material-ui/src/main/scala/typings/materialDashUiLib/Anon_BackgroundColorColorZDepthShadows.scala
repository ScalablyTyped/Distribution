package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorColorZDepthShadows extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var zDepthShadows: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_BackgroundColorColorZDepthShadows {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    zDepthShadows: js.Array[java.lang.String] = null
  ): Anon_BackgroundColorColorZDepthShadows = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (zDepthShadows != null) __obj.updateDynamic("zDepthShadows")(zDepthShadows)
    __obj.asInstanceOf[Anon_BackgroundColorColorZDepthShadows]
  }
}

