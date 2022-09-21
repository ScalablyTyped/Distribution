package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlistsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the CertificateRevocationList to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlistsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlistsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlistsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCertificateauthoritiesCertificaterevocationlistsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
