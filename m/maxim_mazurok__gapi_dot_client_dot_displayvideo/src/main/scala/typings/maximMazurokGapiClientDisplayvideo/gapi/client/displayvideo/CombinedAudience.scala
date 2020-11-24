package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudience extends js.Object {
  
  /** Output only. The unique ID of the combined audience. Assigned by the system. */
  var combinedAudienceId: js.UndefOr[String] = js.native
  
  /** Output only. The display name of the combined audience. . */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the combined audience. */
  var name: js.UndefOr[String] = js.native
}
object CombinedAudience {
  
  @scala.inline
  def apply(): CombinedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedAudience]
  }
  
  @scala.inline
  implicit class CombinedAudienceOps[Self <: CombinedAudience] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
