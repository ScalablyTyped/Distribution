package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleUpdatecontact
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Defaults to all fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPerson] = js.undefined
  
  /**
    * The resource name for the person, assigned by the server. An ASCII string with a max length of 27 characters, in the form of `people/{person_id\}`.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    */
  var sources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. A field mask to restrict which fields on the person are updated. Multiple fields can be specified by separating them with commas. All updated fields will be replaced. Valid values are: * addresses * biographies * birthdays * calendarUrls * clientData * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * relations * sipAddresses * urls * userDefined
    */
  var updatePersonFields: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleUpdatecontact {
  
  inline def apply(): ParamsResourcePeopleUpdatecontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleUpdatecontact]
  }
  
  extension [Self <: ParamsResourcePeopleUpdatecontact](x: Self) {
    
    inline def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
    
    inline def setPersonFieldsUndefined: Self = StObject.set(x, "personFields", js.undefined)
    
    inline def setRequestBody(value: SchemaPerson): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setUpdatePersonFields(value: String): Self = StObject.set(x, "updatePersonFields", value.asInstanceOf[js.Any])
    
    inline def setUpdatePersonFieldsUndefined: Self = StObject.set(x, "updatePersonFields", js.undefined)
  }
}
