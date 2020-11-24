package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserTargetingConfig extends js.Object {
  
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
  implicit class AdvertiserTargetingConfigOps[Self <: AdvertiserTargetingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExemptTvFromViewabilityTargeting(value: Boolean): Self = this.set("exemptTvFromViewabilityTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExemptTvFromViewabilityTargeting: Self = this.set("exemptTvFromViewabilityTargeting", js.undefined)
  }
}
