package typings.leafletGridlayerGooglemutant.mod.gridLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google's map style.
  *
  * https://developers.google.com/maps/documentation/javascript/style-reference
  */
@js.native
trait GoogleMutantStyle extends js.Object {
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-elements
    */
  var elementType: js.UndefOr[String] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-features
    */
  var featureType: js.UndefOr[String] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#stylers
    */
  var stylers: js.UndefOr[js.Array[GoogleMutantStyler]] = js.native
}

object GoogleMutantStyle {
  @scala.inline
  def apply(): GoogleMutantStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMutantStyle]
  }
  @scala.inline
  implicit class GoogleMutantStyleOps[Self <: GoogleMutantStyle] (val x: Self) extends AnyVal {
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
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    @scala.inline
    def setFeatureType(value: String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureType: Self = this.set("featureType", js.undefined)
    @scala.inline
    def setStylersVarargs(value: GoogleMutantStyler*): Self = this.set("stylers", js.Array(value :_*))
    @scala.inline
    def setStylers(value: js.Array[GoogleMutantStyler]): Self = this.set("stylers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylers: Self = this.set("stylers", js.undefined)
  }
  
}

