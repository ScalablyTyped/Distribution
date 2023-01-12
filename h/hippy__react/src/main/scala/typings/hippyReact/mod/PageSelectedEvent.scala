package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSelectedEvent extends StObject {
  
  var position: Double
}
object PageSelectedEvent {
  
  inline def apply(position: Double): PageSelectedEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
