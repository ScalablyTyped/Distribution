package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedSplitApk extends StObject {
  
  /** Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method. */
  var downloadId: js.UndefOr[String] = js.undefined
  
  /** Name of the module that this APK belongs to. */
  var moduleName: js.UndefOr[String] = js.undefined
  
  /** Split ID. Empty for the main split of the base module. */
  var splitId: js.UndefOr[String] = js.undefined
  
  /** ID of the generated variant. */
  var variantId: js.UndefOr[Double] = js.undefined
}
object GeneratedSplitApk {
  
  inline def apply(): GeneratedSplitApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedSplitApk]
  }
  
  extension [Self <: GeneratedSplitApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setSplitId(value: String): Self = StObject.set(x, "splitId", value.asInstanceOf[js.Any])
    
    inline def setSplitIdUndefined: Self = StObject.set(x, "splitId", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
