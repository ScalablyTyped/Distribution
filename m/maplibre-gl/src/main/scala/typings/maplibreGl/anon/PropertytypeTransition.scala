package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.ExpressionSpecificationDefinition
import typings.maplibreGl.distStyleSpecMod.ExpressionType
import typings.maplibreGl.distStyleSpecMod.StylePropertySpecification
import typings.maplibreGl.maplibreGlStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertytypeTransition
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: number
}
object PropertytypeTransition {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): PropertytypeTransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[PropertytypeTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertytypeTransition] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
