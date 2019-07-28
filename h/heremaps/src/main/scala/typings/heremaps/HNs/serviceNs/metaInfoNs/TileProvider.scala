package typings.heremaps.HNs.serviceNs.metaInfoNs

import typings.heremaps.HNs.mapNs.providerNs.RemoteTileProvider
import typings.heremaps.HNs.serviceNs.MapTileService
import typings.heremaps.HNs.serviceNs.ServiceParameters
import typings.heremaps.HNs.serviceNs.metaInfoNs.TileProviderNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
  */
@JSGlobal("H.service.metaInfo.TileProvider")
@js.native
class TileProvider protected () extends RemoteTileProvider {
  def this(service: MapTileService) = this()
  /**
    * Constructor
    * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
    * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
    * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
    */
  def this(service: Service) = this()
  def this(service: MapTileService, opt_params: ServiceParameters) = this()
  def this(service: Service, opt_params: ServiceParameters) = this()
  def this(service: MapTileService, opt_params: ServiceParameters, opt_options: Options) = this()
  def this(service: Service, opt_params: ServiceParameters, opt_options: Options) = this()
}

