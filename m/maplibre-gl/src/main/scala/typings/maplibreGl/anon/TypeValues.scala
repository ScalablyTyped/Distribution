package typings.maplibreGl.anon

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.maplibreGlStrings.`enum`
import typings.maplibreGl.styleSpecMod.ExpressionSpecificationDefinition
import typings.maplibreGl.styleSpecMod.ExpressionType
import typings.maplibreGl.styleSpecMod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValues
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: `enum`
  
  var values: StringDictionary[js.Object]
}
object TypeValues {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean, values: StringDictionary[js.Object]): TypeValues = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[TypeValues]
  }
  
  extension [Self <: TypeValues](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: `enum`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringDictionary[js.Object]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
