package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudienceTargetingSetting extends js.Object {
  
  /** Required. Combined audience id of combined audience targeting setting. This id is combined_audience_id. */
  var combinedAudienceId: js.UndefOr[String] = js.native
}
object CombinedAudienceTargetingSetting {
  
  @scala.inline
  def apply(): CombinedAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedAudienceTargetingSetting]
  }
  
  @scala.inline
  implicit class CombinedAudienceTargetingSettingOps[Self <: CombinedAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
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
    def setCombinedAudienceId(value: String): Self = this.set("combinedAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombinedAudienceId: Self = this.set("combinedAudienceId", js.undefined)
  }
}
