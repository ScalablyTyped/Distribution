package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleUpdatecontact
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPerson] = js.undefined
  
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`<var>person_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * **Required.** A field mask to restrict which fields on the person are
    * updated. Multiple fields can be specified by separating them with commas.
    * All updated fields will be replaced. Valid values are:  * addresses *
    * biographies * birthdays * emailAddresses * events * genders * imClients *
    * interests * locales * names * nicknames * occupations * organizations *
    * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    */
  var updatePersonFields: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleUpdatecontact {
  
  inline def apply(): ParamsResourcePeopleUpdatecontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleUpdatecontact]
  }
  
  extension [Self <: ParamsResourcePeopleUpdatecontact](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRequestBody(value: SchemaPerson): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setUpdatePersonFields(value: String): Self = StObject.set(x, "updatePersonFields", value.asInstanceOf[js.Any])
    
    inline def setUpdatePersonFieldsUndefined: Self = StObject.set(x, "updatePersonFields", js.undefined)
  }
}
