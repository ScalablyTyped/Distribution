package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleLongrunningListOperationsResponse extends StObject {
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[GoogleLongrunningOperation]] = js.undefined
}
object GoogleLongrunningListOperationsResponse {
  
  @scala.inline
  def apply(): GoogleLongrunningListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleLongrunningListOperationsResponse]
  }
  
  @scala.inline
  implicit class GoogleLongrunningListOperationsResponseMutableBuilder[Self <: GoogleLongrunningListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOperations(value: js.Array[GoogleLongrunningOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: GoogleLongrunningOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
