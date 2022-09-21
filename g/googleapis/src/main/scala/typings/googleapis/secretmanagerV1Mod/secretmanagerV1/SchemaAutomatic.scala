package typings.googleapis.secretmanagerV1Mod.secretmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutomatic extends StObject {
  
  /**
    * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
    */
  var customerManagedEncryption: js.UndefOr[SchemaCustomerManagedEncryption] = js.undefined
}
object SchemaAutomatic {
  
  inline def apply(): SchemaAutomatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutomatic]
  }
  
  extension [Self <: SchemaAutomatic](x: Self) {
    
    inline def setCustomerManagedEncryption(value: SchemaCustomerManagedEncryption): Self = StObject.set(x, "customerManagedEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionUndefined: Self = StObject.set(x, "customerManagedEncryption", js.undefined)
  }
}
