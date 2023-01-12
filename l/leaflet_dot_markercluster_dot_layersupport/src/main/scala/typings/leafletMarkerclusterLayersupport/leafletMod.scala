package typings.leafletMarkerclusterLayersupport

import typings.leaflet.mod.Layer
import typings.leafletMarkercluster.leafletMod.MarkerClusterGroupOptions
import typings.leafletMarkerclusterLayersupport.leafletMod.MarkerClusterGroup_.LayerSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object markerClusterGroup {
    
    @JSImport("leaflet", "markerClusterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a layer support marker cluster group, optionally given marker cluster group options.
      */
    inline def layerSupport(): LayerSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("layerSupport")().asInstanceOf[LayerSupport]
    inline def layerSupport(options: MarkerClusterGroupLayerSupportOptions): LayerSupport = ^.asInstanceOf[js.Dynamic].applyDynamic("layerSupport")(options.asInstanceOf[js.Any]).asInstanceOf[LayerSupport]
  }
  
  trait MarkerClusterGroupLayerSupportOptions
    extends StObject
       with MarkerClusterGroupOptions {
    
    /**
      * Buffer single addLayer and removeLayer requests for efficiency.
      */
    var singleAddRemoveBufferDuration: Double
  }
  object MarkerClusterGroupLayerSupportOptions {
    
    inline def apply(singleAddRemoveBufferDuration: Double): MarkerClusterGroupLayerSupportOptions = {
      val __obj = js.Dynamic.literal(singleAddRemoveBufferDuration = singleAddRemoveBufferDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerClusterGroupLayerSupportOptions] (val x: Self) extends AnyVal {
      
      inline def setSingleAddRemoveBufferDuration(value: Double): Self = StObject.set(x, "singleAddRemoveBufferDuration", value.asInstanceOf[js.Any])
    }
  }
  
  object MarkerClusterGroup_ {
    
    @js.native
    trait LayerSupport
      extends typings.leafletMarkercluster.leafletMod.MarkerClusterGroup_ {
      
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
