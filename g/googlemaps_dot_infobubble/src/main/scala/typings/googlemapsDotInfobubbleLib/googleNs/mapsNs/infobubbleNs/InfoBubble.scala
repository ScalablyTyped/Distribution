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

object InfoBubble {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    getPosition: () => googlemapsLib.googleNs.mapsNs.LatLng,
    isOpen: () => scala.Boolean,
    open: (googlemapsLib.googleNs.mapsNs.Map, googlemapsLib.googleNs.mapsNs.Marker) => scala.Unit
  ): InfoBubble = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPosition = js.Any.fromFunction0(getPosition), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction2(open))
  
    __obj.asInstanceOf[InfoBubble]
  }
}

