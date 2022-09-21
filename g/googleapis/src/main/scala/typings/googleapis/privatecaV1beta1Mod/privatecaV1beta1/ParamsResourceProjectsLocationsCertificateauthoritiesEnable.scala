package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificateauthoritiesEnable
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnableCertificateAuthorityRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCertificateauthoritiesEnable {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificateauthoritiesEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificateauthoritiesEnable]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificateauthoritiesEnable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaEnableCertificateAuthorityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
