package typings.heredatalens.HNs.datalensNs

import typings.heredatalens.HNs.datalensNs.RasterLayerNs.TilePoint
import typings.heremaps.HNs.mapNs.layerNs.TileLayer
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides pixel-wise rendering of data.
  * Layer used when you need to visualize more than 10k points. The layer requires source data to be located in pixel coordinates.
  * The rendering is implemented by drawing directly on a canvas.  The layer is often used together with a Data Lens query which groups rows by pixels.
  * This reduces the amount of data delivered to the client.
  */
@JSGlobal("H.datalens.RasterLayer")
@js.native
/**
  * Constructor
  */
class RasterLayer () extends TileLayer {
  /**
    * Force re-rendering of the layer.
    * In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
}

/* static members */
@JSGlobal("H.datalens.RasterLayer")
@js.native
object RasterLayer extends js.Object {
  /**
    * Default value for dataToRows callback option.
    * It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
  /**
    * This is a default implementation of renderTile callback. This method represents each point as a black 1x1 pixel square.
    * @param points - Input data points within a tile
    * @param canvas - The target canvas
    */
  def defaultRenderTile(points: js.Array[TilePoint], canvas: HTMLCanvasElement): Unit = js.native
}

