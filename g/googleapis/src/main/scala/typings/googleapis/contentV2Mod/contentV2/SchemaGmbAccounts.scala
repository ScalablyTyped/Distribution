package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGmbAccounts extends js.Object {
  
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.native
}
object SchemaGmbAccounts {
  
  @scala.inline
  def apply(): SchemaGmbAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccounts]
  }
  
  @scala.inline
  implicit class SchemaGmbAccountsOps[Self <: SchemaGmbAccounts] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setGmbAccountsVarargs(value: SchemaGmbAccountsGmbAccount*): Self = this.set("gmbAccounts", js.Array(value :_*))
    
    @scala.inline
    def setGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = this.set("gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmbAccounts: Self = this.set("gmbAccounts", js.undefined)
  }
}
