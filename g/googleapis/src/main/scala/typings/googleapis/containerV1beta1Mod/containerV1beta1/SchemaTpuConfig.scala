package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTpuConfig extends StObject {
  
  /**
    * Whether Cloud TPU integration is enabled or not.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * IPv4 CIDR block reserved for Cloud TPU in the VPC.
    */
  var ipv4CidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to use service networking for Cloud TPU or not.
    */
  var useServiceNetworking: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTpuConfig {
  
  inline def apply(): SchemaTpuConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTpuConfig]
  }
  
  extension [Self <: SchemaTpuConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIpv4CidrBlock(value: String): Self = StObject.set(x, "ipv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv4CidrBlockNull: Self = StObject.set(x, "ipv4CidrBlock", null)
    
    inline def setIpv4CidrBlockUndefined: Self = StObject.set(x, "ipv4CidrBlock", js.undefined)
    
    inline def setUseServiceNetworking(value: Boolean): Self = StObject.set(x, "useServiceNetworking", value.asInstanceOf[js.Any])
    
    inline def setUseServiceNetworkingNull: Self = StObject.set(x, "useServiceNetworking", null)
    
    inline def setUseServiceNetworkingUndefined: Self = StObject.set(x, "useServiceNetworking", js.undefined)
  }
}
