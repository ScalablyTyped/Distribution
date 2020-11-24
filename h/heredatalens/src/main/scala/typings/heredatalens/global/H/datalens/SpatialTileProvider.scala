package typings.heredatalens.global.H.datalens

import typings.heredatalens.H.datalens.SpatialTileProvider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
  * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
  * Data is loaded by tiles.
  */
@JSGlobal("H.datalens.SpatialTileProvider")
@js.native
class SpatialTileProvider protected ()
  extends typings.heredatalens.H.datalens.SpatialTileProvider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures layer name
    */
  def this(service: typings.heredatalens.H.datalens.Service, options: Options) = this()
}
/* static members */
@JSGlobal("H.datalens.SpatialTileProvider")
@js.native
object SpatialTileProvider extends js.Object {
  
  var VectorTile: js.Any = js.native
}
