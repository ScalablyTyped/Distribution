package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roomid extends StObject {
  
  var room_id: String
}
object Roomid {
  
  @scala.inline
  def apply(room_id: String): Roomid = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomid]
  }
  
  @scala.inline
  implicit class RoomidMutableBuilder[Self <: Roomid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
  }
}
