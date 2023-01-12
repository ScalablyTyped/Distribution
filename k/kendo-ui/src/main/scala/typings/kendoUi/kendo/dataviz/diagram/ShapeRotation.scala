package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeRotation extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
}
object ShapeRotation {
  
  inline def apply(): ShapeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeRotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeRotation] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
  }
}
