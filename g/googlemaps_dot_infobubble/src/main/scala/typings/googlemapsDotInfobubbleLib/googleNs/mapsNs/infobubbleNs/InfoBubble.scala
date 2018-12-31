package typings
package googlemapsDotInfobubbleLib.googleNs.mapsNs.infobubbleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBubble extends js.Object {
  /**
    * Closes the infobubble
    */
  def close(): scala.Unit
  /**
    * Returns the position of the InfoBubble
    */
  def getPosition(): googlemapsLib.googleNs.mapsNs.LatLng
  /**
    * Checks if the infobubble is currently open
    */
  def isOpen(): scala.Boolean
  /**
    * Opens the infobubble
    * @map The google map object
    * @marker The marker used for anchoring the infobubble to
    */
  def open(map: googlemapsLib.googleNs.mapsNs.Map, marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Unit
}

