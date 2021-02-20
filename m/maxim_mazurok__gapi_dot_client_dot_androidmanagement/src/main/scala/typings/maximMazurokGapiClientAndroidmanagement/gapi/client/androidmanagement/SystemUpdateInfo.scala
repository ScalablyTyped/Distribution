package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemUpdateInfo extends StObject {
  
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
  implicit class SystemUpdateInfoMutableBuilder[Self <: SystemUpdateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateReceivedTime(value: String): Self = StObject.set(x, "updateReceivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReceivedTimeUndefined: Self = StObject.set(x, "updateReceivedTime", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: String): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusUndefined: Self = StObject.set(x, "updateStatus", js.undefined)
  }
}
