package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventFilter extends StObject {
  
  /**
    * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
    */
  var attribute: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The operator used for matching the events with the value of the filter. If not specified, only events that have an exact key-value pair specified in the filter are matched. The only allowed value is `match-path-pattern`.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value for the attribute.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventFilter {
  
  inline def apply(): SchemaEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventFilter]
  }
  
  extension [Self <: SchemaEventFilter](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
