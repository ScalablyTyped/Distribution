package typings.googlemaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindPlaceFromPhoneNumberRequest extends StObject {
  
  var fields: js.Array[String]
  
  var locationBias: js.UndefOr[LocationBias] = js.undefined
  
  var phoneNumber: String
}
object FindPlaceFromPhoneNumberRequest {
  
  @scala.inline
  def apply(fields: js.Array[String], phoneNumber: String): FindPlaceFromPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromPhoneNumberRequest]
  }
  
  @scala.inline
  implicit class FindPlaceFromPhoneNumberRequestMutableBuilder[Self <: FindPlaceFromPhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setLocationBias(value: LocationBias): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
