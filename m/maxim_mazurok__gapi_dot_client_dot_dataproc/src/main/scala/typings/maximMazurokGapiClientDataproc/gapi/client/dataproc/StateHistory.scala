package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateHistory extends StObject {
  
  /** Output only. The state of the batch at this point in history. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Details about the state at this point in history. */
  var stateMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the batch entered the historical state. */
  var stateStartTime: js.UndefOr[String] = js.undefined
}
object StateHistory {
  
  inline def apply(): StateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateHistory] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
