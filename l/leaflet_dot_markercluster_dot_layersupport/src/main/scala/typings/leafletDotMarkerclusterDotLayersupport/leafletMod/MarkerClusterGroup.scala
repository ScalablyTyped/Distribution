package typings.leafletDotMarkerclusterDotLayersupport.leafletMod

import typings.leaflet.leafletMod.Layer
import typings.leafletDotMarkerclusterDotLayersupport.leafletMod.MarkerClusterGroup.LayerSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "MarkerClusterGroup")
@js.native
object MarkerClusterGroup extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MarkerClusterGroup * / any */ @js.native
  trait LayerSupport extends js.Object {
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

@JSImport("leaflet", "markerClusterGroup")
@js.native
object markerClusterGroup extends js.Object {
  /**
    * Create a layer support marker cluster group, optionally given marker cluster group options.
    */
  def layerSupport(): LayerSupport = js.native
  def layerSupport(options: MarkerClusterGroupLayerSupportOptions): LayerSupport = js.native
}

