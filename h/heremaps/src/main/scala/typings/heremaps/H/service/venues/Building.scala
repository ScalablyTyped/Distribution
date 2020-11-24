package typings.heremaps.H.service.venues

import typings.heremaps.H.map.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class represents the building in the venue hiearachy (see H.service.venues.Venue) and holds floors that belong to the building.
  */
@js.native
trait Building extends Group {
  
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
