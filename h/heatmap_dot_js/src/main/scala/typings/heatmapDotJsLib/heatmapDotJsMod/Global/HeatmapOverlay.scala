package typings
package heatmapDotJsLib.heatmapDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The overlay layer to be added onto leaflet map
  */
/* RemoveDifficultInheritance: 
- Dropped any */ @JSGlobal("HeatmapOverlay")
@js.native
class HeatmapOverlay[V /* <: java.lang.String */, TLat /* <: java.lang.String */, TLng /* <: java.lang.String */] protected () extends js.Object {
  /**
    * Initialization function
    */
  def this(configuration: heatmapDotJsLib.heatmapDotJsMod.HeatmapOverlayConfiguration[V, TLat, TLng]) = this()
  /**
    * Experimential... not ready.
    */
  def addData(data: heatmapDotJsLib.heatmapDotJsMod.DataPoint[V, TLat, TLng]): scala.Unit = js.native
  def addData(data: js.Array[heatmapDotJsLib.heatmapDotJsMod.DataPoint[V, TLat, TLng]]): scala.Unit = js.native
  /**
    * Create DOM elements for an overlay, adding them to map panes and puts
    * listeners on relevant map events
    */
  def onAdd(map: leafletLib.leafletMod.Map): scala.Unit = js.native
  /**
    * Remove the overlay's elements from the DOM and remove listeners
    * previously added by onAdd()
    */
  def onRemove(map: leafletLib.leafletMod.Map): scala.Unit = js.native
  /**
    * Initialize a heatmap instance with the given dataset
    */
  def setData(
    data: heatmapDotJsLib.heatmapDotJsMod.HeatmapData[heatmapDotJsLib.heatmapDotJsMod.DataPoint[V, TLat, TLng]]
  ): scala.Unit = js.native
}

