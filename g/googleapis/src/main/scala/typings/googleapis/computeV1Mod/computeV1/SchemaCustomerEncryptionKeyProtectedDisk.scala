package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerEncryptionKeyProtectedDisk extends StObject {
  
  /**
    * Decrypts data associated with the disk with a customer-supplied
    * encryption key.
    */
  var diskEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * Specifies a valid partial or full URL to an existing Persistent Disk
    * resource. This field is only applicable for persistent disks.
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaCustomerEncryptionKeyProtectedDisk {
  
  inline def apply(): SchemaCustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerEncryptionKeyProtectedDisk]
  }
  
  extension [Self <: SchemaCustomerEncryptionKeyProtectedDisk](x: Self) {
    
    inline def setDiskEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
