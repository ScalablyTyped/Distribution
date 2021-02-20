package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountriesListResponse extends StObject {
  
  /** Country collection. */
  var countries: js.UndefOr[js.Array[Country]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#countriesListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object CountriesListResponse {
  
  @scala.inline
  def apply(): CountriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountriesListResponse]
  }
  
  @scala.inline
  implicit class CountriesListResponseMutableBuilder[Self <: CountriesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
