package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileViewChangedEvent extends StObject {
  
  var enabled: Boolean
}
object TileViewChangedEvent {
  
  inline def apply(enabled: Boolean): TileViewChangedEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileViewChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileViewChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
