package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeStyler extends js.Object {
  var color: js.UndefOr[String] = js.native
  var gamma: js.UndefOr[Double] = js.native
  var hue: js.UndefOr[String] = js.native
  var invert_lightness: js.UndefOr[Boolean] = js.native
  var lightness: js.UndefOr[Double] = js.native
  var saturation: js.UndefOr[Double] = js.native
  var visibility: js.UndefOr[String] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object MapTypeStyler {
  @scala.inline
  def apply(): MapTypeStyler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeStyler]
  }
  @scala.inline
  implicit class MapTypeStylerOps[Self <: MapTypeStyler] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
    @scala.inline
    def setHue(value: String): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    @scala.inline
    def setInvert_lightness(value: Boolean): Self = this.set("invert_lightness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert_lightness: Self = this.set("invert_lightness", js.undefined)
    @scala.inline
    def setLightness(value: Double): Self = this.set("lightness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightness: Self = this.set("lightness", js.undefined)
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

