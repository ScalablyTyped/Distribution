package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.PropertytypeTransition
  - typings.maplibreGl.anon.Tokens
  - typings.maplibreGl.anon.TransitionType
  - typings.maplibreGl.anon.TypeValues
  - typings.maplibreGl.anon.ExpressionOverridable
  - typings.maplibreGl.anon.ExpressionLength
  - typings.maplibreGl.anon.LengthPropertytype
  - typings.maplibreGl.anon.DefaultExpressionPropertytype
*/
trait StylePropertySpecification extends StObject
object StylePropertySpecification {
  
  inline def DefaultExpressionPropertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.DefaultExpressionPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("padding")
    __obj.asInstanceOf[typings.maplibreGl.anon.DefaultExpressionPropertytype]
  }
  
  inline def ExpressionLength(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.ExpressionLength = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreGl.anon.ExpressionLength]
  }
  
  inline def ExpressionOverridable(overridable: Boolean, `property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.ExpressionOverridable = {
    val __obj = js.Dynamic.literal(overridable = overridable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[typings.maplibreGl.anon.ExpressionOverridable]
  }
  
  inline def LengthPropertytype(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.LengthPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "string")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.maplibreGl.anon.LengthPropertytype]
  }
  
  inline def PropertytypeTransition(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.PropertytypeTransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.maplibreGl.anon.PropertytypeTransition]
  }
  
  inline def Tokens(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.Tokens = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.maplibreGl.anon.Tokens]
  }
  
  inline def TransitionType(`property-type`: ExpressionType, transition: Boolean): typings.maplibreGl.anon.TransitionType = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.maplibreGl.anon.TransitionType]
  }
  
  inline def TypeValues(`property-type`: ExpressionType, transition: Boolean, values: StringDictionary[js.Object]): typings.maplibreGl.anon.TypeValues = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[typings.maplibreGl.anon.TypeValues]
  }
}
