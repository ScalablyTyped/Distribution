package typings.hlsJs.mod

import typings.std.MediaKeySystemAccess
import typings.std.MediaKeySystemConfiguration
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EMEControllerConfig extends StObject {
  
  var drmSystemOptions: DRMSystemOptions
  
  var drmSystems: DRMSystemsConfiguration
  
  var emeEnabled: Boolean
  
  var licenseResponseCallback: js.UndefOr[
    js.ThisFunction3[
      /* this */ Hls, 
      /* xhr */ XMLHttpRequest, 
      /* url */ String, 
      /* keyContext */ MediaKeySessionContext, 
      js.typedarray.ArrayBuffer
    ]
  ] = js.undefined
  
  var licenseXhrSetup: js.UndefOr[
    js.ThisFunction4[
      /* this */ Hls, 
      /* xhr */ XMLHttpRequest, 
      /* url */ String, 
      /* keyContext */ MediaKeySessionContext, 
      /* licenseChallenge */ js.typedarray.Uint8Array, 
      Unit | js.typedarray.Uint8Array | (js.Promise[js.typedarray.Uint8Array | Unit])
    ]
  ] = js.undefined
  
  var requestMediaKeySystemAccessFunc: MediaKeyFunc | Null
  
  var widevineLicenseUrl: js.UndefOr[String] = js.undefined
}
object EMEControllerConfig {
  
  inline def apply(drmSystemOptions: DRMSystemOptions, drmSystems: DRMSystemsConfiguration, emeEnabled: Boolean): EMEControllerConfig = {
    val __obj = js.Dynamic.literal(drmSystemOptions = drmSystemOptions.asInstanceOf[js.Any], drmSystems = drmSystems.asInstanceOf[js.Any], emeEnabled = emeEnabled.asInstanceOf[js.Any], requestMediaKeySystemAccessFunc = null)
    __obj.asInstanceOf[EMEControllerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EMEControllerConfig] (val x: Self) extends AnyVal {
    
    inline def setDrmSystemOptions(value: DRMSystemOptions): Self = StObject.set(x, "drmSystemOptions", value.asInstanceOf[js.Any])
    
    inline def setDrmSystems(value: DRMSystemsConfiguration): Self = StObject.set(x, "drmSystems", value.asInstanceOf[js.Any])
    
    inline def setEmeEnabled(value: Boolean): Self = StObject.set(x, "emeEnabled", value.asInstanceOf[js.Any])
    
    inline def setLicenseResponseCallback(
      value: js.ThisFunction3[
          /* this */ Hls, 
          /* xhr */ XMLHttpRequest, 
          /* url */ String, 
          /* keyContext */ MediaKeySessionContext, 
          js.typedarray.ArrayBuffer
        ]
    ): Self = StObject.set(x, "licenseResponseCallback", value.asInstanceOf[js.Any])
    
    inline def setLicenseResponseCallbackUndefined: Self = StObject.set(x, "licenseResponseCallback", js.undefined)
    
    inline def setLicenseXhrSetup(
      value: js.ThisFunction4[
          /* this */ Hls, 
          /* xhr */ XMLHttpRequest, 
          /* url */ String, 
          /* keyContext */ MediaKeySessionContext, 
          /* licenseChallenge */ js.typedarray.Uint8Array, 
          Unit | js.typedarray.Uint8Array | (js.Promise[js.typedarray.Uint8Array | Unit])
        ]
    ): Self = StObject.set(x, "licenseXhrSetup", value.asInstanceOf[js.Any])
    
    inline def setLicenseXhrSetupUndefined: Self = StObject.set(x, "licenseXhrSetup", js.undefined)
    
    inline def setRequestMediaKeySystemAccessFunc(
      value: (/* keySystem */ KeySystems, /* supportedConfigurations */ js.Array[MediaKeySystemConfiguration]) => js.Promise[MediaKeySystemAccess]
    ): Self = StObject.set(x, "requestMediaKeySystemAccessFunc", js.Any.fromFunction2(value))
    
    inline def setRequestMediaKeySystemAccessFuncNull: Self = StObject.set(x, "requestMediaKeySystemAccessFunc", null)
    
    inline def setWidevineLicenseUrl(value: String): Self = StObject.set(x, "widevineLicenseUrl", value.asInstanceOf[js.Any])
    
    inline def setWidevineLicenseUrlUndefined: Self = StObject.set(x, "widevineLicenseUrl", js.undefined)
  }
}
