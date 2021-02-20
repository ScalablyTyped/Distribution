package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatus extends StObject {
  
  /** Optional. Output only. Job state details, such as an error description if the state is ERROR. */
  var details: js.UndefOr[String] = js.native
  
  /** Output only. A state message specifying the overall job state. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time when this state was entered. */
  var stateStartTime: js.UndefOr[String] = js.native
  
  /** Output only. Additional state information, which includes status reported by the agent. */
  var substate: js.UndefOr[String] = js.native
}
object JobStatus {
  
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  
  @scala.inline
  implicit class JobStatusMutableBuilder[Self <: JobStatus] (val x: Self) extends AnyVal {
    
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
