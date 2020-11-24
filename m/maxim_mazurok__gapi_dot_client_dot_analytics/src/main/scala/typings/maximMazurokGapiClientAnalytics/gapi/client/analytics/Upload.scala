package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upload extends js.Object {
  
  /** Account Id to which this upload belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Custom data source Id to which this data import belongs. */
  var customDataSourceId: js.UndefOr[String] = js.native
  
  /** Data import errors collection. */
  var errors: js.UndefOr[js.Array[String]] = js.native
  
  /** A unique ID for this upload. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics upload. */
  var kind: js.UndefOr[String] = js.native
  
  /** Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. */
  var status: js.UndefOr[String] = js.native
  
  /** Time this file is uploaded. */
  var uploadTime: js.UndefOr[String] = js.native
}
object Upload {
  
  @scala.inline
  def apply(): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit class UploadOps[Self <: Upload] (val x: Self) extends AnyVal {
    
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
    def setCustomDataSourceId(value: String): Self = this.set("customDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDataSourceId: Self = this.set("customDataSourceId", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUploadTime(value: String): Self = this.set("uploadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadTime: Self = this.set("uploadTime", js.undefined)
  }
}
