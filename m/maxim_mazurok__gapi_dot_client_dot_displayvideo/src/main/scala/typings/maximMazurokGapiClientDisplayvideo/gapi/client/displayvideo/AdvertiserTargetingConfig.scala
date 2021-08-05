package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserTargetingConfig extends StObject {
  
  /** Whether or not connected TV devices are exempt from viewability targeting for all video line items under the advertiser. */
  var exemptTvFromViewabilityTargeting: js.UndefOr[Boolean] = js.undefined
}
object AdvertiserTargetingConfig {
  
  inline def apply(): AdvertiserTargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserTargetingConfig]
  }
  
  extension [Self <: AdvertiserTargetingConfig](x: Self) {
    
    inline def setExemptTvFromViewabilityTargeting(value: Boolean): Self = StObject.set(x, "exemptTvFromViewabilityTargeting", value.asInstanceOf[js.Any])
    
    inline def setExemptTvFromViewabilityTargetingUndefined: Self = StObject.set(x, "exemptTvFromViewabilityTargeting", js.undefined)
  }
}
