package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerEncryptionKeyProtectedDisk extends StObject {
  
  /** Decrypts data associated with the disk with a customer-supplied encryption key. */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. */
  var source: js.UndefOr[String] = js.native
}
object CustomerEncryptionKeyProtectedDisk {
  
  @scala.inline
  def apply(): CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKeyProtectedDisk]
  }
  
  @scala.inline
  implicit class CustomerEncryptionKeyProtectedDiskMutableBuilder[Self <: CustomerEncryptionKeyProtectedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskEncryptionKey(value: CustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
