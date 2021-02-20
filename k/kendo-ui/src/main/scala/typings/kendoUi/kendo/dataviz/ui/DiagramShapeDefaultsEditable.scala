package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeDefaultsEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.native
  
  var drag: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[Boolean] = js.native
  
  var tools: js.UndefOr[js.Array[DiagramShapeDefaultsEditableTool]] = js.native
}
object DiagramShapeDefaultsEditable {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsEditable]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsEditableMutableBuilder[Self <: DiagramShapeDefaultsEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setTools(value: js.Array[DiagramShapeDefaultsEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: DiagramShapeDefaultsEditableTool*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
