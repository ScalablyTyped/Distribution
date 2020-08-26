package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait SaveWidgetOptions extends js.Object {
  var attribution: js.UndefOr[Attribution] = js.native
  var place: js.UndefOr[Place] = js.native
}

object SaveWidgetOptions {
  @scala.inline
  def apply(): SaveWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveWidgetOptions]
  }
  @scala.inline
  implicit class SaveWidgetOptionsOps[Self <: SaveWidgetOptions] (val x: Self) extends AnyVal {
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
    def setAttribution(value: Attribution): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setPlace(value: Place): Self = this.set("place", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
  }
  
}

