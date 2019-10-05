package typings.heredatalens.H.datalens

import typings.heremaps.H.map.layer.TileLayer
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
class RasterLayer_ () extends TileLayer {
  /**
    * Force re-rendering of the layer.
    * In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
}

