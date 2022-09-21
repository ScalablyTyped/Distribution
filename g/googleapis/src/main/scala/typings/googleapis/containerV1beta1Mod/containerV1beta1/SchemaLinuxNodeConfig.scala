package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinuxNodeConfig extends StObject {
  
  /**
    * cgroup_mode specifies the cgroup mode to be used on the node.
    */
  var cgroupMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Linux kernel parameters to be applied to the nodes and all pods running on the nodes. The following parameters are supported. net.core.busy_poll net.core.busy_read net.core.netdev_max_backlog net.core.rmem_max net.core.wmem_default net.core.wmem_max net.core.optmem_max net.core.somaxconn net.ipv4.tcp_rmem net.ipv4.tcp_wmem net.ipv4.tcp_tw_reuse
    */
  var sysctls: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaLinuxNodeConfig {
  
  inline def apply(): SchemaLinuxNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinuxNodeConfig]
  }
  
  extension [Self <: SchemaLinuxNodeConfig](x: Self) {
    
    inline def setCgroupMode(value: String): Self = StObject.set(x, "cgroupMode", value.asInstanceOf[js.Any])
    
    inline def setCgroupModeNull: Self = StObject.set(x, "cgroupMode", null)
    
    inline def setCgroupModeUndefined: Self = StObject.set(x, "cgroupMode", js.undefined)
    
    inline def setSysctls(value: StringDictionary[String]): Self = StObject.set(x, "sysctls", value.asInstanceOf[js.Any])
    
    inline def setSysctlsNull: Self = StObject.set(x, "sysctls", null)
    
    inline def setSysctlsUndefined: Self = StObject.set(x, "sysctls", js.undefined)
  }
}
