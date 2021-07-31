package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPolicyPreservedStateDiskDevice extends StObject {
  
  /**
    * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no
    * longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.undefined
}
object StatefulPolicyPreservedStateDiskDevice {
  
  @scala.inline
  def apply(): StatefulPolicyPreservedStateDiskDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicyPreservedStateDiskDevice]
  }
  
  @scala.inline
  implicit class StatefulPolicyPreservedStateDiskDeviceMutableBuilder[Self <: StatefulPolicyPreservedStateDiskDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDelete(value: String): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
  }
}
