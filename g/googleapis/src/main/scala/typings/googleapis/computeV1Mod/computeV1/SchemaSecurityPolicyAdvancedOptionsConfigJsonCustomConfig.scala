package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig extends StObject {
  
  /**
    * A list of custom Content-Type header values to apply the JSON parsing. As per RFC 1341, a Content-Type header value has the following format: Content-Type := type "/" subtype *[";" parameter] When configuring a custom Content-Type header value, only the type/subtype needs to be specified, and the parameters should be excluded.
    */
  var contentTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig {
  
  inline def apply(): SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig](x: Self) {
    
    inline def setContentTypes(value: js.Array[String]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    inline def setContentTypesNull: Self = StObject.set(x, "contentTypes", null)
    
    inline def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    inline def setContentTypesVarargs(value: String*): Self = StObject.set(x, "contentTypes", js.Array(value*))
  }
}
