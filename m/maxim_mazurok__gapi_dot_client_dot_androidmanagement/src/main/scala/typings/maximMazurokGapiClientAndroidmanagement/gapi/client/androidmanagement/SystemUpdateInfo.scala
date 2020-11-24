package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemUpdateInfo extends js.Object {
  
  /**
    * The time when the update was first available. A zero value indicates that this field is not set. This field is set only if an update is available (that is, updateStatus is neither
    * UPDATE_STATUS_UNKNOWN nor UP_TO_DATE).
    */
  var updateReceivedTime: js.UndefOr[String] = js.native
  
  /** The status of an update: whether an update exists and what type it is. */
  var updateStatus: js.UndefOr[String] = js.native
}
object SystemUpdateInfo {
  
  @scala.inline
  def apply(): SystemUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemUpdateInfo]
  }
  
  @scala.inline
  implicit class SystemUpdateInfoOps[Self <: SystemUpdateInfo] (val x: Self) extends AnyVal {
    
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
    def setUpdateReceivedTime(value: String): Self = this.set("updateReceivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateReceivedTime: Self = this.set("updateReceivedTime", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: String): Self = this.set("updateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateStatus: Self = this.set("updateStatus", js.undefined)
  }
}
