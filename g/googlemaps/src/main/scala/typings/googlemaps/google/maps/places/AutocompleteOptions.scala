package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteOptions extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var placeIdOnly: js.UndefOr[Boolean] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
}

object AutocompleteOptions {
  @scala.inline
  def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  @scala.inline
  implicit class AutocompleteOptionsOps[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
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
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setComponentRestrictions(value: ComponentRestrictions): Self = this.set("componentRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRestrictions: Self = this.set("componentRestrictions", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setPlaceIdOnly(value: Boolean): Self = this.set("placeIdOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceIdOnly: Self = this.set("placeIdOnly", js.undefined)
    @scala.inline
    def setStrictBounds(value: Boolean): Self = this.set("strictBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBounds: Self = this.set("strictBounds", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

