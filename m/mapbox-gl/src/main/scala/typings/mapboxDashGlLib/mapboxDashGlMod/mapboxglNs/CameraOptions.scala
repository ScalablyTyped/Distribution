package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraOptions extends js.Object {
  /** If zooming, the zoom center (defaults to map center) */
  var around: js.UndefOr[LngLatLike] = js.undefined
  /** Map rotation bearing in degrees counter-clockwise from north */
  var bearing: js.UndefOr[scala.Double] = js.undefined
  /** Map center */
  var center: js.UndefOr[LngLatLike] = js.undefined
  /** Map angle in degrees at which the camera is looking at the ground */
  var pitch: js.UndefOr[scala.Double] = js.undefined
  /** Map zoom level */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

