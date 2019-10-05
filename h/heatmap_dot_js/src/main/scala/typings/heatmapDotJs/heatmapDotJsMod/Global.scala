package typings.heatmapDotJs.heatmapDotJsMod

import typings.leaflet.leafletMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  /**
    * The overlay layer to be added onto leaflet map
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Leaflet.ILayer * / any */ @js.native
  class HeatmapOverlay[V /* <: String */, TLat /* <: String */, TLng /* <: String */] protected () extends js.Object {
    /**
      * Initialization function
      */
    def this(configuration: HeatmapOverlayConfiguration[V, TLat, TLng]) = this()
    def addData(data: js.Array[DataPoint[V, TLat, TLng]]): Unit = js.native
    /**
      * Experimential... not ready.
      */
    def addData(data: DataPoint[V, TLat, TLng]): Unit = js.native
    /**
      * Create DOM elements for an overlay, adding them to map panes and puts
      * listeners on relevant map events
      */
    def onAdd(map: Map): Unit = js.native
    /**
      * Remove the overlay's elements from the DOM and remove listeners
      * previously added by onAdd()
      */
    def onRemove(map: Map): Unit = js.native
    /**
      * Initialize a heatmap instance with the given dataset
      */
    def setData(data: HeatmapData[DataPoint[V, TLat, TLng]]): Unit = js.native
  }
  
}

