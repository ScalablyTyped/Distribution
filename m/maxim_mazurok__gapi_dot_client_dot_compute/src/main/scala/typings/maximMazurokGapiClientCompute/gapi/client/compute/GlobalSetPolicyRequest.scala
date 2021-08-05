package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSetPolicyRequest extends StObject {
  
  /** Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings. */
  var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
  
  /** Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain
    * services (like Projects) might reject them.
    */
  var policy: js.UndefOr[Policy] = js.undefined
}
object GlobalSetPolicyRequest {
  
  inline def apply(): GlobalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSetPolicyRequest]
  }
  
  extension [Self <: GlobalSetPolicyRequest](x: Self) {
    
    inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
