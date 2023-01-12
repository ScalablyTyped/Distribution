package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeInfo extends StObject {
  
  /** Optional. New alert ID. Reference the [google.apps.alertcenter.Alert] with this ID for the current state. */
  var newAlertId: js.UndefOr[String] = js.undefined
  
  /** The new tracking ID from the parent incident. */
  var newIncidentTrackingId: js.UndefOr[String] = js.undefined
}
object MergeInfo {
  
  inline def apply(): MergeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeInfo] (val x: Self) extends AnyVal {
    
    inline def setNewAlertId(value: String): Self = StObject.set(x, "newAlertId", value.asInstanceOf[js.Any])
    
    inline def setNewAlertIdUndefined: Self = StObject.set(x, "newAlertId", js.undefined)
    
    inline def setNewIncidentTrackingId(value: String): Self = StObject.set(x, "newIncidentTrackingId", value.asInstanceOf[js.Any])
    
    inline def setNewIncidentTrackingIdUndefined: Self = StObject.set(x, "newIncidentTrackingId", js.undefined)
  }
}
