package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.string
import typings.maplibreMaplibreGlStyleSpec.mod.ExpressionSpecificationDefinition
import typings.maplibreMaplibreGlStyleSpec.mod.ExpressionType
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Propertytype
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var `property-type`: ExpressionType
  
  var tokens: js.UndefOr[Boolean] = js.undefined
  
  var transition: Boolean
  
  var `type`: string
}
object Propertytype {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): Propertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[Propertytype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Propertytype] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
