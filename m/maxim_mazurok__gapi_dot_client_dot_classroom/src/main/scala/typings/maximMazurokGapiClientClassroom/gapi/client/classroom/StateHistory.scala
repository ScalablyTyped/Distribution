package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateHistory extends StObject {
  
  /** The teacher or student who made the change. */
  var actorUserId: js.UndefOr[String] = js.native
  
  /** The workflow pipeline stage. */
  var state: js.UndefOr[String] = js.native
  
  /** When the submission entered this state. */
  var stateTimestamp: js.UndefOr[String] = js.native
}
object StateHistory {
  
  @scala.inline
  def apply(): StateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateHistory]
  }
  
  @scala.inline
  implicit class StateHistoryMutableBuilder[Self <: StateHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTimestamp(value: String): Self = StObject.set(x, "stateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTimestampUndefined: Self = StObject.set(x, "stateTimestamp", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
