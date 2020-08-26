package typings.heremaps.H.ui.MapSettingsControl

import typings.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The map type entry is an object containing a display name and a map type object to which it refers.
  * @property name {string} - label which describes the map type
  * @property mapType {H.service.MapType} - reference to map type
  */
@js.native
trait Entry extends js.Object {
  var mapType: MapType = js.native
  var name: String = js.native
}

object Entry {
  @scala.inline
  def apply(mapType: MapType, name: String): Entry = {
    val __obj = js.Dynamic.literal(mapType = mapType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setMapType(value: MapType): Self = this.set("mapType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

