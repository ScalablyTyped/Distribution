package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHistoryResponse extends StObject {
  
  /**
    * List of history records. Any messages contained in the response will
    * typically only have id and threadId fields populated.
    */
  var history: js.UndefOr[js.Array[SchemaHistory]] = js.undefined
  
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListHistoryResponse {
  
  @scala.inline
  def apply(): SchemaListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHistoryResponse]
  }
  
  @scala.inline
  implicit class SchemaListHistoryResponseMutableBuilder[Self <: SchemaListHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[SchemaHistory]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: SchemaHistory*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
