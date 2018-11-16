package typings
package heremapsLib.HNs.serviceNs.venuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
             */
@JSGlobal("H.service.venues.TileProvider")
@js.native
class TileProvider protected ()
  extends heremapsLib.HNs.mapNs.providerNs.RemoteTileProvider {
  /**
                   * Constructor
                   * @param service {H.service.venues.Service}
                   * @param opt_options {H.service.venues.TileProvider.Options=}
                   */
  def this(service: Service) = this()
  /**
                   * Constructor
                   * @param service {H.service.venues.Service}
                   * @param opt_options {H.service.venues.TileProvider.Options=}
                   */
  def this(service: Service, opt_options: heremapsLib.HNs.serviceNs.venuesNs.TileProviderNs.Options) = this()
  /**
                   * Method returns the floor level that provider uses for tile fetching.
                   * @returns {number} - current provider's floor level
                   */
  def getCurrentLevel(): scala.Double = js.native
  /**
                   * Method specifies which floor level of the venues must be fetched by provider. Floor level is global to all venues and defaults to 0.
                   * @param level {number}
                   */
  def setCurrentLevel(level: scala.Double): scala.Unit = js.native
}

