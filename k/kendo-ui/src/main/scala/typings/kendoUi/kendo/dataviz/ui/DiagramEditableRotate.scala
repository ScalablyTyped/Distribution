package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableRotate extends StObject {
  
  var fill: js.UndefOr[DiagramEditableRotateFill] = js.native
  
  var stroke: js.UndefOr[DiagramEditableRotateStroke] = js.native
}
object DiagramEditableRotate {
  
  @scala.inline
  def apply(): DiagramEditableRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableRotate]
  }
  
  @scala.inline
  implicit class DiagramEditableRotateMutableBuilder[Self <: DiagramEditableRotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: DiagramEditableRotateFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramEditableRotateStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
