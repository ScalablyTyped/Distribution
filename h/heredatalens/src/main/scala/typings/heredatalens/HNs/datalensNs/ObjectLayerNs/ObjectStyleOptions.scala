package typings.heredatalens.HNs.datalensNs.ObjectLayerNs

import typings.heremaps.HNs.mapNs.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output from the rowToStyle callback.
  * Defines the styles or the icon that is applied to the map object.
  */
trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[typings.heremaps.HNs.mapNs.ArrowStyleNs.Options] = js.undefined
  /** Marker icon */
  var icon: Icon
  /** Spatial style */
  var style: js.UndefOr[typings.heremaps.HNs.mapNs.SpatialStyleNs.Options] = js.undefined
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ObjectStyleOptions {
  @scala.inline
  def apply(
    icon: Icon,
    arrows: typings.heremaps.HNs.mapNs.ArrowStyleNs.Options = null,
    style: typings.heremaps.HNs.mapNs.SpatialStyleNs.Options = null,
    zIndex: Int | Double = null
  ): ObjectStyleOptions = {
    val __obj = js.Dynamic.literal(icon = icon)
    if (arrows != null) __obj.updateDynamic("arrows")(arrows)
    if (style != null) __obj.updateDynamic("style")(style)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStyleOptions]
  }
}

