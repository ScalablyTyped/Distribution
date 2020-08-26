package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderControl_ extends js.Object {
  def getURL(): String = js.native
  /**
    * Bind a listener to an event emitted by the geocoder control. Supported additional events are
    */
  def on(event: String, callback: js.Function): js.Any = js.native
  def onAdd(map: Map_): js.Any = js.native
  /**
    * Set the map id used for geocoding.
    */
  def setID(id: String): js.Any = js.native
  /**
    * Set the TileJSON used for geocoding.
    */
  def setTileJSON(tilejson: js.Any): js.Any = js.native
  /**
    * Set the url used for geocoding.
    */
  def setURL(url: String): js.Any = js.native
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
  @scala.inline
  implicit class GeocoderControl_Ops[Self <: GeocoderControl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetURL(value: () => String): Self = this.set("getURL", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: (String, js.Function) => js.Any): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetID(value: String => js.Any): Self = this.set("setID", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTileJSON(value: js.Any => js.Any): Self = this.set("setTileJSON", js.Any.fromFunction1(value))
    @scala.inline
    def setSetURL(value: String => js.Any): Self = this.set("setURL", js.Any.fromFunction1(value))
  }
  
}

