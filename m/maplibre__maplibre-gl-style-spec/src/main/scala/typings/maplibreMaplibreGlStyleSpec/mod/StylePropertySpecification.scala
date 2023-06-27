package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreMaplibreGlStyleSpec.anon.Expression
  - typings.maplibreMaplibreGlStyleSpec.anon.Propertytype
  - typings.maplibreMaplibreGlStyleSpec.anon.Transition
  - typings.maplibreMaplibreGlStyleSpec.anon.Values
  - typings.maplibreMaplibreGlStyleSpec.anon.Overridable
  - typings.maplibreMaplibreGlStyleSpec.anon.Length
  - typings.maplibreMaplibreGlStyleSpec.anon.DefaultExpression
  - typings.maplibreMaplibreGlStyleSpec.anon.ExpressionPropertytype
*/
trait StylePropertySpecification extends StObject
object StylePropertySpecification {
  
  inline def DefaultExpression(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.DefaultExpression = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "string")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.DefaultExpression]
  }
  
  inline def Expression(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.Expression = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Expression]
  }
  
  inline def ExpressionPropertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.ExpressionPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("padding")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.ExpressionPropertytype]
  }
  
  inline def Length(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.Length = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Length]
  }
  
  inline def Overridable(overridable: Boolean, `property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.Overridable = {
    val __obj = js.Dynamic.literal(overridable = overridable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Overridable]
  }
  
  inline def Propertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.Propertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Propertytype]
  }
  
  inline def Transition(`property-type`: ExpressionType, transition: Boolean): typings.maplibreMaplibreGlStyleSpec.anon.Transition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Transition]
  }
  
  inline def Values(`property-type`: ExpressionType, transition: Boolean, values: StringDictionary[js.Object]): typings.maplibreMaplibreGlStyleSpec.anon.Values = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Values]
  }
}
