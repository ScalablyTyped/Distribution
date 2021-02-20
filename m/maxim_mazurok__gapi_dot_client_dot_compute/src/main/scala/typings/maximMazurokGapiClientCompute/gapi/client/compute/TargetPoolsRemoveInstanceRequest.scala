package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolsRemoveInstanceRequest extends StObject {
  
  /** URLs of the instances to be removed from target pool. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.native
}
object TargetPoolsRemoveInstanceRequest {
  
  @scala.inline
  def apply(): TargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsRemoveInstanceRequest]
  }
  
  @scala.inline
  implicit class TargetPoolsRemoveInstanceRequestMutableBuilder[Self <: TargetPoolsRemoveInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[InstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: InstanceReference*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
