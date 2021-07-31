package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result returned from ListLogEntries.
  */
trait SchemaListLogEntriesResponse extends StObject {
  
  /**
    * A list of log entries. If entries is empty, nextPageToken may still be
    * returned, indicating that more entries may exist. See nextPageToken for
    * more information.
    */
  var entries: js.UndefOr[js.Array[SchemaLogEntry]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.If a value for
    * next_page_token appears and the entries field is empty, it means that the
    * search found no log entries so far but it did not have time to search all
    * the possible log entries. Retry the method with this value for page_token
    * to continue the search. Alternatively, consider speeding up the search by
    * changing your filter to specify a single log name or resource type, or to
    * narrow the time range of the search.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListLogEntriesResponse {
  
  @scala.inline
  def apply(): SchemaListLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogEntriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListLogEntriesResponseMutableBuilder[Self <: SchemaListLogEntriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaLogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaLogEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
