package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.array
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.number
import typings.maplibreMaplibreGlStyleSpec.mod.ExpressionSpecificationDefinition
import typings.maplibreMaplibreGlStyleSpec.mod.ExpressionType
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[js.Array[Double]] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: array
  
  var value: number
}
object Length {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): Length = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: js.Array[Double]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: number): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
