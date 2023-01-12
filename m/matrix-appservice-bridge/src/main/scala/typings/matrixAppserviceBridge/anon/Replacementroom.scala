package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacementroom extends StObject {
  
  var replacement_room: String
}
object Replacementroom {
  
  inline def apply(replacement_room: String): Replacementroom = {
    val __obj = js.Dynamic.literal(replacement_room = replacement_room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacementroom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Replacementroom] (val x: Self) extends AnyVal {
    
    inline def setReplacement_room(value: String): Self = StObject.set(x, "replacement_room", value.asInstanceOf[js.Any])
  }
}
