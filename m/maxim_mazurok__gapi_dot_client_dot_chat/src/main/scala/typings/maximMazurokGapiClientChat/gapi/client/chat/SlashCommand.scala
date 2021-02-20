package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommand extends StObject {
  
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
  implicit class SlashCommandMutableBuilder[Self <: SlashCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
  }
}
