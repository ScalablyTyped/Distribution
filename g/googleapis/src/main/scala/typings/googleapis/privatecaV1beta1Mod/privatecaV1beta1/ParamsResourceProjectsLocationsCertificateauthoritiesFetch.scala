package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificateauthoritiesFetch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCertificateauthoritiesFetch {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificateauthoritiesFetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificateauthoritiesFetch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificateauthoritiesFetch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
