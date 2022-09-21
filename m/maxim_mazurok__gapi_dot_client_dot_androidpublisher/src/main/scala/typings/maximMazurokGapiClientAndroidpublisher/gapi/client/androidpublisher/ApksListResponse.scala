package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApksListResponse extends StObject {
  
  /** All APKs. */
  var apks: js.UndefOr[js.Array[Apk]] = js.undefined
  
  /** The kind of this response ("androidpublisher#apksListResponse"). */
  var kind: js.UndefOr[String] = js.undefined
}
object ApksListResponse {
  
  inline def apply(): ApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksListResponse]
  }
  
  extension [Self <: ApksListResponse](x: Self) {
    
    inline def setApks(value: js.Array[Apk]): Self = StObject.set(x, "apks", value.asInstanceOf[js.Any])
    
    inline def setApksUndefined: Self = StObject.set(x, "apks", js.undefined)
    
    inline def setApksVarargs(value: Apk*): Self = StObject.set(x, "apks", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
