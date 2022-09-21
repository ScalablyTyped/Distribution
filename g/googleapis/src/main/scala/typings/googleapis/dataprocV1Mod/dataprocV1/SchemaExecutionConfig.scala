package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionConfig extends StObject {
  
  /**
    * Optional. The Cloud KMS key to use for encryption.
    */
  var kmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Tags used for network traffic control.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Network URI to connect workload to.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Service account that used to execute workload.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Subnetwork URI to connect workload to.
    */
  var subnetworkUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecutionConfig {
  
  inline def apply(): SchemaExecutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionConfig]
  }
  
  extension [Self <: SchemaExecutionConfig](x: Self) {
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNull: Self = StObject.set(x, "kmsKey", null)
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSubnetworkUri(value: String): Self = StObject.set(x, "subnetworkUri", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUriNull: Self = StObject.set(x, "subnetworkUri", null)
    
    inline def setSubnetworkUriUndefined: Self = StObject.set(x, "subnetworkUri", js.undefined)
  }
}
