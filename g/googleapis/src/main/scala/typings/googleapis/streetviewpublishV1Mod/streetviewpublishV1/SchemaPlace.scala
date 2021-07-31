package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Place metadata for an entity.
  */
trait SchemaPlace extends StObject {
  
  /**
    * Output-only. The language_code that the name is localized with. This
    * should be the language_code specified in the request, but may be a
    * fallback.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Output-only. The name of the place, localized to the language_code.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Place identifier, as described in
    * https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String] = js.undefined
}
object SchemaPlace {
  
  @scala.inline
  def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  
  @scala.inline
  implicit class SchemaPlaceMutableBuilder[Self <: SchemaPlace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
