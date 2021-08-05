package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetAreaOptions extends StObject {
  
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, Unit]] = js.undefined
  
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
}
object DropTargetAreaOptions {
  
  inline def apply(): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
  
  extension [Self <: DropTargetAreaOptions](x: Self) {
    
    inline def setDragenter(value: /* e */ DropTargetAreaDragenterEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
    
    inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
    
    inline def setDragleave(value: /* e */ DropTargetAreaDragleaveEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
    
    inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
    
    inline def setDrop(value: /* e */ DropTargetAreaDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
