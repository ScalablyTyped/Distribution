package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait SaveWidget extends js.Object {
  def getAttribution(): Attribution
  def getPlace(): Place
  def setAttribution(attribution: Attribution): Unit
  def setOptions(opts: SaveWidgetOptions): Unit
  def setPlace(place: Place): Unit
}

object SaveWidget {
  @scala.inline
  def apply(
    getAttribution: () => Attribution,
    getPlace: () => Place,
    setAttribution: Attribution => Unit,
    setOptions: SaveWidgetOptions => Unit,
    setPlace: Place => Unit
  ): SaveWidget = {
    val __obj = js.Dynamic.literal(getAttribution = js.Any.fromFunction0(getAttribution), getPlace = js.Any.fromFunction0(getPlace), setAttribution = js.Any.fromFunction1(setAttribution), setOptions = js.Any.fromFunction1(setOptions), setPlace = js.Any.fromFunction1(setPlace))
    __obj.asInstanceOf[SaveWidget]
  }
}

