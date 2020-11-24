package typings.leafletMarkerclusterLayersupport.mod

import typings.leafletMarkercluster.mod.MarkerClusterGroupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerClusterGroupLayerSupportOptions extends MarkerClusterGroupOptions {
  
  /**
    * Buffer single addLayer and removeLayer requests for efficiency.
    */
  var singleAddRemoveBufferDuration: Double = js.native
}
object MarkerClusterGroupLayerSupportOptions {
  
  @scala.inline
  def apply(singleAddRemoveBufferDuration: Double): MarkerClusterGroupLayerSupportOptions = {
    val __obj = js.Dynamic.literal(singleAddRemoveBufferDuration = singleAddRemoveBufferDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
  }
  
  @scala.inline
  implicit class MarkerClusterGroupLayerSupportOptionsOps[Self <: MarkerClusterGroupLayerSupportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSingleAddRemoveBufferDuration(value: Double): Self = this.set("singleAddRemoveBufferDuration", value.asInstanceOf[js.Any])
  }
}
