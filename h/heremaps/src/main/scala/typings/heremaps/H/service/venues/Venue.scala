package typings.heremaps.H.service.venues

import typings.heremaps.H.map.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The class represents the venue, it is a root for the venue object heirarchy. The venue inherits from H.map.Group and holds building objects (see H.service.venues.Building).
  * Building objects hold floor objects (see H.service.venues.Floor) and inherit from H.map.Group as well. Leaf objects are spaces (see H.service.venues.Space) that are spatial map objects
  * and reside inside floor containers.
  */
@js.native
trait Venue extends Group {
  
  /**
    * Method returns the building object, that belongs to the venue, with the given ID . The method doesn't attempt to fetch building data.
    * @param id {string} - the ID of the building
    * @returns {(H.service.venues.Building | undefined)} - The requested building or undefined if building wasn't loaded
    */
  def getBuilding(id: String): Building | Unit = js.native
  
  /**
    * Method returns map of all loaded buildings associated with the venue.
    * @returns {Object<*, H.service.venues.Building>}
    */
  def getBuildings(): js.Any = js.native
}
