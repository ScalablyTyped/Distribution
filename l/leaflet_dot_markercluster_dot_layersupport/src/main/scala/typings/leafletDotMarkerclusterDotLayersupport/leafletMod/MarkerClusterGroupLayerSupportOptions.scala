package typings.leafletDotMarkerclusterDotLayersupport.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MarkerClusterGroupLayerSupportOptions extends js.Object {
  /**
    * Buffer single addLayer and removeLayer requests for efficiency.
    */
  var singleAddRemoveBufferDuration: Double
}

object MarkerClusterGroupLayerSupportOptions {
  @scala.inline
  def apply(singleAddRemoveBufferDuration: Double): MarkerClusterGroupLayerSupportOptions = {
    val __obj = js.Dynamic.literal(singleAddRemoveBufferDuration = singleAddRemoveBufferDuration)
  
    __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
  }
}

