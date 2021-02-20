package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statekey extends StObject {
  
  var content: Displayname = js.native
  
  var room_id: String = js.native
  
  var state_key: js.Any = js.native
  
  var `type`: String = js.native
}
object Statekey {
  
  @scala.inline
  def apply(content: Displayname, room_id: String, state_key: js.Any, `type`: String): Statekey = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statekey]
  }
  
  @scala.inline
  implicit class StatekeyMutableBuilder[Self <: Statekey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Displayname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState_key(value: js.Any): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
