package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderControl_ extends js.Object {
  def getURL(): String
  /**
  			 * Bind a listener to an event emitted by the geocoder control. Supported additional events are
  			 */
  def on(event: String, callback: js.Function): js.Any
  def onAdd(map: Map_): js.Any
  /**
  			 * Set the map id used for geocoding.
  			 */
  def setID(id: String): js.Any
  /**
  			 * Set the TileJSON used for geocoding.
  			 */
  def setTileJSON(tilejson: js.Any): js.Any
  /**
  			 * Set the url used for geocoding.
  			 */
  def setURL(url: String): js.Any
}

object GeocoderControl_ {
  @scala.inline
  def apply(
    getURL: () => String,
    on: (String, js.Function) => js.Any,
    onAdd: Map_ => js.Any,
    setID: String => js.Any,
    setTileJSON: js.Any => js.Any,
    setURL: String => js.Any
  ): GeocoderControl_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), on = js.Any.fromFunction2(on), onAdd = js.Any.fromFunction1(onAdd), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[GeocoderControl_]
  }
}

