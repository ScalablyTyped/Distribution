package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Accounts Response.
  */
@js.native
trait SchemaListAccountsResponse extends js.Object {
  
  /**
    * List of GTM Accounts that a user has access to.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.native
}
object SchemaListAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAccountsResponseOps[Self <: SchemaListAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: SchemaAccount*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: js.Array[SchemaAccount]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
  }
}
