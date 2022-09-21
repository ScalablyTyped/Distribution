package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetDocumentsRequest extends StObject {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`. The request will fail if any of the document is not a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The fields to return. If not set, returns all fields. If a document has a field that is not present in this mask, that field will not be returned in the response.
    */
  var mask: js.UndefOr[SchemaDocumentMask] = js.undefined
  
  /**
    * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new transaction ID will be returned as the first response in the stream.
    */
  var newTransaction: js.UndefOr[SchemaTransactionOptions] = js.undefined
  
  /**
    * Reads documents as they were at the given time. This may not be older than 270 seconds.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchGetDocumentsRequest {
  
  inline def apply(): SchemaBatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetDocumentsRequest]
  }
  
  extension [Self <: SchemaBatchGetDocumentsRequest](x: Self) {
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setMask(value: SchemaDocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNewTransaction(value: SchemaTransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
