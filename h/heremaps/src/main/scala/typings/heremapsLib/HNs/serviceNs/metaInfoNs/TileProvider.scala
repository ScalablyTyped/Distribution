package typings
package heremapsLib.HNs.serviceNs.metaInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
             */
@JSGlobal("H.service.metaInfo.TileProvider")
@js.native
class TileProvider protected ()
  extends heremapsLib.HNs.mapNs.providerNs.RemoteTileProvider {
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: heremapsLib.HNs.serviceNs.MapTileService) = this()
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: Service) = this()
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: heremapsLib.HNs.serviceNs.MapTileService, opt_params: heremapsLib.HNs.serviceNs.ServiceParameters) = this()
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: Service, opt_params: heremapsLib.HNs.serviceNs.ServiceParameters) = this()
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: heremapsLib.HNs.serviceNs.MapTileService, opt_params: heremapsLib.HNs.serviceNs.ServiceParameters, opt_options: heremapsLib.HNs.serviceNs.metaInfoNs.TileProviderNs.Options) = this()
  /**
                   * Constructor
                   * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
                   * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
                   * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
                   */
  def this(service: Service, opt_params: heremapsLib.HNs.serviceNs.ServiceParameters, opt_options: heremapsLib.HNs.serviceNs.metaInfoNs.TileProviderNs.Options) = this()
}

