package typings.heremaps.H.service.venues

import typings.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
  */
@js.native
trait TileProvider_ extends RemoteTileProvider {
  
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
