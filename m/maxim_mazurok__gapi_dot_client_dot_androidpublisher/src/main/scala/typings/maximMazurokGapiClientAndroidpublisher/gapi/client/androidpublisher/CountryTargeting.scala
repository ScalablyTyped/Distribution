package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryTargeting extends js.Object {
  
  /** Countries to target, specified as two letter [CLDR codes](https://unicode.org/cldr/charts/latest/supplemental/territory_containment_un_m_49.html). */
  var countries: js.UndefOr[js.Array[String]] = js.native
  
  /** Include "rest of world" as well as explicitly targeted countries. */
  var includeRestOfWorld: js.UndefOr[Boolean] = js.native
}
object CountryTargeting {
  
  @scala.inline
  def apply(): CountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryTargeting]
  }
  
  @scala.inline
  implicit class CountryTargetingOps[Self <: CountryTargeting] (val x: Self) extends AnyVal {
    
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
    def setCountriesVarargs(value: String*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setIncludeRestOfWorld(value: Boolean): Self = this.set("includeRestOfWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRestOfWorld: Self = this.set("includeRestOfWorld", js.undefined)
  }
}
