package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttestorsResponse extends StObject {
  
  /** The list of attestors. */
  var attestors: js.UndefOr[js.Array[Attestor]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListAttestorsRequest.page_token field in the subsequent call to the `ListAttestors` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAttestorsResponse {
  
  @scala.inline
  def apply(): ListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttestorsResponse]
  }
  
  @scala.inline
  implicit class ListAttestorsResponseMutableBuilder[Self <: ListAttestorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestors(value: js.Array[Attestor]): Self = StObject.set(x, "attestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestorsUndefined: Self = StObject.set(x, "attestors", js.undefined)
    
    @scala.inline
    def setAttestorsVarargs(value: Attestor*): Self = StObject.set(x, "attestors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
