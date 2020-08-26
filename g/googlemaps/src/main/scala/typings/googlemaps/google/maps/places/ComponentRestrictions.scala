package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentRestrictions extends js.Object {
  var country: String | js.Array[String] = js.native
}

object ComponentRestrictions {
  @scala.inline
  def apply(country: String | js.Array[String]): ComponentRestrictions = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRestrictions]
  }
  @scala.inline
  implicit class ComponentRestrictionsOps[Self <: ComponentRestrictions] (val x: Self) extends AnyVal {
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
    def setCountryVarargs(value: String*): Self = this.set("country", js.Array(value :_*))
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = this.set("country", value.asInstanceOf[js.Any])
  }
  
}

