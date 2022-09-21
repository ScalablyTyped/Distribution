package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncRepoMetadata extends StObject {
  
  /**
    * The name of the repo being synchronized. Values are of the form `projects//repos/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this operation is started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest status message on syncing the repository.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this operation's status message is updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSyncRepoMetadata {
  
  inline def apply(): SchemaSyncRepoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncRepoMetadata]
  }
  
  extension [Self <: SchemaSyncRepoMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
