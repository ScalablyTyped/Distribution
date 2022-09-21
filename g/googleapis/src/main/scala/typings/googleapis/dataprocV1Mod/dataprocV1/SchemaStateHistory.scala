package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStateHistory extends StObject {
  
  /**
    * Output only. The state of the batch at this point in history.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Details about the state at this point in history.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the batch entered the historical state.
    */
  var stateStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaStateHistory {
  
  inline def apply(): SchemaStateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateHistory]
  }
  
  extension [Self <: SchemaStateHistory](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateStartTime(value: String): Self = StObject.set(x, "stateStartTime", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimeNull: Self = StObject.set(x, "stateStartTime", null)
    
    inline def setStateStartTimeUndefined: Self = StObject.set(x, "stateStartTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
