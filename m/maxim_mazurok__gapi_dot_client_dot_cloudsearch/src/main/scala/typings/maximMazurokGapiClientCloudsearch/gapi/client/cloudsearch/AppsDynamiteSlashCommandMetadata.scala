package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSlashCommandMetadata extends StObject {
  
  /** Hint string for the arguments expected by the slash command. */
  var argumentsHint: js.UndefOr[String] = js.undefined
  
  /** Unique id for the slash command. */
  var commandId: js.UndefOr[String] = js.undefined
  
  /** Name of the slash command. */
  var commandName: js.UndefOr[String] = js.undefined
  
  /** ID of the bot which owns the slash command. */
  var id: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** Whether or not this slash command should trigger a dialog. */
  var triggersDialog: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSlashCommandMetadata {
  
  inline def apply(): AppsDynamiteSlashCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSlashCommandMetadata]
  }
  
  extension [Self <: AppsDynamiteSlashCommandMetadata](x: Self) {
    
    inline def setArgumentsHint(value: String): Self = StObject.set(x, "argumentsHint", value.asInstanceOf[js.Any])
    
    inline def setArgumentsHintUndefined: Self = StObject.set(x, "argumentsHint", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setId(value: AppsDynamiteUserId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTriggersDialog(value: Boolean): Self = StObject.set(x, "triggersDialog", value.asInstanceOf[js.Any])
    
    inline def setTriggersDialogUndefined: Self = StObject.set(x, "triggersDialog", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
