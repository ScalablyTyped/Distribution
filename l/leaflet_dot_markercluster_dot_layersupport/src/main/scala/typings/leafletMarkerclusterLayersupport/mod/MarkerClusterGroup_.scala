package typings.leafletMarkerclusterLayersupport.mod

import typings.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "MarkerClusterGroup")
@js.native
object MarkerClusterGroup_ extends js.Object {
  
  @js.native
  trait LayerSupport
    extends typings.leafletMarkercluster.mod.MarkerClusterGroup_ {
    
    def checkIn(layers: js.Array[Layer]): this.type = js.native
    /**
      * Stamps the passed layers as being part of this group, but without adding
      * them to the map right now.
      */
    def checkIn(layers: Layer): this.type = js.native
    
    def checkOut(layers: js.Array[Layer]): this.type = js.native
    /**
      * Un-stamps the passed layers from being part of this group. It has to
      * remove them from map (if they are) since they will no longer cluster.
      */
    def checkOut(layers: Layer): this.type = js.native
  }
}
