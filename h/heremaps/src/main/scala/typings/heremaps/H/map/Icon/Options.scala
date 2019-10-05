package typings.heremaps.H.map.Icon

import typings.heremaps.H.map.HitArea
import typings.heremaps.H.math.IPoint
import typings.heremaps.H.math.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a Icon
  * @property size {H.math.ISize=} - The icon's size in pixel, default is the bitmap's natural size
  * @property anchor {H.math.IPoint=} - The anchorage point in pixel, default is bottom-center
  * @property hitArea {H.map.HitArea=} - The area to use for hit detection, default is the whole rectangular area
  * @property asCanvas {H.map.HitArea=} - Indicates whether a non canvas bitmap is converted into a canvas, default is true. The conversion improves the rendering performance but it could
  * also cause a higher memory consumption.
  * @property crossOrigin {boolean} - Specifies whether to use anonynous Cross-Origin Resource Sharing (CORS) when fetching an image to prevent resulting canvas from tainting, default is
  * false. The option is ignored by IE9-10.
  */
trait Options extends js.Object {
  var anchor: js.UndefOr[IPoint] = js.undefined
  var asCanvas: js.UndefOr[HitArea] = js.undefined
  var crossOrigin: Boolean
  var hitArea: js.UndefOr[HitArea] = js.undefined
  var size: js.UndefOr[ISize | Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    crossOrigin: Boolean,
    anchor: IPoint = null,
    asCanvas: HitArea = null,
    hitArea: HitArea = null,
    size: ISize | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(crossOrigin = crossOrigin)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (asCanvas != null) __obj.updateDynamic("asCanvas")(asCanvas)
    if (hitArea != null) __obj.updateDynamic("hitArea")(hitArea)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

