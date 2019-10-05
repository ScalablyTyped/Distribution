package typings.heremaps.H.service.venues

import typings.heremaps.H.map.provider.RemoteTileProvider
import typings.heremaps.H.service.venues.TileProvider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
  */
@JSGlobal("H.service.venues.TileProvider")
@js.native
class TileProvider_ protected () extends RemoteTileProvider {
  /**
    * Constructor
    * @param service {H.service.venues.Service}
    * @param opt_options {H.service.venues.TileProvider.Options=}
    */
  def this(service: Service) = this()
  def this(service: Service, opt_options: Options) = this()
  /**
    * Method returns the floor level that provider uses for tile fetching.
    * @returns {number} - current provider's floor level
    */
  def getCurrentLevel(): Double = js.native
  /**
    * Method specifies which floor level of the venues must be fetched by provider. Floor level is global to all venues and defaults to 0.
    * @param level {number}
    */
  def setCurrentLevel(level: Double): Unit = js.native
}

