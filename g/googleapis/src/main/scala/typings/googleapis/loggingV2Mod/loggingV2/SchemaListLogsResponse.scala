package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLogsResponse extends StObject {
  
  /**
    * A list of log names. For example, "projects/my-project/logs/syslog" or "organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity".
    */
  var logNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListLogsResponse {
  
  inline def apply(): SchemaListLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogsResponse]
  }
  
  extension [Self <: SchemaListLogsResponse](x: Self) {
    
    inline def setLogNames(value: js.Array[String]): Self = StObject.set(x, "logNames", value.asInstanceOf[js.Any])
    
    inline def setLogNamesNull: Self = StObject.set(x, "logNames", null)
    
    inline def setLogNamesUndefined: Self = StObject.set(x, "logNames", js.undefined)
    
    inline def setLogNamesVarargs(value: String*): Self = StObject.set(x, "logNames", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
