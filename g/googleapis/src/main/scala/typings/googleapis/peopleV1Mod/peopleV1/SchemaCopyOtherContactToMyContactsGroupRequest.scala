package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCopyOtherContactToMyContactsGroupRequest extends StObject {
  
  /**
    * Required. A field mask to restrict which fields are copied into the new contact. Valid values are: * emailAddresses * names * phoneNumbers
    */
  var copyMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to the copy mask with metadata and membership fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var readMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    */
  var sources: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCopyOtherContactToMyContactsGroupRequest {
  
  inline def apply(): SchemaCopyOtherContactToMyContactsGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopyOtherContactToMyContactsGroupRequest]
  }
  
  extension [Self <: SchemaCopyOtherContactToMyContactsGroupRequest](x: Self) {
    
    inline def setCopyMask(value: String): Self = StObject.set(x, "copyMask", value.asInstanceOf[js.Any])
    
    inline def setCopyMaskNull: Self = StObject.set(x, "copyMask", null)
    
    inline def setCopyMaskUndefined: Self = StObject.set(x, "copyMask", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskNull: Self = StObject.set(x, "readMask", null)
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesNull: Self = StObject.set(x, "sources", null)
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
