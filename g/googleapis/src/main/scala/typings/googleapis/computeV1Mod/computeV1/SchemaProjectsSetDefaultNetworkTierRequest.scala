package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsSetDefaultNetworkTierRequest extends StObject {
  
  /**
    * Default network tier to be set.
    */
  var networkTier: js.UndefOr[String | Null] = js.undefined
}
object SchemaProjectsSetDefaultNetworkTierRequest {
  
  inline def apply(): SchemaProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultNetworkTierRequest]
  }
  
  extension [Self <: SchemaProjectsSetDefaultNetworkTierRequest](x: Self) {
    
    inline def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    inline def setNetworkTierNull: Self = StObject.set(x, "networkTier", null)
    
    inline def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
  }
}
