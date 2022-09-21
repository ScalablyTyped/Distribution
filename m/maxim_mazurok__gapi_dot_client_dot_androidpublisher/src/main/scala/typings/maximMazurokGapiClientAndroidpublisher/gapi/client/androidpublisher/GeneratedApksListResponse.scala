package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedApksListResponse extends StObject {
  
  /** All generated APKs, grouped by the APK signing key. */
  var generatedApks: js.UndefOr[js.Array[GeneratedApksPerSigningKey]] = js.undefined
}
object GeneratedApksListResponse {
  
  inline def apply(): GeneratedApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedApksListResponse]
  }
  
  extension [Self <: GeneratedApksListResponse](x: Self) {
    
    inline def setGeneratedApks(value: js.Array[GeneratedApksPerSigningKey]): Self = StObject.set(x, "generatedApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedApksUndefined: Self = StObject.set(x, "generatedApks", js.undefined)
    
    inline def setGeneratedApksVarargs(value: GeneratedApksPerSigningKey*): Self = StObject.set(x, "generatedApks", js.Array(value*))
  }
}
