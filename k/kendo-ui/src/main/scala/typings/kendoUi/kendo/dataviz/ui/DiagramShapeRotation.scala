package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
}
object DiagramShapeRotation {
  
  @scala.inline
  def apply(): DiagramShapeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeRotation]
  }
  
  @scala.inline
  implicit class DiagramShapeRotationMutableBuilder[Self <: DiagramShapeRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
