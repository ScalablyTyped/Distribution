package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateContactPhotoRequest extends StObject {
  
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to empty if not set, which will skip the post mutate get. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var personFields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Raw photo bytes
    */
  var photoBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    */
  var sources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUpdateContactPhotoRequest {
  
  inline def apply(): SchemaUpdateContactPhotoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateContactPhotoRequest]
  }
  
  extension [Self <: SchemaUpdateContactPhotoRequest](x: Self) {
    
    inline def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
    
    inline def setPersonFieldsNull: Self = StObject.set(x, "personFields", null)
    
    inline def setPersonFieldsUndefined: Self = StObject.set(x, "personFields", js.undefined)
    
    inline def setPhotoBytes(value: String): Self = StObject.set(x, "photoBytes", value.asInstanceOf[js.Any])
    
    inline def setPhotoBytesNull: Self = StObject.set(x, "photoBytes", null)
    
    inline def setPhotoBytesUndefined: Self = StObject.set(x, "photoBytes", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesNull: Self = StObject.set(x, "sources", null)
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
