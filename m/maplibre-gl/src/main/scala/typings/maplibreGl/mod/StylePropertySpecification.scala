package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.Expression
  - typings.maplibreGl.anon.Propertytype
  - typings.maplibreGl.anon.Transition
  - typings.maplibreGl.anon.Values
  - typings.maplibreGl.anon.Overridable
  - typings.maplibreGl.anon.Length
  - typings.maplibreGl.anon.DefaultExpression
  - typings.maplibreGl.anon.ExpressionPropertytype
*/
trait StylePropertySpecification extends StObject
object StylePropertySpecification {
  
  inline def DefaultExpression(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.DefaultExpression = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "string")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreGl.anon.DefaultExpression]
  }
  
  inline def Expression(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Expression = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.maplibreGl.anon.Expression]
  }
  
  inline def ExpressionPropertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.ExpressionPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("padding")
    __obj.asInstanceOf[typings.maplibreGl.anon.ExpressionPropertytype]
  }
  
  inline def Length(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Length = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreGl.anon.Length]
  }
  
  inline def Overridable(overridable: Boolean, `property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Overridable = {
    val __obj = js.Dynamic.literal(overridable = overridable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[typings.maplibreGl.anon.Overridable]
  }
  
  inline def Propertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Propertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.maplibreGl.anon.Propertytype]
  }
  
  inline def Transition(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Transition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.maplibreGl.anon.Transition]
  }
  
  inline def Values(`property-type`: ExpressionType, transition: Boolean, values: StringDictionary[js.Object]): typings.maplibreGl.anon.Values = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typings.maplibreGl.anon.Values]
  }
}
