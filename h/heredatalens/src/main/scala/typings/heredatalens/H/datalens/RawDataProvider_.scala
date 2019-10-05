package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.RawDataProvider.Options
import typings.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how to load data from a raw data file
  * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
  */
@JSGlobal("H.datalens.RawDataProvider")
@js.native
class RawDataProvider_ protected () extends RemoteTileProvider {
  /**
    * Constructor
    * @param options - Configures options
    */
  def this(options: Options) = this()
  /**
    * Updates the data url. Note that new data will be fetched only after the reload method is called.
    */
  def setDataUrl(dataUrl: String): Unit = js.native
}

