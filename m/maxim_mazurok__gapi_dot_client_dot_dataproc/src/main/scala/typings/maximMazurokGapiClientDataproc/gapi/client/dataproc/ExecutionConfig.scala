package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionConfig extends StObject {
  
  /** Optional. The Cloud KMS key to use for encryption. */
  var kmsKey: js.UndefOr[String] = js.undefined
  
  /** Optional. Tags used for network traffic control. */
  var networkTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Network URI to connect workload to. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Optional. Service account that used to execute workload. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** Optional. Subnetwork URI to connect workload to. */
  var subnetworkUri: js.UndefOr[String] = js.undefined
}
object ExecutionConfig {
  
  inline def apply(): ExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionConfig]
  }
  
  extension [Self <: ExecutionConfig](x: Self) {
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSubnetworkUri(value: String): Self = StObject.set(x, "subnetworkUri", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUriUndefined: Self = StObject.set(x, "subnetworkUri", js.undefined)
  }
}
