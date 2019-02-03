package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@JSGlobal("H.datalens.SpatialLayer")
@js.native
class SpatialLayer protected ()
  extends heremapsLib.HNs.mapNs.layerNs.TileLayer {
  /**
    * Constructor
    * @param dataProvider - Source of tiled data (pass in null if data come from feature properties)
    * @param spatialProvider - Source of geometry data
    * @param options - Configuration for data processing and rendering
    */
  def this(dataProvider: Provider, spatialProvider: SpatialTileProvider, options: heredatalensLib.HNs.datalensNs.SpatialLayerNs.Options) = this()
  /**
    * Forces re-rendering of the layer. When the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): scala.Unit = js.native
  /**
    * This method changes the state of a map object; for example, style on mouse event.
    */
  def updateSpatialStyle(
    spatial: heremapsLib.HNs.mapNs.Object,
    state: heredatalensLib.HNs.datalensNs.SpatialLayerNs.StyleState
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("H.datalens.SpatialLayer")
@js.native
object SpatialLayer extends js.Object {
  var DEFAULT_STATE: js.Any = js.native
  var Spatial: js.Any = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  var defaultDataToRows: js.Any = js.native
}

