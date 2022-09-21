package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedAssetPackSlice extends StObject {
  
  /** Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method. */
  var downloadId: js.UndefOr[String] = js.undefined
  
  /** Name of the module that this asset slice belongs to. */
  var moduleName: js.UndefOr[String] = js.undefined
  
  /** Asset slice ID. */
  var sliceId: js.UndefOr[String] = js.undefined
  
  /** Asset module version. */
  var version: js.UndefOr[String] = js.undefined
}
object GeneratedAssetPackSlice {
  
  inline def apply(): GeneratedAssetPackSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedAssetPackSlice]
  }
  
  extension [Self <: GeneratedAssetPackSlice](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setSliceId(value: String): Self = StObject.set(x, "sliceId", value.asInstanceOf[js.Any])
    
    inline def setSliceIdUndefined: Self = StObject.set(x, "sliceId", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
