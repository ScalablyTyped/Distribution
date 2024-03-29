package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.boolean
import typings.maplibreGl.mod.ExpressionSpecificationDefinition
import typings.maplibreGl.mod.ExpressionType
import typings.maplibreGl.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: boolean
}
object Transition {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): Transition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
