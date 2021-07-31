package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object DiagramShapeDefaultsRotation {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsRotation]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsRotationMutableBuilder[Self <: DiagramShapeDefaultsRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
