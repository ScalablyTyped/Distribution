package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.native
  
  var tools: js.UndefOr[js.Array[DiagramShapeEditableTool]] = js.native
}
object DiagramShapeEditable {
  
  @scala.inline
  def apply(): DiagramShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeEditable]
  }
  
  @scala.inline
  implicit class DiagramShapeEditableMutableBuilder[Self <: DiagramShapeEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setTools(value: js.Array[DiagramShapeEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: DiagramShapeEditableTool*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
