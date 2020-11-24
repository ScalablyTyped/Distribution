package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Space extends js.Object {
  
  /** Output only. The display name (only if the space is a room). Please note that this field might not be populated in direct messages between humans. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name of the space, in the form "spaces/ *". Example: spaces/AAAAMpdlehYs */
  var name: js.UndefOr[String] = js.native
  
  /** Whether the space is a DM between a bot and a single human. */
  var singleUserBotDm: js.UndefOr[Boolean] = js.native
  
  /** Whether the messages are threaded in this space. */
  var threaded: js.UndefOr[Boolean] = js.native
  
  /** Output only. The type of a space. This is deprecated. Use `single_user_bot_dm` instead. */
  var `type`: js.UndefOr[String] = js.native
}
object Space {
  
  @scala.inline
  def apply(): Space = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Space]
  }
  
  @scala.inline
  implicit class SpaceOps[Self <: Space] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSingleUserBotDm(value: Boolean): Self = this.set("singleUserBotDm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleUserBotDm: Self = this.set("singleUserBotDm", js.undefined)
    
    @scala.inline
    def setThreaded(value: Boolean): Self = this.set("threaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreaded: Self = this.set("threaded", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
