package typings.heredatalens.HNs.datalensNs

import typings.heredatalens.HNs.datalensNs.RawDataProviderNs.Options
import typings.heremaps.HNs.mapNs.providerNs.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how to load data from a raw data file
  * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
  */
@JSGlobal("H.datalens.RawDataProvider")
@js.native
class RawDataProvider protected () extends RemoteTileProvider {
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

