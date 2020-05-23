package typings.heremaps.H.service.venues

import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.SpatialStyle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a spatial object for this space. Each space object contains data associated with that space and can be retrieved by using H.service.venues.Space#getData method.
  */
@js.native
trait Space extends js.Object {
  /**
    * Method returns raw data associated with the space. For more details on data format see
    * http://developer.here.com/rest-apis/documentation/venue-maps/topics/resource-type-venue-interaction-tile-space.html
    * @returns {Object} - raw space data object
    */
  def getData(): js.Object = js.native
  /**
    * Method returns parent object - floor (see H.service.venues.Floor) of the space.
    * @returns {H.service.venues.Floor}
    */
  def getFloor(): Floor = js.native
  /**
    * This method sets custom style to use for rendering the labels. Should be called before the first render of the space, otherwise has no any effect. Note that due to the design
    * consistency currently it is not allowed to change the font family and the size of the labels.
    * @param labelStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - Custom label style
    */
  def initLabelStyle(labelStyle: SpatialStyle): Unit = js.native
  def initLabelStyle(labelStyle: Options): Unit = js.native
  /**
    * The method indicates whether the spatial object represents the whole floor space or a space within a floor boundaries, that belongs to the floor.
    * @returns {boolean} - True if this spatial object represents the floor space.
    */
  def isFloorSpace(): Boolean = js.native
}

