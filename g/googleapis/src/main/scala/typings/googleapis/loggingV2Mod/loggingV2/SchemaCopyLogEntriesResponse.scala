package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCopyLogEntriesResponse extends StObject {
  
  /**
    * Number of log entries copied.
    */
  var logEntriesCopiedCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaCopyLogEntriesResponse {
  
  inline def apply(): SchemaCopyLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopyLogEntriesResponse]
  }
  
  extension [Self <: SchemaCopyLogEntriesResponse](x: Self) {
    
    inline def setLogEntriesCopiedCount(value: String): Self = StObject.set(x, "logEntriesCopiedCount", value.asInstanceOf[js.Any])
    
    inline def setLogEntriesCopiedCountNull: Self = StObject.set(x, "logEntriesCopiedCount", null)
    
    inline def setLogEntriesCopiedCountUndefined: Self = StObject.set(x, "logEntriesCopiedCount", js.undefined)
  }
}
