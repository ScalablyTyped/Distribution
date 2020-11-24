package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLicensesListResponse extends js.Object {
  
  /** A group license for a product approved for use in the enterprise. */
  var groupLicense: js.UndefOr[js.Array[GroupLicense]] = js.native
}
object GroupLicensesListResponse {
  
  @scala.inline
  def apply(): GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicensesListResponse]
  }
  
  @scala.inline
  implicit class GroupLicensesListResponseOps[Self <: GroupLicensesListResponse] (val x: Self) extends AnyVal {
    
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
    def setGroupLicenseVarargs(value: GroupLicense*): Self = this.set("groupLicense", js.Array(value :_*))
    
    @scala.inline
    def setGroupLicense(value: js.Array[GroupLicense]): Self = this.set("groupLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupLicense: Self = this.set("groupLicense", js.undefined)
  }
}
