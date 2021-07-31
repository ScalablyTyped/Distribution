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
  
  @scala.inline
  def apply(): ApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksListResponse]
  }
  
  @scala.inline
  implicit class ApksListResponseMutableBuilder[Self <: ApksListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApks(value: js.Array[Apk]): Self = StObject.set(x, "apks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApksUndefined: Self = StObject.set(x, "apks", js.undefined)
    
    @scala.inline
    def setApksVarargs(value: Apk*): Self = StObject.set(x, "apks", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
