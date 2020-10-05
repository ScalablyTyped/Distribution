package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderAddressComponent extends js.Object {
  var long_name: String = js.native
  var short_name: String = js.native
  var types: js.Array[String] = js.native
}

object GeocoderAddressComponent {
  @scala.inline
  def apply(long_name: String, short_name: String, types: js.Array[String]): GeocoderAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
  @scala.inline
  implicit class GeocoderAddressComponentOps[Self <: GeocoderAddressComponent] (val x: Self) extends AnyVal {
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
    def setLong_name(value: String): Self = this.set("long_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

