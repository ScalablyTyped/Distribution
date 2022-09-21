package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomError extends StObject {
  
  /**
    * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SchemaCustomErrorRule]] = js.undefined
  
  /**
    * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
    */
  var types: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCustomError {
  
  inline def apply(): SchemaCustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomError]
  }
  
  extension [Self <: SchemaCustomError](x: Self) {
    
    inline def setRules(value: js.Array[SchemaCustomErrorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaCustomErrorRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesNull: Self = StObject.set(x, "types", null)
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
