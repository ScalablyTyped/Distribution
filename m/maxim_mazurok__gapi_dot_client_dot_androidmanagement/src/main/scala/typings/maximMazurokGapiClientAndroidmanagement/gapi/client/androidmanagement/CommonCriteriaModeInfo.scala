package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonCriteriaModeInfo extends js.Object {
  
  /** Whether Common Criteria Mode is enabled. */
  var commonCriteriaModeStatus: js.UndefOr[String] = js.native
}
object CommonCriteriaModeInfo {
  
  @scala.inline
  def apply(): CommonCriteriaModeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCriteriaModeInfo]
  }
  
  @scala.inline
  implicit class CommonCriteriaModeInfoOps[Self <: CommonCriteriaModeInfo] (val x: Self) extends AnyVal {
    
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
    def setCommonCriteriaModeStatus(value: String): Self = this.set("commonCriteriaModeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonCriteriaModeStatus: Self = this.set("commonCriteriaModeStatus", js.undefined)
  }
}
