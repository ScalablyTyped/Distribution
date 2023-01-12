package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerAutoHealingPolicy extends StObject {
  
  /** The URL for the health check that signals autohealing. */
  var healthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows
    * instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its
    * instances prematurely. This value must be from range [0, 3600].
    */
  var initialDelaySec: js.UndefOr[Double] = js.undefined
}
object InstanceGroupManagerAutoHealingPolicy {
  
  inline def apply(): InstanceGroupManagerAutoHealingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerAutoHealingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupManagerAutoHealingPolicy] (val x: Self) extends AnyVal {
    
    inline def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setInitialDelaySec(value: Double): Self = StObject.set(x, "initialDelaySec", value.asInstanceOf[js.Any])
    
    inline def setInitialDelaySecUndefined: Self = StObject.set(x, "initialDelaySec", js.undefined)
  }
}
