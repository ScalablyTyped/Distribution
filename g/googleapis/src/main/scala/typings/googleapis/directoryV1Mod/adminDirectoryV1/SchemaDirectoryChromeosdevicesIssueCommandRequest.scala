package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDirectoryChromeosdevicesIssueCommandRequest extends StObject {
  
  /**
    * The type of command.
    */
  var commandType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The payload for the command, provide it only if command supports it. The following commands support adding payload: - SET_VOLUME: Payload is a stringified JSON object in the form: { "volume": 50 \}. The volume has to be an integer in the range [0,100].
    */
  var payload: js.UndefOr[String | Null] = js.undefined
}
object SchemaDirectoryChromeosdevicesIssueCommandRequest {
  
  inline def apply(): SchemaDirectoryChromeosdevicesIssueCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectoryChromeosdevicesIssueCommandRequest]
  }
  
  extension [Self <: SchemaDirectoryChromeosdevicesIssueCommandRequest](x: Self) {
    
    inline def setCommandType(value: String): Self = StObject.set(x, "commandType", value.asInstanceOf[js.Any])
    
    inline def setCommandTypeNull: Self = StObject.set(x, "commandType", null)
    
    inline def setCommandTypeUndefined: Self = StObject.set(x, "commandType", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
