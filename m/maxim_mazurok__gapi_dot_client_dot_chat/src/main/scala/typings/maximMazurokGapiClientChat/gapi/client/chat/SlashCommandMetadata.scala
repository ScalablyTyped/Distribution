package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlashCommandMetadata extends StObject {
  
  /** The Chat app whose command was invoked. */
  var bot: js.UndefOr[User] = js.undefined
  
  /** The command id of the invoked slash command. */
  var commandId: js.UndefOr[String] = js.undefined
  
  /** The name of the invoked slash command. */
  var commandName: js.UndefOr[String] = js.undefined
  
  /** Indicating whether the slash command is for a dialog. */
  var triggersDialog: js.UndefOr[Boolean] = js.undefined
  
  /** The type of slash command. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SlashCommandMetadata {
  
  inline def apply(): SlashCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommandMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlashCommandMetadata] (val x: Self) extends AnyVal {
    
    inline def setBot(value: User): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "bot", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setTriggersDialog(value: Boolean): Self = StObject.set(x, "triggersDialog", value.asInstanceOf[js.Any])
    
    inline def setTriggersDialogUndefined: Self = StObject.set(x, "triggersDialog", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
