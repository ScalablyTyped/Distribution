package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceReport extends StObject {
  
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
  implicit class DeviceReportMutableBuilder[Self <: DeviceReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppState(value: js.Array[AppState]): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    @scala.inline
    def setAppStateVarargs(value: AppState*): Self = StObject.set(x, "appState", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
  }
}
