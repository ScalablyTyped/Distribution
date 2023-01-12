package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetAreaEvent extends StObject {
  
  var sender: DropTargetArea
}
object DropTargetAreaEvent {
  
  inline def apply(sender: DropTargetArea): DropTargetAreaEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropTargetAreaEvent] (val x: Self) extends AnyVal {
    
    inline def setSender(value: DropTargetArea): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
