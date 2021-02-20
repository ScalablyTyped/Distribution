package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
}
object ShapeRotation {
  
  @scala.inline
  def apply(): ShapeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeRotation]
  }
  
  @scala.inline
  implicit class ShapeRotationMutableBuilder[Self <: ShapeRotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
