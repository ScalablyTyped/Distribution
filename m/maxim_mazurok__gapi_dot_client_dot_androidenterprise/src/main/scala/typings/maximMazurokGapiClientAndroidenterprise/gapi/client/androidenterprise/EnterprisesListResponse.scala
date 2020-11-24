package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesListResponse extends js.Object {
  
  /** An enterprise. */
  var enterprise: js.UndefOr[js.Array[Enterprise]] = js.native
}
object EnterprisesListResponse {
  
  @scala.inline
  def apply(): EnterprisesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterprisesListResponse]
  }
  
  @scala.inline
  implicit class EnterprisesListResponseOps[Self <: EnterprisesListResponse] (val x: Self) extends AnyVal {
    
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
    def setEnterpriseVarargs(value: Enterprise*): Self = this.set("enterprise", js.Array(value :_*))
    
    @scala.inline
    def setEnterprise(value: js.Array[Enterprise]): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterprise: Self = this.set("enterprise", js.undefined)
  }
}
