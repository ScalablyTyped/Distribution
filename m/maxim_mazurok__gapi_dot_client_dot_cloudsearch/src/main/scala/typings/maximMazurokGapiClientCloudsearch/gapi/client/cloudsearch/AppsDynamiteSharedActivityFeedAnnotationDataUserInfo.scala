package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedActivityFeedAnnotationDataUserInfo extends StObject {
  
  /** Describes how updater_count_to_show should be used. */
  var updaterCountDisplayType: js.UndefOr[String] = js.undefined
  
  /** The number of updaters for clients to show, currently set to the total number of updaters minus the one set in updater_to_show. */
  var updaterCountToShow: js.UndefOr[Double] = js.undefined
  
  /** The updater for clients to show. */
  var updaterToShow: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamiteSharedActivityFeedAnnotationDataUserInfo {
  
  inline def apply(): AppsDynamiteSharedActivityFeedAnnotationDataUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedActivityFeedAnnotationDataUserInfo]
  }
  
  extension [Self <: AppsDynamiteSharedActivityFeedAnnotationDataUserInfo](x: Self) {
    
    inline def setUpdaterCountDisplayType(value: String): Self = StObject.set(x, "updaterCountDisplayType", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountDisplayTypeUndefined: Self = StObject.set(x, "updaterCountDisplayType", js.undefined)
    
    inline def setUpdaterCountToShow(value: Double): Self = StObject.set(x, "updaterCountToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountToShowUndefined: Self = StObject.set(x, "updaterCountToShow", js.undefined)
    
    inline def setUpdaterToShow(value: AppsDynamiteUserId): Self = StObject.set(x, "updaterToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowUndefined: Self = StObject.set(x, "updaterToShow", js.undefined)
  }
}
