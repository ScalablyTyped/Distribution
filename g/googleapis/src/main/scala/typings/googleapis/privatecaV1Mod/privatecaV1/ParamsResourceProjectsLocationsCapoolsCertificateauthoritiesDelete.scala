package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
    */
  var ignoreActiveCertificates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If this flag is set, the Certificate Authority will be deleted as soon as possible without a 30-day grace period where undeletion would have been allowed. If you proceed, there will be no way to recover this CA.
    */
  var skipGracePeriod: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesDelete](x: Self) {
    
    inline def setIgnoreActiveCertificates(value: Boolean): Self = StObject.set(x, "ignoreActiveCertificates", value.asInstanceOf[js.Any])
    
    inline def setIgnoreActiveCertificatesUndefined: Self = StObject.set(x, "ignoreActiveCertificates", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSkipGracePeriod(value: Boolean): Self = StObject.set(x, "skipGracePeriod", value.asInstanceOf[js.Any])
    
    inline def setSkipGracePeriodUndefined: Self = StObject.set(x, "skipGracePeriod", js.undefined)
  }
}
