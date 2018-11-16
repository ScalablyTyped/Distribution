package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.SaveWidget")
@js.native
class SaveWidget protected () extends js.Object {
  def this(container: stdLib.Node) = this()
  def this(container: stdLib.Node, opts: SaveWidgetOptions) = this()
  def getAttribution(): Attribution = js.native
  def getPlace(): Place = js.native
  def setAttribution(attribution: Attribution): scala.Unit = js.native
  def setOptions(opts: SaveWidgetOptions): scala.Unit = js.native
  def setPlace(place: Place): scala.Unit = js.native
}

