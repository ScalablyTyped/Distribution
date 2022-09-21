package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedStandaloneApk extends StObject {
  
  /** Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method. */
  var downloadId: js.UndefOr[String] = js.undefined
  
  /** ID of the generated variant. */
  var variantId: js.UndefOr[Double] = js.undefined
}
object GeneratedStandaloneApk {
  
  inline def apply(): GeneratedStandaloneApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedStandaloneApk]
  }
  
  extension [Self <: GeneratedStandaloneApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
