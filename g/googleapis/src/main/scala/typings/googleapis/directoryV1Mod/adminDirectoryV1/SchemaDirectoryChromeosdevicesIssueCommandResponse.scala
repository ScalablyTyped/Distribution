package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDirectoryChromeosdevicesIssueCommandResponse extends StObject {
  
  /**
    * The unique ID of the issued command, used to retrieve the command status.
    */
  var commandId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDirectoryChromeosdevicesIssueCommandResponse {
  
  inline def apply(): SchemaDirectoryChromeosdevicesIssueCommandResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectoryChromeosdevicesIssueCommandResponse]
  }
  
  extension [Self <: SchemaDirectoryChromeosdevicesIssueCommandResponse](x: Self) {
    
    inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdNull: Self = StObject.set(x, "commandId", null)
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "commandId", js.undefined)
  }
}
