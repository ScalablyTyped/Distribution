package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceDetailsRequest extends StObject {
  
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  var placeId: String = js.native
  
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.native
}
object PlaceDetailsRequest {
  
  @scala.inline
  def apply(placeId: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  
  @scala.inline
  implicit class PlaceDetailsRequestMutableBuilder[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionToken(value: AutocompleteSessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
