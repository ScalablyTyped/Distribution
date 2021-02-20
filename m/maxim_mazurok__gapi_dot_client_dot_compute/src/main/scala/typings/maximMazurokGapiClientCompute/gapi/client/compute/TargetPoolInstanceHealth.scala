package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPoolInstanceHealth extends StObject {
  
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.native
  
  /** [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance. */
  var kind: js.UndefOr[String] = js.native
}
object TargetPoolInstanceHealth {
  
  @scala.inline
  def apply(): TargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolInstanceHealth]
  }
  
  @scala.inline
  implicit class TargetPoolInstanceHealthMutableBuilder[Self <: TargetPoolInstanceHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: js.Array[HealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setHealthStatusVarargs(value: HealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
