package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Dataproc job status.
  */
trait SchemaJobStatus extends StObject {
  
  /**
    * Output only. Optional job state details, such as an error description if
    * the state is &lt;code&gt;ERROR&lt;/code&gt;.
    */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A state message specifying the overall job state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Additional state information, which includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.undefined
}
object SchemaJobStatus {
  
  inline def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  extension [Self <: SchemaJobStatus](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubstate(value: String): Self = StObject.set(x, "substate", value.asInstanceOf[js.Any])
    
    inline def setSubstateUndefined: Self = StObject.set(x, "substate", js.undefined)
  }
}
