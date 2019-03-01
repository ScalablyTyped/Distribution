package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsShape extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[MapLayerDefaultsShapeStyle] = js.undefined
}

object MapLayerDefaultsShape {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    style: MapLayerDefaultsShapeStyle = null
  ): MapLayerDefaultsShape = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MapLayerDefaultsShape]
  }
}

