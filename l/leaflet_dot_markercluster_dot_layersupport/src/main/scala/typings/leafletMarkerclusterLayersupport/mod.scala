package typings.leafletMarkerclusterLayersupport

import typings.leaflet.mod.Layer
import typings.leafletMarkercluster.mod.MarkerClusterGroupOptions
import typings.leafletMarkerclusterLayersupport.mod.MarkerClusterGroup_.LayerSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object markerClusterGroup {
    
    /**
      * Create a layer support marker cluster group, optionally given marker cluster group options.
      */
    @JSImport("leaflet", "markerClusterGroup.layerSupport")
    @js.native
    def layerSupport(): LayerSupport = js.native
    @JSImport("leaflet", "markerClusterGroup.layerSupport")
    @js.native
    def layerSupport(options: MarkerClusterGroupLayerSupportOptions): LayerSupport = js.native
  }
  
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
    implicit class MarkerClusterGroupLayerSupportOptionsMutableBuilder[Self <: MarkerClusterGroupLayerSupportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSingleAddRemoveBufferDuration(value: Double): Self = StObject.set(x, "singleAddRemoveBufferDuration", value.asInstanceOf[js.Any])
    }
  }
  
  object MarkerClusterGroup_ {
    
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
}
