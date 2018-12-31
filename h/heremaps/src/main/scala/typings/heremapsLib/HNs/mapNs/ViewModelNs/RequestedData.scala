package typings
package heremapsLib.HNs.mapNs.ViewModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines currently requested view data, which will be rendered by the map.
  * @property camera {H.map.ViewModel.CameraData=} - The requested camera properties
  * @property zoom {number=} - The requested zoom level
  * @property animate {boolean=} - indicates if the requested transition should be animated
  */
trait RequestedData extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var camera: js.UndefOr[CameraData] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

