package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
trait SchemaListAuthorizedCertificatesResponse extends StObject {
  
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[SchemaAuthorizedCertificate]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAuthorizedCertificatesResponse {
  
  inline def apply(): SchemaListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedCertificatesResponse]
  }
  
  extension [Self <: SchemaListAuthorizedCertificatesResponse](x: Self) {
    
    inline def setCertificates(value: js.Array[SchemaAuthorizedCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: SchemaAuthorizedCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
