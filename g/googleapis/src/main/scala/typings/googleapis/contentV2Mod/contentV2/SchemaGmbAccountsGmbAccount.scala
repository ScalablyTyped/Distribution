package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGmbAccountsGmbAccount extends js.Object {
  
  /**
    * The email which identifies the GMB account.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Number of listings under this account.
    */
  var listingCount: js.UndefOr[String] = js.native
  
  /**
    * The name of the GMB account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of the GMB account (User or Business).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGmbAccountsGmbAccount {
  
  @scala.inline
  def apply(): SchemaGmbAccountsGmbAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccountsGmbAccount]
  }
  
  @scala.inline
  implicit class SchemaGmbAccountsGmbAccountOps[Self <: SchemaGmbAccountsGmbAccount] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setListingCount(value: String): Self = this.set("listingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListingCount: Self = this.set("listingCount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
