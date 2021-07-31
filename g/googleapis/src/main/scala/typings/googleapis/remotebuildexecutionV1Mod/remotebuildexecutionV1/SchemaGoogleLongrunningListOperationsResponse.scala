package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Operations.ListOperations.
  */
trait SchemaGoogleLongrunningListOperationsResponse extends StObject {
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of operations that matches the specified filter in the request.
    */
  var operations: js.UndefOr[js.Array[SchemaGoogleLongrunningOperation]] = js.undefined
}
object SchemaGoogleLongrunningListOperationsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleLongrunningListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleLongrunningListOperationsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleLongrunningListOperationsResponseMutableBuilder[Self <: SchemaGoogleLongrunningListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOperations(value: js.Array[SchemaGoogleLongrunningOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SchemaGoogleLongrunningOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
