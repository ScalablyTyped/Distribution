package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for the master authorized networks feature. Enabled
  * master authorized networks will disallow all external traffic to access
  * Kubernetes master through HTTPS except traffic from the given CIDR blocks,
  * Google Compute Engine Public IPs and Google Prod IPs.
  */
trait SchemaMasterAuthorizedNetworksConfig extends StObject {
  
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[SchemaCidrBlock]] = js.undefined
  
  /**
    * Whether or not master authorized networks is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaMasterAuthorizedNetworksConfig {
  
  inline def apply(): SchemaMasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterAuthorizedNetworksConfig]
  }
  
  extension [Self <: SchemaMasterAuthorizedNetworksConfig](x: Self) {
    
    inline def setCidrBlocks(value: js.Array[SchemaCidrBlock]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
    
    inline def setCidrBlocksVarargs(value: SchemaCidrBlock*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
