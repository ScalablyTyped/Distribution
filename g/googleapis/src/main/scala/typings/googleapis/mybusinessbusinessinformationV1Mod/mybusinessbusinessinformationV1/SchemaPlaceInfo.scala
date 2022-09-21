package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaceInfo extends StObject {
  
  /**
    * Required. The ID of the place. Must correspond to a region. (https://developers.google.com/places/web-service/supported_types#table3)
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The localized name of the place. For example, `Scottsdale, AZ`.
    */
  var placeName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaceInfo {
  
  inline def apply(): SchemaPlaceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceInfo]
  }
  
  extension [Self <: SchemaPlaceInfo](x: Self) {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPlaceName(value: String): Self = StObject.set(x, "placeName", value.asInstanceOf[js.Any])
    
    inline def setPlaceNameNull: Self = StObject.set(x, "placeName", null)
    
    inline def setPlaceNameUndefined: Self = StObject.set(x, "placeName", js.undefined)
  }
}
