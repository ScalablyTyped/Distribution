package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagersSetTargetPoolsRequest extends StObject {
  
  /**
    * The fingerprint of the target pools information. Use this optional property to prevent conflicts when multiple users change the target pools settings concurrently. Obtain the
    * fingerprint with the instanceGroupManagers.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another
    * concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The list of target pool URLs that instances in this managed instance group belong to. The managed instance group applies these target pools to all of the instances in the group.
    * Existing instances and new instances in the group all receive these target pool settings.
    */
  var targetPools: js.UndefOr[js.Array[String]] = js.undefined
}
object InstanceGroupManagersSetTargetPoolsRequest {
  
  inline def apply(): InstanceGroupManagersSetTargetPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersSetTargetPoolsRequest]
  }
  
  extension [Self <: InstanceGroupManagersSetTargetPoolsRequest](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setTargetPools(value: js.Array[String]): Self = StObject.set(x, "targetPools", value.asInstanceOf[js.Any])
    
    inline def setTargetPoolsUndefined: Self = StObject.set(x, "targetPools", js.undefined)
    
    inline def setTargetPoolsVarargs(value: String*): Self = StObject.set(x, "targetPools", js.Array(value*))
  }
}
