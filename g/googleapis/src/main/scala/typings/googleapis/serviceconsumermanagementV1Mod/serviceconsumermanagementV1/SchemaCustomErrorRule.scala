package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomErrorRule extends StObject {
  
  /**
    * Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Selects messages to which this rule applies. Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomErrorRule {
  
  inline def apply(): SchemaCustomErrorRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomErrorRule]
  }
  
  extension [Self <: SchemaCustomErrorRule](x: Self) {
    
    inline def setIsErrorType(value: Boolean): Self = StObject.set(x, "isErrorType", value.asInstanceOf[js.Any])
    
    inline def setIsErrorTypeNull: Self = StObject.set(x, "isErrorType", null)
    
    inline def setIsErrorTypeUndefined: Self = StObject.set(x, "isErrorType", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
