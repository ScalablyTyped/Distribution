package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfo extends StObject {
  
  /** Describes how updater_count_to_show should be used. */
  var updaterCountDisplayType: js.UndefOr[String] = js.undefined
  
  /** The number of updaters for clients to show depending on UpdaterCountDisplayType. */
  var updaterCountToShow: js.UndefOr[Double] = js.undefined
  
  /** The email of the updater for clients to show used for Gmail items. */
  var updaterToShowEmail: js.UndefOr[String] = js.undefined
  
  /** The gaia id of the updater for clients to show used for Gmail items. If the updater is an external user, the email field below should be populated. */
  var updaterToShowGaiaId: js.UndefOr[String] = js.undefined
  
  /** The updater for clients to show used for Dynamite Chat items. */
  var updaterToShowUserId: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object UserInfo {
  
  inline def apply(): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfo]
  }
  
  extension [Self <: UserInfo](x: Self) {
    
    inline def setUpdaterCountDisplayType(value: String): Self = StObject.set(x, "updaterCountDisplayType", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountDisplayTypeUndefined: Self = StObject.set(x, "updaterCountDisplayType", js.undefined)
    
    inline def setUpdaterCountToShow(value: Double): Self = StObject.set(x, "updaterCountToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountToShowUndefined: Self = StObject.set(x, "updaterCountToShow", js.undefined)
    
    inline def setUpdaterToShowEmail(value: String): Self = StObject.set(x, "updaterToShowEmail", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowEmailUndefined: Self = StObject.set(x, "updaterToShowEmail", js.undefined)
    
    inline def setUpdaterToShowGaiaId(value: String): Self = StObject.set(x, "updaterToShowGaiaId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowGaiaIdUndefined: Self = StObject.set(x, "updaterToShowGaiaId", js.undefined)
    
    inline def setUpdaterToShowUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "updaterToShowUserId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowUserIdUndefined: Self = StObject.set(x, "updaterToShowUserId", js.undefined)
  }
}
