package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicaStatus extends StObject {
  
  /**
    * Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used.
    */
  var customerManagedEncryption: js.UndefOr[SchemaCustomerManagedEncryptionStatus] = js.undefined
  
  /**
    * Output only. The canonical ID of the replica location. For example: `"us-east1"`.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicaStatus {
  
  inline def apply(): SchemaReplicaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicaStatus]
  }
  
  extension [Self <: SchemaReplicaStatus](x: Self) {
    
    inline def setCustomerManagedEncryption(value: SchemaCustomerManagedEncryptionStatus): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
