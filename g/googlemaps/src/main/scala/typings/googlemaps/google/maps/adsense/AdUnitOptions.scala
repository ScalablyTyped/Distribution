package typings.googlemaps.google.maps.adsense

import typings.googlemaps.google.maps.ControlPosition
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdUnitOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var channelNumber: js.UndefOr[String] = js.native
  var format: js.UndefOr[AdFormat] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var publisherId: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
  var urlColor: js.UndefOr[String] = js.native
}

object AdUnitOptions {
  @scala.inline
  def apply(): AdUnitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnitOptions]
  }
  @scala.inline
  implicit class AdUnitOptionsOps[Self <: AdUnitOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setChannelNumber(value: String): Self = this.set("channelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelNumber: Self = this.set("channelNumber", js.undefined)
    @scala.inline
    def setFormat(value: AdFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherId: Self = this.set("publisherId", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    @scala.inline
    def setUrlColor(value: String): Self = this.set("urlColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlColor: Self = this.set("urlColor", js.undefined)
  }
  
}

