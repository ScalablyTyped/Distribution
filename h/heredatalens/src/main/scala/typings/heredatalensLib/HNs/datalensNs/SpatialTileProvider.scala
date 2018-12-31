package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
  * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
  * Data is loaded by tiles.
  */
@JSGlobal("H.datalens.SpatialTileProvider")
@js.native
class SpatialTileProvider protected ()
  extends heremapsLib.HNs.mapNs.providerNs.RemoteTileProvider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures layer name
    */
  def this(service: Service, options: heredatalensLib.HNs.datalensNs.SpatialTileProviderNs.Options) = this()
  /**
    * Updates the layer name to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    */
  def setLayerName(layerName: java.lang.String): scala.Unit = js.native
  def setQueryParams(): scala.Unit = js.native
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    */
  def setQueryParams(queryParams: js.Any): scala.Unit = js.native
}

/**
  * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
  * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
  * Data is loaded by tiles.
  */
@JSGlobal("H.datalens.SpatialTileProvider")
@js.native
object SpatialTileProvider extends js.Object {
  var VectorTile: js.Any = js.native
}

