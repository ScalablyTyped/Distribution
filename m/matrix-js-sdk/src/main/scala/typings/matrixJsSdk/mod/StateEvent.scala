package typings.matrixJsSdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateEvent extends StObject {
  
  var content: (Record[String, Any]) | String
  
  /**
    * A unique key which defines the overwriting semantics for this piece of room state.
    * This value is often a zero-length string (""). The presence of this key makes this event a State Event.
    * State keys starting with an @ are reserved for referencing user IDs, such as room members.
    * With the exception of a few events, state events set with a given user's ID as the state key MUST only be set by that user.
    */
  var state_key: String
  
  var `type`: String
}
object StateEvent {
  
  inline def apply(content: (Record[String, Any]) | String, state_key: String, `type`: String): StateEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateEvent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: (Record[String, Any]) | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
