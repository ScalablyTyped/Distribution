package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines how to load data from a raw data file
     * This provider defines the interface for loading data, such as geometries or coordinates, from a local or remote data file in GeoJSON or CSV format
     */
@JSGlobal("H.datalens.RawDataProvider")
@js.native
class RawDataProvider protected ()
  extends heremapsLib.HNs.mapNs.providerNs.RemoteTileProvider {
  /**
           * Constructor
           * @param options - Configures options
           */
  def this(options: heredatalensLib.HNs.datalensNs.RawDataProviderNs.Options) = this()
  /**
           * Updates the data url. Note that new data will be fetched only after the reload method is called.
           */
  def setDataUrl(dataUrl: java.lang.String): scala.Unit = js.native
}

