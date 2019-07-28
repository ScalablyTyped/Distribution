package typings.googlemaps.googleNs.mapsNs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.SaveWidget")
@js.native
class SaveWidget protected () extends js.Object {
  def this(container: Node) = this()
  def this(container: Node, opts: SaveWidgetOptions) = this()
  def getAttribution(): Attribution = js.native
  def getPlace(): Place = js.native
  def setAttribution(attribution: Attribution): Unit = js.native
  def setOptions(opts: SaveWidgetOptions): Unit = js.native
  def setPlace(place: Place): Unit = js.native
}

