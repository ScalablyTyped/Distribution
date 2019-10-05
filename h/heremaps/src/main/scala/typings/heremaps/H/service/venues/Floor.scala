package typings.heremaps.H.service.venues

import typings.heremaps.H.map.Group
import typings.heremaps.H.map.provider.ObjectProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class represents the floor object in the venue hierarchy (see H.service.venues.Venue). The class holds information about floor geometry and spaces (see H.service.venues.Space)
  * that belong to this floor.
  */
@JSGlobal("H.service.venues.Floor")
@js.native
class Floor protected () extends Group {
  /**
    * Constructor
    * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue floor
    * @param data {*} - The meta data of this floor
    * @param level {number} - The level of this floor
    */
  def this(provider: ObjectProvider, data: js.Any, level: Double) = this()
  /**
    * Method returns parent object - building (see H.service.venues.Building) of the floor.
    * @returns {H.service.venues.Building}
    */
  def getBuilding(): Building = js.native
  /**
    * Method returns map geometry that represents floor boundaries.
    * @returns {(H.service.venues.Space | undefined)}
    */
  def getFloorSpace(): Space | Unit = js.native
  /**
    * Method returns the level of the floor in the building.
    * @returns {number}
    */
  def getLevel(): Double = js.native
  /**
    * Method returns the space object with the given ID, that belongs to the floor.
    * @param id {string} - The ID of the space.
    * @returns {(H.service.venues.Space | undefined)} - The requested space or undefined if space not found.
    */
  def getSpace(id: String): Space | Unit = js.native
  /**
    * Method returns the H.map.Group of all spaces that belong to the floor.
    * @returns {H.map.Group}
    */
  def getSpaces(): Group = js.native
}

