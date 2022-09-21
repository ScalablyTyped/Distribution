package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteIntegrationConfigMutation extends StObject {
  
  /** Add an app using its identifier. */
  var addApp: js.UndefOr[AppsDynamiteAppId] = js.undefined
  
  /** Add a pinned tab using its identifier. */
  var addPinnedItem: js.UndefOr[AppsDynamitePinnedItemId] = js.undefined
  
  /** Remove an active app using its identifier. */
  var removeApp: js.UndefOr[AppsDynamiteAppId] = js.undefined
  
  /** Remove an active pinned tab using its identifier. */
  var removePinnedItem: js.UndefOr[AppsDynamitePinnedItemId] = js.undefined
}
object AppsDynamiteIntegrationConfigMutation {
  
  inline def apply(): AppsDynamiteIntegrationConfigMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteIntegrationConfigMutation]
  }
  
  extension [Self <: AppsDynamiteIntegrationConfigMutation](x: Self) {
    
    inline def setAddApp(value: AppsDynamiteAppId): Self = StObject.set(x, "addApp", value.asInstanceOf[js.Any])
    
    inline def setAddAppUndefined: Self = StObject.set(x, "addApp", js.undefined)
    
    inline def setAddPinnedItem(value: AppsDynamitePinnedItemId): Self = StObject.set(x, "addPinnedItem", value.asInstanceOf[js.Any])
    
    inline def setAddPinnedItemUndefined: Self = StObject.set(x, "addPinnedItem", js.undefined)
    
    inline def setRemoveApp(value: AppsDynamiteAppId): Self = StObject.set(x, "removeApp", value.asInstanceOf[js.Any])
    
    inline def setRemoveAppUndefined: Self = StObject.set(x, "removeApp", js.undefined)
    
    inline def setRemovePinnedItem(value: AppsDynamitePinnedItemId): Self = StObject.set(x, "removePinnedItem", value.asInstanceOf[js.Any])
    
    inline def setRemovePinnedItemUndefined: Self = StObject.set(x, "removePinnedItem", js.undefined)
  }
}
