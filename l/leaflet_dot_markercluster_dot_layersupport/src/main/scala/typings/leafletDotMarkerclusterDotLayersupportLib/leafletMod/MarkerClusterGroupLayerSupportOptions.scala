package typings
package leafletDotMarkerclusterDotLayersupportLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MarkerClusterGroupLayerSupportOptions extends js.Object {
  /**
    * Buffer single addLayer and removeLayer requests for efficiency.
    */
  var singleAddRemoveBufferDuration: scala.Double
}

object MarkerClusterGroupLayerSupportOptions {
  @scala.inline
  def apply(singleAddRemoveBufferDuration: scala.Double): MarkerClusterGroupLayerSupportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("singleAddRemoveBufferDuration")(singleAddRemoveBufferDuration)
    __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
  }
}

