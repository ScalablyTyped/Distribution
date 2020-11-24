package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommand extends js.Object {
  
  /** The id of the slash command invoked. */
  var commandId: js.UndefOr[String] = js.native
}
object SlashCommand {
  
  @scala.inline
  def apply(): SlashCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommand]
  }
  
  @scala.inline
  implicit class SlashCommandOps[Self <: SlashCommand] (val x: Self) extends AnyVal {
    
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
    def setCommandId(value: String): Self = this.set("commandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandId: Self = this.set("commandId", js.undefined)
  }
}
