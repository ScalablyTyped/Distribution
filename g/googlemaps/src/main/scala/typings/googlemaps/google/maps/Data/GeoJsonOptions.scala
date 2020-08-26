package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJsonOptions extends js.Object {
  var idPropertyName: js.UndefOr[String] = js.native
}

object GeoJsonOptions {
  @scala.inline
  def apply(): GeoJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJsonOptions]
  }
  @scala.inline
  implicit class GeoJsonOptionsOps[Self <: GeoJsonOptions] (val x: Self) extends AnyVal {
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
    def setIdPropertyName(value: String): Self = this.set("idPropertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdPropertyName: Self = this.set("idPropertyName", js.undefined)
  }
  
}

