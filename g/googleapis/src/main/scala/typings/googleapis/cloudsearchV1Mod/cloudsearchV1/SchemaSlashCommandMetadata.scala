package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlashCommandMetadata extends StObject {
  
  /**
    * Hint string for the arguments expected by the slash command.
    */
  var argumentsHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique id for the slash command.
    */
  var commandId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the slash command.
    */
  var commandName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the bot which owns the slash command.
    */
  var id: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Whether or not this slash command should trigger a dialog.
    */
  var triggersDialog: js.UndefOr[Boolean | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlashCommandMetadata {
  
  inline def apply(): SchemaSlashCommandMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlashCommandMetadata]
  }
  
  extension [Self <: SchemaSlashCommandMetadata](x: Self) {
    
    inline def setArgumentsHint(value: String): Self = StObject.set(x, "argumentsHint", value.asInstanceOf[js.Any])
    
    inline def setArgumentsHintNull: Self = StObject.set(x, "argumentsHint", null)
    
    inline def setArgumentsHintUndefined: Self = StObject.set(x, "argumentsHint", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdNull: Self = StObject.set(x, "commandId", null)
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameNull: Self = StObject.set(x, "commandName", null)
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setId(value: SchemaUserId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTriggersDialog(value: Boolean): Self = StObject.set(x, "triggersDialog", value.asInstanceOf[js.Any])
    
    inline def setTriggersDialogNull: Self = StObject.set(x, "triggersDialog", null)
    
    inline def setTriggersDialogUndefined: Self = StObject.set(x, "triggersDialog", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
