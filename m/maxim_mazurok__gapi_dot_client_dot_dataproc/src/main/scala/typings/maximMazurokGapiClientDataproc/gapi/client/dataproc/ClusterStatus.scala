package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatus extends StObject {
  
  /** Optional. Output only. Details of cluster's state. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** Output only. The cluster's state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when this state was entered (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)). */
  var stateStartTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional state information that includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.undefined
}
object ClusterStatus {
  
  inline def apply(): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatus]
  }
  
  extension [Self <: ClusterStatus](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubstate(value: String): Self = StObject.set(x, "substate", value.asInstanceOf[js.Any])
    
    inline def setSubstateUndefined: Self = StObject.set(x, "substate", js.undefined)
  }
}
