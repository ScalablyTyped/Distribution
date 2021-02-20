package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesStartWithEncryptionKeyRequest extends StObject {
  
  /**
    * Array of disks associated with this instance that are protected with a customer-supplied encryption key.
    *
    * In order to start the instance, the disk url and its corresponding key must be provided.
    *
    * If the disk is not protected with a customer-supplied encryption key it should not be specified.
    */
  var disks: js.UndefOr[js.Array[CustomerEncryptionKeyProtectedDisk]] = js.native
}
object InstancesStartWithEncryptionKeyRequest {
  
  @scala.inline
  def apply(): InstancesStartWithEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesStartWithEncryptionKeyRequest]
  }
  
  @scala.inline
  implicit class InstancesStartWithEncryptionKeyRequestMutableBuilder[Self <: InstancesStartWithEncryptionKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: js.Array[CustomerEncryptionKeyProtectedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: CustomerEncryptionKeyProtectedDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
  }
}
