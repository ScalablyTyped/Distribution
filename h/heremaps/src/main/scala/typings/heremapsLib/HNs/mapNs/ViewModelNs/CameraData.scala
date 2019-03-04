package typings
package heremapsLib.HNs.mapNs.ViewModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines camera's properties.
  * @property zoom {number=} - zoom level to be used by rendering engine
  * @property position {H.geo.IPoint} - the position of the virtual camera in geo-space
  * @property pitch {number=} - the rotation of the virtual camera along its local x-axis
  * @property yaw {number=} - the rotation of the virtual camera along its local y-axis
  * @property roll {number=} - the rotation of the virtual camera along its local z-axis
  * @property fov {number=} -
  */
trait CameraData extends js.Object {
  var fov: js.UndefOr[scala.Double] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var position: heremapsLib.HNs.geoNs.IPoint
  var roll: js.UndefOr[scala.Double] = js.undefined
  var yaw: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object CameraData {
  @scala.inline
  def apply(
    position: heremapsLib.HNs.geoNs.IPoint,
    fov: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null,
    roll: scala.Int | scala.Double = null,
    yaw: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): CameraData = {
    val __obj = js.Dynamic.literal(position = position)
    if (fov != null) __obj.updateDynamic("fov")(fov.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (roll != null) __obj.updateDynamic("roll")(roll.asInstanceOf[js.Any])
    if (yaw != null) __obj.updateDynamic("yaw")(yaw.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraData]
  }
}

