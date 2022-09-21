package typings.googleapis.eventarcV1beta1Mod.eventarcV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMatchingCriteria extends StObject {
  
  /**
    * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes can be specified. All triggers MUST provide a matching criteria for the 'type' attribute.
    */
  var attribute: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value for the attribute.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaMatchingCriteria {
  
  inline def apply(): SchemaMatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchingCriteria]
  }
  
  extension [Self <: SchemaMatchingCriteria](x: Self) {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
