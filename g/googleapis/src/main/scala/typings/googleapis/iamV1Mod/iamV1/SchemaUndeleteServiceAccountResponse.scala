package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUndeleteServiceAccountResponse extends js.Object {
  
  /**
    * Metadata for the restored service account.
    */
  var restoredAccount: js.UndefOr[SchemaServiceAccount] = js.native
}
object SchemaUndeleteServiceAccountResponse {
  
  @scala.inline
  def apply(): SchemaUndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceAccountResponse]
  }
  
  @scala.inline
  implicit class SchemaUndeleteServiceAccountResponseOps[Self <: SchemaUndeleteServiceAccountResponse] (val x: Self) extends AnyVal {
    
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
    def setRestoredAccount(value: SchemaServiceAccount): Self = this.set("restoredAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoredAccount: Self = this.set("restoredAccount", js.undefined)
  }
}
