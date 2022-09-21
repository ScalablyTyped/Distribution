package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeKubeletConfig extends StObject {
  
  /**
    * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled by default which makes kubelet use CFS quota (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU throttling problems while still having your pods to be in Guaranteed QoS class by specifying the CPU limits. The default value is 'true' if unspecified.
    */
  var cpuCfsQuota: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
    */
  var cpuCfsQuotaPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which represents the existing scheduling behavior. * "static": allows pods with certain resource characteristics to be granted increased CPU affinity and exclusivity on the node. The default value is 'none' if unspecified.
    */
  var cpuManagerPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set the Pod PID limits. See https://kubernetes.io/docs/concepts/policy/pid-limiting/#pod-pid-limits Controls the maximum number of processes allowed to run in a pod. The value must be greater than or equal to 1024 and less than 4194304.
    */
  var podPidsLimit: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeKubeletConfig {
  
  inline def apply(): SchemaNodeKubeletConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeKubeletConfig]
  }
  
  extension [Self <: SchemaNodeKubeletConfig](x: Self) {
    
    inline def setCpuCfsQuota(value: Boolean): Self = StObject.set(x, "cpuCfsQuota", value.asInstanceOf[js.Any])
    
    inline def setCpuCfsQuotaNull: Self = StObject.set(x, "cpuCfsQuota", null)
    
    inline def setCpuCfsQuotaPeriod(value: String): Self = StObject.set(x, "cpuCfsQuotaPeriod", value.asInstanceOf[js.Any])
    
    inline def setCpuCfsQuotaPeriodNull: Self = StObject.set(x, "cpuCfsQuotaPeriod", null)
    
    inline def setCpuCfsQuotaPeriodUndefined: Self = StObject.set(x, "cpuCfsQuotaPeriod", js.undefined)
    
    inline def setCpuCfsQuotaUndefined: Self = StObject.set(x, "cpuCfsQuota", js.undefined)
    
    inline def setCpuManagerPolicy(value: String): Self = StObject.set(x, "cpuManagerPolicy", value.asInstanceOf[js.Any])
    
    inline def setCpuManagerPolicyNull: Self = StObject.set(x, "cpuManagerPolicy", null)
    
    inline def setCpuManagerPolicyUndefined: Self = StObject.set(x, "cpuManagerPolicy", js.undefined)
    
    inline def setPodPidsLimit(value: String): Self = StObject.set(x, "podPidsLimit", value.asInstanceOf[js.Any])
    
    inline def setPodPidsLimitNull: Self = StObject.set(x, "podPidsLimit", null)
    
    inline def setPodPidsLimitUndefined: Self = StObject.set(x, "podPidsLimit", js.undefined)
  }
}
