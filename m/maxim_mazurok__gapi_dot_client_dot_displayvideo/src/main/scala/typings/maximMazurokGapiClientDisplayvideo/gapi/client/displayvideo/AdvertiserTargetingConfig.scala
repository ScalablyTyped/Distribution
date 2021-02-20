package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserTargetingConfig extends StObject {
  
  /** Whether or not connected TV devices are exempt from viewability targeting for all video line items under the advertiser. */
  var exemptTvFromViewabilityTargeting: js.UndefOr[Boolean] = js.native
}
object AdvertiserTargetingConfig {
  
  @scala.inline
  def apply(): AdvertiserTargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserTargetingConfig]
  }
  
  @scala.inline
  implicit class AdvertiserTargetingConfigMutableBuilder[Self <: AdvertiserTargetingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExemptTvFromViewabilityTargeting(value: Boolean): Self = StObject.set(x, "exemptTvFromViewabilityTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptTvFromViewabilityTargetingUndefined: Self = StObject.set(x, "exemptTvFromViewabilityTargeting", js.undefined)
  }
}
