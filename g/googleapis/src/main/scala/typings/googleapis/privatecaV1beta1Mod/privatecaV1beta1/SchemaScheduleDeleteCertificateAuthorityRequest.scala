package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScheduleDeleteCertificateAuthorityRequest extends StObject {
  
  /**
    * Optional. This field allows the CA to be scheduled for deletion even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
    */
  var ignoreActiveCertificates: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaScheduleDeleteCertificateAuthorityRequest {
  
  inline def apply(): SchemaScheduleDeleteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleDeleteCertificateAuthorityRequest]
  }
  
  extension [Self <: SchemaScheduleDeleteCertificateAuthorityRequest](x: Self) {
    
    inline def setIgnoreActiveCertificates(value: Boolean): Self = StObject.set(x, "ignoreActiveCertificates", value.asInstanceOf[js.Any])
    
    inline def setIgnoreActiveCertificatesNull: Self = StObject.set(x, "ignoreActiveCertificates", null)
    
    inline def setIgnoreActiveCertificatesUndefined: Self = StObject.set(x, "ignoreActiveCertificates", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
