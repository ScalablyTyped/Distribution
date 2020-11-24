package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePeopleUpdatecontact extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPerson] = js.native
  
  /**
    * The resource name for the person, assigned by the server. An ASCII string
    * with a max length of 27 characters, in the form of
    * `people/`<var>person_id</var>.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * **Required.** A field mask to restrict which fields on the person are
    * updated. Multiple fields can be specified by separating them with commas.
    * All updated fields will be replaced. Valid values are:  * addresses *
    * biographies * birthdays * emailAddresses * events * genders * imClients *
    * interests * locales * names * nicknames * occupations * organizations *
    * phoneNumbers * relations * residences * sipAddresses * urls * userDefined
    */
  var updatePersonFields: js.UndefOr[String] = js.native
}
object ParamsResourcePeopleUpdatecontact {
  
  @scala.inline
  def apply(): ParamsResourcePeopleUpdatecontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleUpdatecontact]
  }
  
  @scala.inline
  implicit class ParamsResourcePeopleUpdatecontactOps[Self <: ParamsResourcePeopleUpdatecontact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPerson): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setUpdatePersonFields(value: String): Self = this.set("updatePersonFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePersonFields: Self = this.set("updatePersonFields", js.undefined)
  }
}
