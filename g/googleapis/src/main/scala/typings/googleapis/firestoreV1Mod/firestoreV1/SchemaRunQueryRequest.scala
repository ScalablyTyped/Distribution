package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.RunQuery.
  */
@js.native
trait SchemaRunQueryRequest extends StObject {
  
  /**
    * Starts a new transaction and reads the documents. Defaults to a read-only
    * transaction. The new transaction ID will be returned as the first
    * response in the stream.
    */
  var newTransaction: js.UndefOr[SchemaTransactionOptions] = js.native
  
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * A structured query.
    */
  var structuredQuery: js.UndefOr[SchemaStructuredQuery] = js.native
  
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}
object SchemaRunQueryRequest {
  
  @scala.inline
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaRunQueryRequestMutableBuilder[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTransaction(value: SchemaTransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setStructuredQuery(value: SchemaStructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
