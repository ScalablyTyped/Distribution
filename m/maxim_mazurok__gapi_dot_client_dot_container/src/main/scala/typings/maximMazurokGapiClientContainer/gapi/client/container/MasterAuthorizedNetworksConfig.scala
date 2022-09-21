package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterAuthorizedNetworksConfig extends StObject {
  
  /** cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS. */
  var cidrBlocks: js.UndefOr[js.Array[CidrBlock]] = js.undefined
  
  /** Whether or not master authorized networks is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object MasterAuthorizedNetworksConfig {
  
  inline def apply(): MasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuthorizedNetworksConfig]
  }
  
  extension [Self <: MasterAuthorizedNetworksConfig](x: Self) {
    
    inline def setCidrBlocks(value: js.Array[CidrBlock]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
    
    inline def setCidrBlocksVarargs(value: CidrBlock*): Self = StObject.set(x, "cidrBlocks", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
