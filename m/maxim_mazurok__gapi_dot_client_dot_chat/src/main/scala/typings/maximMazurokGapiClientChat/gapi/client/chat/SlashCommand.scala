package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlashCommand extends StObject {
  
  /** The id of the slash command invoked. */
  var commandId: js.UndefOr[String] = js.undefined
}
object SlashCommand {
  
  inline def apply(): SlashCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommand]
  }
  
  extension [Self <: SlashCommand](x: Self) {
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
  }
}
