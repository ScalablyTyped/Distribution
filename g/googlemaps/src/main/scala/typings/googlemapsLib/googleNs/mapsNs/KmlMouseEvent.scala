package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlMouseEvent extends js.Object {
  var featureData: KmlFeatureData
  var latLng: LatLng
  var pixelOffset: Size
}

object KmlMouseEvent {
  @scala.inline
  def apply(featureData: KmlFeatureData, latLng: LatLng, pixelOffset: Size): KmlMouseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("featureData")(featureData)
    __obj.updateDynamic("latLng")(latLng)
    __obj.updateDynamic("pixelOffset")(pixelOffset)
    __obj.asInstanceOf[KmlMouseEvent]
  }
}

