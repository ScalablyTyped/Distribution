package typings.googlemapsDotInfobubble.google.maps.infobubble

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBubble extends js.Object {
  /**
    * Closes the infobubble
    */
  def close(): Unit
  /**
    * Returns the position of the InfoBubble
    */
  def getPosition(): LatLng
  /**
    * Checks if the infobubble is currently open
    */
  def isOpen(): Boolean
  /**
    * Opens the infobubble
    * @map The google map object
    * @marker The marker used for anchoring the infobubble to
    */
  def open(map: Map, marker: Marker): Unit
}

object InfoBubble {
  @scala.inline
  def apply(close: () => Unit, getPosition: () => LatLng, isOpen: () => Boolean, open: (Map, Marker) => Unit): InfoBubble = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPosition = js.Any.fromFunction0(getPosition), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction2(open))
  
    __obj.asInstanceOf[InfoBubble]
  }
}

