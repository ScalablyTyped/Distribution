package typings.heredatalens.H.datalens

import typings.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how to load data from a raw data file
  * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
  */
@js.native
trait RawDataProvider_ extends RemoteTileProvider {
  
  /**
    * Updates the data url. Note that new data will be fetched only after the reload method is called.
    */
  def setDataUrl(dataUrl: String): Unit = js.native
}
