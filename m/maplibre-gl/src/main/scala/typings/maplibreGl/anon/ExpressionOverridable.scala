package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.ExpressionSpecificationDefinition
import typings.maplibreGl.distStyleSpecMod.ExpressionType
import typings.maplibreGl.distStyleSpecMod.StylePropertySpecification
import typings.maplibreGl.maplibreGlStrings.color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionOverridable
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var overridable: Boolean
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: color
}
object ExpressionOverridable {
  
  inline def apply(overridable: Boolean, `property-type`: ExpressionType, transition: Boolean): ExpressionOverridable = {
    val __obj = js.Dynamic.literal(overridable = overridable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[ExpressionOverridable]
  }
  
  extension [Self <: ExpressionOverridable](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setOverridable(value: Boolean): Self = StObject.set(x, "overridable", value.asInstanceOf[js.Any])
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
