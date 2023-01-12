package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeEditableTool extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
}
object DiagramShapeEditableTool {
  
  inline def apply(): DiagramShapeEditableTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeEditableTool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramShapeEditableTool] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
