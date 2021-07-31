package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuthorizedCertificatesResponse extends StObject {
  
  /** The SSL certificates the user is authorized to administer. */
  var certificates: js.UndefOr[js.Array[AuthorizedCertificate]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAuthorizedCertificatesResponse {
  
  @scala.inline
  def apply(): ListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizedCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListAuthorizedCertificatesResponseMutableBuilder[Self <: ListAuthorizedCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: js.Array[AuthorizedCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: AuthorizedCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
