package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryTargeting extends StObject {
  
  /** Countries to target, specified as two letter [CLDR codes](https://unicode.org/cldr/charts/latest/supplemental/territory_containment_un_m_49.html). */
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Include "rest of world" as well as explicitly targeted countries. */
  var includeRestOfWorld: js.UndefOr[Boolean] = js.undefined
}
object CountryTargeting {
  
  @scala.inline
  def apply(): CountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryTargeting]
  }
  
  @scala.inline
  implicit class CountryTargetingMutableBuilder[Self <: CountryTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRestOfWorld(value: Boolean): Self = StObject.set(x, "includeRestOfWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRestOfWorldUndefined: Self = StObject.set(x, "includeRestOfWorld", js.undefined)
  }
}
