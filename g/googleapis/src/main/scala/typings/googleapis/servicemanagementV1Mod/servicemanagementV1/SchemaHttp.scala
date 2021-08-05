package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the HTTP configuration for an API service. It contains a list of
  * HttpRule, each specifying the mapping of an RPC method to one or more HTTP
  * REST API methods.
  */
trait SchemaHttp extends StObject {
  
  /**
    * When set to true, URL path parameters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where
    * &quot;%2F&quot; will be left encoded.  The default behavior is to not
    * decode RFC 6570 reserved characters in multi segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaHttpRule]] = js.undefined
}
object SchemaHttp {
  
  inline def apply(): SchemaHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttp]
  }
  
  extension [Self <: SchemaHttp](x: Self) {
    
    inline def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
    
    inline def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
    
    inline def setRules(value: js.Array[SchemaHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaHttpRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
