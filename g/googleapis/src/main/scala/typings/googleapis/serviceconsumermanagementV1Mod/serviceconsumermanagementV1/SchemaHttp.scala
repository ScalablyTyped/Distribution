package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the HTTP configuration for an API service. It contains a list of
  * HttpRule, each specifying the mapping of an RPC method to one or more HTTP
  * REST API methods.
  */
@js.native
trait SchemaHttp extends StObject {
  
  /**
    * When set to true, URL path parameters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where
    * &quot;%2F&quot; will be left encoded.  The default behavior is to not
    * decode RFC 6570 reserved characters in multi segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaHttpRule]] = js.native
}
object SchemaHttp {
  
  @scala.inline
  def apply(): SchemaHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttp]
  }
  
  @scala.inline
  implicit class SchemaHttpMutableBuilder[Self <: SchemaHttp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyDecodeReservedExpansion(value: Boolean): Self = StObject.set(x, "fullyDecodeReservedExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyDecodeReservedExpansionUndefined: Self = StObject.set(x, "fullyDecodeReservedExpansion", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[SchemaHttpRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaHttpRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
