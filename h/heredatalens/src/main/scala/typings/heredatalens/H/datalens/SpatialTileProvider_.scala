package typings.heredatalens.H.datalens

import typings.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
  * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
  * Data is loaded by tiles.
  */
@js.native
trait SpatialTileProvider_ extends RemoteTileProvider {
  /**
    * Updates the layer name to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    */
  def setLayerName(layerName: String): Unit = js.native
  def setQueryParams(): Unit = js.native
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    */
  def setQueryParams(queryParams: js.Any): Unit = js.native
}

