package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudienceGroup extends js.Object {
  
  /**
    * Required. All combined audience targeting settings in combined audience group. Repeated settings with same id will be ignored. The number of combined audience settings should be no
    * more than five, error will be thrown otherwise.
    */
  var settings: js.UndefOr[js.Array[CombinedAudienceTargetingSetting]] = js.native
}
object CombinedAudienceGroup {
  
  @scala.inline
  def apply(): CombinedAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedAudienceGroup]
  }
  
  @scala.inline
  implicit class CombinedAudienceGroupOps[Self <: CombinedAudienceGroup] (val x: Self) extends AnyVal {
    
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
    def setSettingsVarargs(value: CombinedAudienceTargetingSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[CombinedAudienceTargetingSetting]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
