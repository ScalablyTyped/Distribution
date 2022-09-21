package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteGroupRetentionSettingsUpdatedMetaData extends StObject {
  
  /** The user who triggered the retention settings update */
  var initiator: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** The updated space retention settings */
  var retentionSettings: js.UndefOr[AppsDynamiteSharedRetentionSettings] = js.undefined
}
object AppsDynamiteGroupRetentionSettingsUpdatedMetaData {
  
  inline def apply(): AppsDynamiteGroupRetentionSettingsUpdatedMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteGroupRetentionSettingsUpdatedMetaData]
  }
  
  extension [Self <: AppsDynamiteGroupRetentionSettingsUpdatedMetaData](x: Self) {
    
    inline def setInitiator(value: AppsDynamiteUserId): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setRetentionSettings(value: AppsDynamiteSharedRetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRetentionSettingsUndefined: Self = StObject.set(x, "retentionSettings", js.undefined)
  }
}
