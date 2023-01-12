package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditable extends StObject {
  
  var connectionTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var drag: js.UndefOr[Boolean | DiagramEditableDrag] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[Boolean | DiagramEditableResize] = js.undefined
  
  var rotate: js.UndefOr[Boolean | DiagramEditableRotate] = js.undefined
  
  var shapeTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var tools: js.UndefOr[js.Array[DiagramEditableTool]] = js.undefined
}
object DiagramEditable {
  
  inline def apply(): DiagramEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramEditable] (val x: Self) extends AnyVal {
    
    inline def setConnectionTemplate(value: String | js.Function): Self = StObject.set(x, "connectionTemplate", value.asInstanceOf[js.Any])
    
    inline def setConnectionTemplateUndefined: Self = StObject.set(x, "connectionTemplate", js.undefined)
    
    inline def setDrag(value: Boolean | DiagramEditableDrag): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setResize(value: Boolean | DiagramEditableResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setRotate(value: Boolean | DiagramEditableRotate): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setShapeTemplate(value: String | js.Function): Self = StObject.set(x, "shapeTemplate", value.asInstanceOf[js.Any])
    
    inline def setShapeTemplateUndefined: Self = StObject.set(x, "shapeTemplate", js.undefined)
    
    inline def setTools(value: js.Array[DiagramEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: DiagramEditableTool*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
