package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationStatus extends StObject {
  
  /** Output only. A message containing any operation metadata details. */
  var details: js.UndefOr[String] = js.undefined
  
  /** Output only. A message containing the detailed operation state. */
  var innerState: js.UndefOr[String] = js.undefined
  
  /** Output only. A message containing the operation state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.undefined
}
object ClusterOperationStatus {
  
  inline def apply(): ClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterOperationStatus] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setInnerState(value: String): Self = StObject.set(x, "innerState", value.asInstanceOf[js.Any])
    
    inline def setInnerStateUndefined: Self = StObject.set(x, "innerState", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
