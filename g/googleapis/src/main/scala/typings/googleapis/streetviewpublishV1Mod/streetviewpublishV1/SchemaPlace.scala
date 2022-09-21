package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlace extends StObject {
  
  /**
    * Output only. The language_code that the name is localized with. This should be the language_code specified in the request, but may be a fallback.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the place, localized to the language_code.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Place identifier, as described in https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlace {
  
  inline def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  
  extension [Self <: SchemaPlace](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
