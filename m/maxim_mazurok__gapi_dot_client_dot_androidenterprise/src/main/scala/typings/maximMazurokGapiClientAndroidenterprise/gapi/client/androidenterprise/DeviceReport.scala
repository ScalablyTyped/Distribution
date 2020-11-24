package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceReport extends js.Object {
  
  /** List of app states set by managed apps on the device. App states are defined by the app's developers. This field will always be present. */
  var appState: js.UndefOr[js.Array[AppState]] = js.native
  
  /** The timestamp of the last report update in milliseconds since epoch. This field will always be present. */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
}
object DeviceReport {
  
  @scala.inline
  def apply(): DeviceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceReport]
  }
  
  @scala.inline
  implicit class DeviceReportOps[Self <: DeviceReport] (val x: Self) extends AnyVal {
    
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
    def setAppStateVarargs(value: AppState*): Self = this.set("appState", js.Array(value :_*))
    
    @scala.inline
    def setAppState(value: js.Array[AppState]): Self = this.set("appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppState: Self = this.set("appState", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = this.set("lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestampMillis: Self = this.set("lastUpdatedTimestampMillis", js.undefined)
  }
}
