package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsRemoveInstanceRequest extends StObject {
  
  /** URLs of the instances to be removed from target pool. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}
object TargetPoolsRemoveInstanceRequest {
  
  inline def apply(): TargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsRemoveInstanceRequest]
  }
  
  extension [Self <: TargetPoolsRemoveInstanceRequest](x: Self) {
    
    inline def setInstances(value: js.Array[InstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceReference*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
