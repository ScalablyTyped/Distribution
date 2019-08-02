package typings.atMapboxMapboxDashSdk.servicesStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarkerOverlay extends js.Object {
  var marker: CustomMarker
}

object CustomMarkerOverlay {
  @scala.inline
  def apply(marker: CustomMarker): CustomMarkerOverlay = {
    val __obj = js.Dynamic.literal(marker = marker)
  
    __obj.asInstanceOf[CustomMarkerOverlay]
  }
}

