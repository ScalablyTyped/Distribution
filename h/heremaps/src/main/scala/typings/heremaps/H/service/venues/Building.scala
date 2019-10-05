package typings.heremaps.H.service.venues

import typings.heremaps.H.map.Group
import typings.heremaps.H.map.provider.ObjectProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class represents the building in the venue hiearachy (see H.service.venues.Venue) and holds floors that belong to the building.
  */
@JSGlobal("H.service.venues.Building")
@js.native
class Building protected () extends Group {
  /**
    * Constructor
    * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue building
    * @param uid {string} - The unique identifier of this building
    * @param minLevel {number} - The minimum floor level of this building
    * @param maxLevel {number} - The maximum floor level of this building
    */
  def this(provider: ObjectProvider, uid: String, minLevel: Double, maxLevel: Double) = this()
  /**
    * Method returns the floor (see H.service.venues.Floor) if one was already loaded. This method doesn't make attempt to fetch the floor data.
    * @param level {number} - floor level within minimum and maximum level boundaries for the building
    * @returns {(H.service.venues.Floor | undefined)} - The floor object or undefined if floor was not loaded
    */
  def getFloor(level: Double): Floor | Unit = js.native
  /**
    * Method returns the maximum floor level of this building
    * @returns {number}
    */
  def getMaxLevel(): Double = js.native
  /**
    * Method returns the minimum floor level of this building.
    * @returns {number}
    */
  def getMinLevel(): Double = js.native
  /**
    * Method returns the parent object - venue (see H.service.venues.Venue) to which the building belongs to.
    * @returns {H.service.venues.Venue}
    */
  def getVenue(): Venue = js.native
}

