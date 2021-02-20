package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replacementroom extends StObject {
  
  var replacement_room: String = js.native
}
object Replacementroom {
  
  @scala.inline
  def apply(replacement_room: String): Replacementroom = {
    val __obj = js.Dynamic.literal(replacement_room = replacement_room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacementroom]
  }
  
  @scala.inline
  implicit class ReplacementroomMutableBuilder[Self <: Replacementroom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacement_room(value: String): Self = StObject.set(x, "replacement_room", value.asInstanceOf[js.Any])
  }
}
