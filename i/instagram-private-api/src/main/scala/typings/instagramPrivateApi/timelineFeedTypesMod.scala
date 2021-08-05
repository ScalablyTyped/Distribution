package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineFeedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.instagramPrivateApi.instagramPrivateApiStrings.pagination
    - typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
    - typings.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch
    - typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch
  */
  trait TimelineFeedReason extends StObject
  object TimelineFeedReason {
    
    inline def cold_start_fetch: typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch = "cold_start_fetch".asInstanceOf[typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch]
    
    inline def pagination: typings.instagramPrivateApi.instagramPrivateApiStrings.pagination = "pagination".asInstanceOf[typings.instagramPrivateApi.instagramPrivateApiStrings.pagination]
    
    inline def pull_to_refresh: typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh = "pull_to_refresh".asInstanceOf[typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh]
    
    inline def warm_start_fetch: typings.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch = "warm_start_fetch".asInstanceOf[typings.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch]
  }
  
  trait TimelineFeedsOptions extends StObject {
    
    var latestStoryPk: js.UndefOr[String | Double] = js.undefined
    
    var pushDisabled: js.UndefOr[Boolean] = js.undefined
    
    var reason: js.UndefOr[TimelineFeedReason] = js.undefined
    
    var recoveredFromCrash: js.UndefOr[String] = js.undefined
  }
  object TimelineFeedsOptions {
    
    inline def apply(): TimelineFeedsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineFeedsOptions]
    }
    
    extension [Self <: TimelineFeedsOptions](x: Self) {
      
      inline def setLatestStoryPk(value: String | Double): Self = StObject.set(x, "latestStoryPk", value.asInstanceOf[js.Any])
      
      inline def setLatestStoryPkUndefined: Self = StObject.set(x, "latestStoryPk", js.undefined)
      
      inline def setPushDisabled(value: Boolean): Self = StObject.set(x, "pushDisabled", value.asInstanceOf[js.Any])
      
      inline def setPushDisabledUndefined: Self = StObject.set(x, "pushDisabled", js.undefined)
      
      inline def setReason(value: TimelineFeedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRecoveredFromCrash(value: String): Self = StObject.set(x, "recoveredFromCrash", value.asInstanceOf[js.Any])
      
      inline def setRecoveredFromCrashUndefined: Self = StObject.set(x, "recoveredFromCrash", js.undefined)
    }
  }
}
