package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadResponse
  extends StObject
     with BaseResponse {
  
  var expires_at: js.UndefOr[Double] = js.undefined
  
  var file_url: js.UndefOr[String] = js.undefined
}
object DownloadResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders): DownloadResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadResponse]
  }
  
  extension [Self <: DownloadResponse](x: Self) {
    
    inline def setExpires_at(value: Double): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atUndefined: Self = StObject.set(x, "expires_at", js.undefined)
    
    inline def setFile_url(value: String): Self = StObject.set(x, "file_url", value.asInstanceOf[js.Any])
    
    inline def setFile_urlUndefined: Self = StObject.set(x, "file_url", js.undefined)
  }
}
