package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Dataproc job status.
  */
@js.native
trait SchemaJobStatus extends StObject {
  
  /**
    * Output only. Optional job state details, such as an error description if
    * the state is &lt;code&gt;ERROR&lt;/code&gt;.
    */
  var details: js.UndefOr[String] = js.native
  
  /**
    * Output only. A state message specifying the overall job state.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time when this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Additional state information, which includes status reported
    * by the agent.
    */
  var substate: js.UndefOr[String] = js.native
}
object SchemaJobStatus {
  
  @scala.inline
  def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  @scala.inline
  implicit class SchemaJobStatusMutableBuilder[Self <: SchemaJobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubstate(value: String): Self = StObject.set(x, "substate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstateUndefined: Self = StObject.set(x, "substate", js.undefined)
  }
}
