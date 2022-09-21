package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1RunAssetDiscoveryResponse extends StObject {
  
  /**
    * The duration between asset discovery run start and end
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of an asset discovery run.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1RunAssetDiscoveryResponse {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1RunAssetDiscoveryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1RunAssetDiscoveryResponse]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1RunAssetDiscoveryResponse](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
