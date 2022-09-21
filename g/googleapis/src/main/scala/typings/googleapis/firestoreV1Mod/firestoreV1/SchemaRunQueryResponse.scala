package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunQueryResponse extends StObject {
  
  /**
    * A query result, not set when reporting partial progress.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * If present, Firestore has completely finished the request and no more documents will be returned.
    */
  var done: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time at which the document was read. This may be monotonically increasing; in this case, the previous documents in the result stream are guaranteed not to have changed between their `read_time` and this one. If the query returns no results, a response with `read_time` and no `document` will be sent, and this represents the time at which the query was run.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of results that have been skipped due to an offset between the last response and the current response.
    */
  var skippedResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The transaction that was started as part of this request. Can only be set in the first response, and only if RunQueryRequest.new_transaction was set in the request. If set, no other fields will be set in this response.
    */
  var transaction: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunQueryResponse {
  
  inline def apply(): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
  
  extension [Self <: SchemaRunQueryResponse](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneNull: Self = StObject.set(x, "done", null)
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setSkippedResults(value: Double): Self = StObject.set(x, "skippedResults", value.asInstanceOf[js.Any])
    
    inline def setSkippedResultsNull: Self = StObject.set(x, "skippedResults", null)
    
    inline def setSkippedResultsUndefined: Self = StObject.set(x, "skippedResults", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
