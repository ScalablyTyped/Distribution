package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDirectoryChromeosdevicesCommand extends StObject {
  
  /**
    * The time at which the command will expire. If the device doesn't execute the command within this time the command will become expired.
    */
  var commandExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique ID of a device command.
    */
  var commandId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of the command execution.
    */
  var commandResult: js.UndefOr[SchemaDirectoryChromeosdevicesCommandResult] = js.undefined
  
  /**
    * The timestamp when the command was issued by the admin.
    */
  var issueTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The payload that the command specified, if any.
    */
  var payload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the command state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the command.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDirectoryChromeosdevicesCommand {
  
  inline def apply(): SchemaDirectoryChromeosdevicesCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectoryChromeosdevicesCommand]
  }
  
  extension [Self <: SchemaDirectoryChromeosdevicesCommand](x: Self) {
    
    inline def setCommandExpireTime(value: String): Self = StObject.set(x, "commandExpireTime", value.asInstanceOf[js.Any])
    
    inline def setCommandExpireTimeNull: Self = StObject.set(x, "commandExpireTime", null)
    
    inline def setCommandExpireTimeUndefined: Self = StObject.set(x, "commandExpireTime", js.undefined)
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdNull: Self = StObject.set(x, "commandId", null)
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
    
    inline def setCommandResult(value: SchemaDirectoryChromeosdevicesCommandResult): Self = StObject.set(x, "commandResult", value.asInstanceOf[js.Any])
    
    inline def setCommandResultUndefined: Self = StObject.set(x, "commandResult", js.undefined)
    
    inline def setIssueTime(value: String): Self = StObject.set(x, "issueTime", value.asInstanceOf[js.Any])
    
    inline def setIssueTimeNull: Self = StObject.set(x, "issueTime", null)
    
    inline def setIssueTimeUndefined: Self = StObject.set(x, "issueTime", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
