package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetOptions extends StObject {
  
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.undefined
  
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
}
object DropTargetOptions {
  
  inline def apply(): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setDragenter(value: /* e */ DropTargetDragenterEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
    
    inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
    
    inline def setDragleave(value: /* e */ DropTargetDragleaveEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
    
    inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
    
    inline def setDrop(value: /* e */ DropTargetDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
