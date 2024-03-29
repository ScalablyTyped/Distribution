package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkPolicy extends StObject {
  
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkPolicy {
  
  inline def apply(): SchemaNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicy]
  }
  
  extension [Self <: SchemaNetworkPolicy](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
