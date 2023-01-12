package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolInstanceHealth extends StObject {
  
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.undefined
  
  /** [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance. */
  var kind: js.UndefOr[String] = js.undefined
}
object TargetPoolInstanceHealth {
  
  inline def apply(): TargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolInstanceHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetPoolInstanceHealth] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: js.Array[HealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setHealthStatusVarargs(value: HealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
