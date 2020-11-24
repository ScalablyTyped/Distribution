package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAttestorsResponse extends js.Object {
  
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
  implicit class ListAttestorsResponseOps[Self <: ListAttestorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttestorsVarargs(value: Attestor*): Self = this.set("attestors", js.Array(value :_*))
    
    @scala.inline
    def setAttestors(value: js.Array[Attestor]): Self = this.set("attestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestors: Self = this.set("attestors", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
