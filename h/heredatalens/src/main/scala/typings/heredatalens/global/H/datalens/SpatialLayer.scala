package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.SpatialLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@JSGlobal("H.datalens.SpatialLayer")
@js.native
class SpatialLayer protected ()
  extends typings.heredatalens.H.datalens.SpatialLayer {
  /**
    * Constructor
    * @param dataProvider - Source of tiled data (pass in null if data come from feature properties)
    * @param spatialProvider - Source of geometry data
    * @param options - Configuration for data processing and rendering
    */
  def this(
    dataProvider: typings.heredatalens.H.datalens.Provider,
    spatialProvider: typings.heredatalens.H.datalens.SpatialTileProvider,
    options: Options
  ) = this()
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
