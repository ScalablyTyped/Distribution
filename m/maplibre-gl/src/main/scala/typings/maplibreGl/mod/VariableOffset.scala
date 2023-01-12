package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableOffset extends StObject {
  
  var anchor: TextAnchor
  
  var height: Double
  
  var prevAnchor: js.UndefOr[TextAnchor] = js.undefined
  
  var textBoxScale: Double
  
  var textOffset: js.Tuple2[Double, Double]
  
  var width: Double
}
object VariableOffset {
  
  inline def apply(
    anchor: TextAnchor,
    height: Double,
    textBoxScale: Double,
    textOffset: js.Tuple2[Double, Double],
    width: Double
  ): VariableOffset = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], textBoxScale = textBoxScale.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableOffset] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: TextAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPrevAnchor(value: TextAnchor): Self = StObject.set(x, "prevAnchor", value.asInstanceOf[js.Any])
    
    inline def setPrevAnchorUndefined: Self = StObject.set(x, "prevAnchor", js.undefined)
    
    inline def setTextBoxScale(value: Double): Self = StObject.set(x, "textBoxScale", value.asInstanceOf[js.Any])
    
    inline def setTextOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
