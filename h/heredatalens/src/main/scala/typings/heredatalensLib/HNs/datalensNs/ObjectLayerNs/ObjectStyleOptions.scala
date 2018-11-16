package typings
package heredatalensLib.HNs.datalensNs.ObjectLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Output from the rowToStyle callback.
         * Defines the styles or the icon that is applied to the map object.
         */

trait ObjectStyleOptions extends js.Object {
  /** Style of arrows to render along a polyline */
  var arrows: js.UndefOr[heremapsLib.HNs.mapNs.ArrowStyleNs.Options] = js.undefined
  /** Marker icon */
  var icon: heremapsLib.HNs.mapNs.Icon
  /** Spatial style */
  var style: js.UndefOr[heremapsLib.HNs.mapNs.SpatialStyleNs.Options] = js.undefined
  /** The z-index value of the map object, default is 0 */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

