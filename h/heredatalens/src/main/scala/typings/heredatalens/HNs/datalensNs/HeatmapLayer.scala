package typings.heredatalens.HNs.datalensNs

import typings.heredatalens.HNs.datalensNs.HeatmapLayerNs.Aggregation
import typings.heredatalens.HNs.datalensNs.HeatmapLayerNs.InputScale
import typings.heredatalens.HNs.datalensNs.HeatmapLayerNs.Options
import typings.heredatalens.HNs.datalensNs.HeatmapLayerNs.Row
import typings.heredatalens.HNs.datalensNs.QueryTileProviderNs.X
import typings.heredatalens.HNs.datalensNs.QueryTileProviderNs.Y
import typings.heredatalens.HNs.datalensNs.QueryTileProviderNs.Zoom
import typings.heredatalens.HNs.datalensNs.ServiceNs.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality of value-based heat map with density alpha mask.
  * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
  * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
  * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
  */
@JSGlobal("H.datalens.HeatmapLayer")
@js.native
class HeatmapLayer protected () extends RasterLayer {
  /**
    * Constructor
    * @param provider - Source of tiled data
    * @param options - Configuration for data processing and rendering
    */
  def this(provider: QueryTileProvider, options: Options) = this()
  /**
    * @param zoom - zoom level
    */
  def getOptionsPerZoom(zoom: Double): Options = js.native
}

/* static members */
@JSGlobal("H.datalens.HeatmapLayer")
@js.native
object HeatmapLayer extends js.Object {
  /**
    * Set of possible values for the aggregation option
    */
  var aggregation: Aggregation = js.native
  /**
    * Set of possible values for the inputScale option
    */
  var inputScale: InputScale = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: Data, x: X, y: Y, zoom: Zoom): js.Array[Row] = js.native
}

