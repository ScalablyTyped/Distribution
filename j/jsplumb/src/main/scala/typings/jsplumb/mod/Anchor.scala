package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var cssClass: String
  
  var elementId: String
  
  var id: String
  
  var locked: Boolean
  
  var offsets: js.Tuple2[Double, Double]
  
  var orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]
  
  var `type`: AnchorId
  
  var x: Double
  
  var y: Double
}
object Anchor {
  
  inline def apply(
    cssClass: String,
    elementId: String,
    id: String,
    locked: Boolean,
    offsets: js.Tuple2[Double, Double],
    orientation: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint],
    `type`: AnchorId,
    x: Double,
    y: Double
  ): Anchor = {
    val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: js.Tuple2[AnchorOrientationHint, AnchorOrientationHint]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setType(value: AnchorId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
