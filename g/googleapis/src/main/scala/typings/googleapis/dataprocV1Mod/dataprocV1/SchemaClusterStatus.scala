package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a cluster and its instances.
  */
trait SchemaClusterStatus extends StObject {
  
  /**
    * Output only. Optional details of cluster&#39;s state.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The cluster&#39;s state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Additional state information that includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.undefined
}
object SchemaClusterStatus {
  
  inline def apply(): SchemaClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterStatus]
  }
  
  extension [Self <: SchemaClusterStatus](x: Self) {
    
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
