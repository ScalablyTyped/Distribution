package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object DiagramShapeRotation {
  
  inline def apply(): DiagramShapeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeRotation]
  }
  
  extension [Self <: DiagramShapeRotation](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
