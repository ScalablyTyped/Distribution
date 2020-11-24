package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.HeatmapLayer.Aggregation
import typings.heredatalens.H.datalens.HeatmapLayer.InputScale
import typings.heredatalens.H.datalens.HeatmapLayer.Options
import typings.heredatalens.H.datalens.HeatmapLayer.Row
import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality of value-based heat map with density alpha mask.
  * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
  * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
  * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
  */
@JSGlobal("H.datalens.HeatmapLayer")
@js.native
class HeatmapLayer protected ()
  extends typings.heredatalens.H.datalens.HeatmapLayer {
  /**
    * Constructor
    * @param provider - Source of tiled data
    * @param options - Configuration for data processing and rendering
    */
  def this(provider: typings.heredatalens.H.datalens.QueryTileProvider, options: Options) = this()
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
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: Data, x: X, y: Y, zoom: Zoom): js.Array[Row] = js.native
  
  /**
    * Set of possible values for the inputScale option
    */
  var inputScale: InputScale = js.native
  
  /**
    * Set of possible values for the aggregation option.
    * If the heat map input data is buckets, then different types of aggregation can be applied to the rows in a bucket.
    * The aggregation type is required for proper blending mode of the heat map. For the AVERAGE aggregation type, an averaged heat map is rendered.
    */
  @js.native
  object Aggregation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heredatalens.H.datalens.HeatmapLayer.Aggregation with Double] = js.native
    
    /* 1 */ val AVERAGE: typings.heredatalens.H.datalens.HeatmapLayer.Aggregation.AVERAGE with Double = js.native
    
    /* 0 */ val SUM: typings.heredatalens.H.datalens.HeatmapLayer.Aggregation.SUM with Double = js.native
  }
  
  /**
    * Set of possible values for the inputScale option.
    * The input scale is required for proper heat map blending. If the input scale is not linear, then the TilePoint.value is converted to linear scale before calculating the sum or average.
    */
  @js.native
  object InputScale extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.heredatalens.H.datalens.HeatmapLayer.InputScale with Double] = js.native
    
    /* 0 */ val DB: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.DB with Double = js.native
    
    /* 1 */ val LINEAR: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LINEAR with Double = js.native
    
    /* 2 */ val LOG: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LOG with Double = js.native
  }
}
