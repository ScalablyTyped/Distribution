package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListLogs.
  */
@js.native
trait SchemaListLogsResponse extends StObject {
  
  /**
    * A list of log names. For example, &quot;projects/my-project/syslog&quot;
    * or
    * &quot;organizations/123/cloudresourcemanager.googleapis.com%2Factivity&quot;.
    */
  var logNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListLogsResponse {
  
  @scala.inline
  def apply(): SchemaListLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLogsResponseMutableBuilder[Self <: SchemaListLogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogNames(value: js.Array[String]): Self = StObject.set(x, "logNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNamesUndefined: Self = StObject.set(x, "logNames", js.undefined)
    
    @scala.inline
    def setLogNamesVarargs(value: String*): Self = StObject.set(x, "logNames", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
