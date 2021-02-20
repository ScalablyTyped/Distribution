package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CitiesListResponse extends StObject {
  
  /** City collection. */
  var cities: js.UndefOr[js.Array[City]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#citiesListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object CitiesListResponse {
  
  @scala.inline
  def apply(): CitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitiesListResponse]
  }
  
  @scala.inline
  implicit class CitiesListResponseMutableBuilder[Self <: CitiesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    @scala.inline
    def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
