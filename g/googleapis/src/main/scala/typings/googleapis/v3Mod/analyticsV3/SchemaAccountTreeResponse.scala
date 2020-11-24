package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics account tree response. The account tree
  * response is used in the provisioning api to return the result of creating
  * an account, property, and view (profile).
  */
@js.native
trait SchemaAccountTreeResponse extends js.Object {
  
  /**
    * The account created.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[SchemaProfile] = js.native
  
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[SchemaWebproperty] = js.native
}
object SchemaAccountTreeResponse {
  
  @scala.inline
  def apply(): SchemaAccountTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTreeResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountTreeResponseOps[Self <: SchemaAccountTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: SchemaAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfile(value: SchemaProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setWebproperty(value: SchemaWebproperty): Self = this.set("webproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebproperty: Self = this.set("webproperty", js.undefined)
  }
}
