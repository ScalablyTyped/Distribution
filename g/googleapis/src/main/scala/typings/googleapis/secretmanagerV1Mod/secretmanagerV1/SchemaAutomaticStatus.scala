package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutomaticStatus extends StObject {
  
  /**
    * Output only. The customer-managed encryption status of the SecretVersion. Only populated if customer-managed encryption is used.
    */
  var customerManagedEncryption: js.UndefOr[SchemaCustomerManagedEncryptionStatus] = js.undefined
}
object SchemaAutomaticStatus {
  
  inline def apply(): SchemaAutomaticStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutomaticStatus]
  }
  
  extension [Self <: SchemaAutomaticStatus](x: Self) {
    
    inline def setCustomerManagedEncryption(value: SchemaCustomerManagedEncryptionStatus): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
