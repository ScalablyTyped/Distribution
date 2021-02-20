package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupsSetNamedPortsRequest extends StObject {
  
  /**
    * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings
    * concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied
    * from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** The list of named ports to set for this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
}
object RegionInstanceGroupsSetNamedPortsRequest {
  
  @scala.inline
  def apply(): RegionInstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupsSetNamedPortsRequest]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupsSetNamedPortsRequestMutableBuilder[Self <: RegionInstanceGroupsSetNamedPortsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setNamedPorts(value: js.Array[NamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    @scala.inline
    def setNamedPortsVarargs(value: NamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value :_*))
  }
}
