package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveTargetedAppsRequest extends StObject {
  
  /**
    * A list of app IDs to stop targeting in the pretargeting configuration. These values will be removed from the list of targeted app IDs in PretargetingConfig.appTargeting.mobileAppTargeting.values.
    */
  var appIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemoveTargetedAppsRequest {
  
  inline def apply(): SchemaRemoveTargetedAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveTargetedAppsRequest]
  }
  
  extension [Self <: SchemaRemoveTargetedAppsRequest](x: Self) {
    
    inline def setAppIds(value: js.Array[String]): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsNull: Self = StObject.set(x, "appIds", null)
    
    inline def setAppIdsUndefined: Self = StObject.set(x, "appIds", js.undefined)
    
    inline def setAppIdsVarargs(value: String*): Self = StObject.set(x, "appIds", js.Array(value*))
  }
}
