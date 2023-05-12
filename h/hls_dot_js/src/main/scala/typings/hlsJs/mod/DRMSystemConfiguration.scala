package typings.hlsJs.mod

import typings.hlsJs.anon.InitData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMSystemConfiguration extends StObject {
  
  var generateRequest: js.UndefOr[
    js.ThisFunction3[
      /* this */ Hls, 
      /* initDataType */ String, 
      /* initData */ js.typedarray.ArrayBuffer | Null, 
      /* keyContext */ MediaKeySessionContext, 
      js.UndefOr[InitData]
    ]
  ] = js.undefined
  
  var licenseUrl: String
  
  var serverCertificateUrl: js.UndefOr[String] = js.undefined
}
object DRMSystemConfiguration {
  
  inline def apply(licenseUrl: String): DRMSystemConfiguration = {
    val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DRMSystemConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DRMSystemConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGenerateRequest(
      value: js.ThisFunction3[
          /* this */ Hls, 
          /* initDataType */ String, 
          /* initData */ js.typedarray.ArrayBuffer | Null, 
          /* keyContext */ MediaKeySessionContext, 
          js.UndefOr[InitData]
        ]
    ): Self = StObject.set(x, "generateRequest", value.asInstanceOf[js.Any])
    
    inline def setGenerateRequestUndefined: Self = StObject.set(x, "generateRequest", js.undefined)
    
    inline def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUrl(value: String): Self = StObject.set(x, "serverCertificateUrl", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUrlUndefined: Self = StObject.set(x, "serverCertificateUrl", js.undefined)
  }
}
