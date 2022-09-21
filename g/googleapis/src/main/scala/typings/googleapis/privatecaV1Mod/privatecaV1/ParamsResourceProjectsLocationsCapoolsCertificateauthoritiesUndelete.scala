package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/caPools/x/certificateAuthorities/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUndeleteCertificateAuthorityRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapoolsCertificateauthoritiesUndelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUndeleteCertificateAuthorityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
