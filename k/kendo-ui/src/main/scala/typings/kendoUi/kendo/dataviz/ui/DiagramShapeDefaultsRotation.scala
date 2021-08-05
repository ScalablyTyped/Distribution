package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object DiagramShapeDefaultsRotation {
  
  inline def apply(): DiagramShapeDefaultsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsRotation]
  }
  
  extension [Self <: DiagramShapeDefaultsRotation](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
