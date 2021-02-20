package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetOptions extends StObject {
  
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.native
  
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.native
  
  var group: js.UndefOr[String] = js.native
}
object DropTargetOptions {
  
  @scala.inline
  def apply(): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetOptions]
  }
  
  @scala.inline
  implicit class DropTargetOptionsMutableBuilder[Self <: DropTargetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragenter(value: /* e */ DropTargetDragenterEvent => Unit): Self = StObject.set(x, "dragenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
    
    @scala.inline
    def setDragleave(value: /* e */ DropTargetDragleaveEvent => Unit): Self = StObject.set(x, "dragleave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DropTargetDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
