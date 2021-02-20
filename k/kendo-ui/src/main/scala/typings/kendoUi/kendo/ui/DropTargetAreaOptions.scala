package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetAreaOptions extends StObject {
  
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, Unit]] = js.native
  
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, Unit]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
}
object DropTargetAreaOptions {
  
  @scala.inline
  def apply(): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
  
  @scala.inline
  implicit class DropTargetAreaOptionsMutableBuilder[Self <: DropTargetAreaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragenter(value: /* e */ DropTargetAreaDragenterEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
    
    @scala.inline
    def setDragleave(value: /* e */ DropTargetAreaDragleaveEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DropTargetAreaDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
