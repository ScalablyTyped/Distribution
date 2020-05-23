package typings.heredatalens.H.datalens.ObjectLayer

import typings.heremaps.H.map.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output from the rowToStyle callback.
  * Defines the styles or the icon that is applied to the map object.
  */
trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[typings.heremaps.H.map.ArrowStyle.Options] = js.undefined
  /** Marker icon */
  var icon: Icon
  /** Spatial style */
  var style: js.UndefOr[typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ObjectStyleOptions {
  @scala.inline
  def apply(
    icon: Icon,
    arrows: typings.heremaps.H.map.ArrowStyle.Options = null,
    style: typings.heremaps.H.map.SpatialStyle.Options = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ObjectStyleOptions = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStyleOptions]
  }
}

