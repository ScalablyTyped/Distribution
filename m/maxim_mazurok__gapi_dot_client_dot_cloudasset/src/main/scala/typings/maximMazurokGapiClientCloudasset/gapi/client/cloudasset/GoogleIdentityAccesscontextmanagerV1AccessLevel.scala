package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1AccessLevel extends js.Object {
  
  /** A `BasicLevel` composed of `Conditions`. */
  var basic: js.UndefOr[GoogleIdentityAccesscontextmanagerV1BasicLevel] = js.native
  
  /** A `CustomLevel` written in the Common Expression Language. */
  var custom: js.UndefOr[GoogleIdentityAccesscontextmanagerV1CustomLevel] = js.native
  
  /** Description of the `AccessLevel` and its use. Does not affect behavior. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format:
    * `accessPolicies/{policy_id}/accessLevels/{short_name}`. The maximum length of the `short_name` component is 50 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Human readable title. Must be unique within the Policy. */
  var title: js.UndefOr[String] = js.native
}
object GoogleIdentityAccesscontextmanagerV1AccessLevel {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1AccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1AccessLevel]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1AccessLevelOps[Self <: GoogleIdentityAccesscontextmanagerV1AccessLevel] (val x: Self) extends AnyVal {
    
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
    def setBasic(value: GoogleIdentityAccesscontextmanagerV1BasicLevel): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    
    @scala.inline
    def setCustom(value: GoogleIdentityAccesscontextmanagerV1CustomLevel): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
