package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinuxNodeConfig extends StObject {
  
  /**
    * The Linux kernel parameters to be applied to the nodes and all pods running on the nodes. The following parameters are supported. net.core.busy_poll net.core.busy_read
    * net.core.netdev_max_backlog net.core.rmem_max net.core.wmem_default net.core.wmem_max net.core.optmem_max net.core.somaxconn net.ipv4.tcp_rmem net.ipv4.tcp_wmem
    * net.ipv4.tcp_tw_reuse
    */
  var sysctls: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.LinuxNodeConfig & TopLevel[Any]
  ] = js.undefined
}
object LinuxNodeConfig {
  
  inline def apply(): LinuxNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxNodeConfig]
  }
  
  extension [Self <: LinuxNodeConfig](x: Self) {
    
    inline def setSysctls(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.LinuxNodeConfig & TopLevel[Any]
    ): Self = StObject.set(x, "sysctls", value.asInstanceOf[js.Any])
    
    inline def setSysctlsUndefined: Self = StObject.set(x, "sysctls", js.undefined)
  }
}
