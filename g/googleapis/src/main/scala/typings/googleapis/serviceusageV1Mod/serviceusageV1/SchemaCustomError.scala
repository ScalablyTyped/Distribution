package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customize service error responses.  For example, list any service specific
  * protobuf types that can appear in error detail lists of error responses.
  * Example:      custom_error:       types:       - google.foo.v1.CustomError
  * - google.foo.v1.AnotherError
  */
trait SchemaCustomError extends StObject {
  
  /**
    * The list of custom error rules that apply to individual API messages.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaCustomErrorRule]] = js.undefined
  
  /**
    * The list of custom error detail types, e.g.
    * &#39;google.foo.v1.CustomError&#39;.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCustomError {
  
  inline def apply(): SchemaCustomError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomError]
  }
  
  extension [Self <: SchemaCustomError](x: Self) {
    
    inline def setRules(value: js.Array[SchemaCustomErrorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaCustomErrorRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
