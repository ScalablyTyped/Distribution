package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommandMetadata extends js.Object {
  
  /** The bot whose command was invoked. */
  var bot: js.UndefOr[User] = js.native
  
  /** The command id of the invoked slash command. */
  var commandId: js.UndefOr[String] = js.native
  
  /** The name of the invoked slash command. */
  var commandName: js.UndefOr[String] = js.native
  
  /** Indicating whether the slash command is for a dialog. */
  var triggersDialog: js.UndefOr[Boolean] = js.native
  
  /** The type of slash command. */
  var `type`: js.UndefOr[String] = js.native
}
object SlashCommandMetadata {
  
  @scala.inline
  def apply(): SlashCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommandMetadata]
  }
  
  @scala.inline
  implicit class SlashCommandMetadataOps[Self <: SlashCommandMetadata] (val x: Self) extends AnyVal {
    
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
    def setBot(value: User): Self = this.set("bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBot: Self = this.set("bot", js.undefined)
    
    @scala.inline
    def setCommandId(value: String): Self = this.set("commandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandId: Self = this.set("commandId", js.undefined)
    
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandName: Self = this.set("commandName", js.undefined)
    
    @scala.inline
    def setTriggersDialog(value: Boolean): Self = this.set("triggersDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggersDialog: Self = this.set("triggersDialog", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
