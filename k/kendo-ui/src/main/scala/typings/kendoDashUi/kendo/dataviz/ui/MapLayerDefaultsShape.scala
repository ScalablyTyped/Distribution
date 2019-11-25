package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsShape extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[MapLayerDefaultsShapeStyle] = js.undefined
}

object MapLayerDefaultsShape {
  @scala.inline
  def apply(attribution: String = null, opacity: Int | Double = null, style: MapLayerDefaultsShapeStyle = null): MapLayerDefaultsShape = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsShape]
  }
}

