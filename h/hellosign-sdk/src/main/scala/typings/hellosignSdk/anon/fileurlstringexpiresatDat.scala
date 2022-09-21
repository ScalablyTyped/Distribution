package typings.hellosignSdk.anon

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  file_url :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse */
trait fileurlstringexpiresatDat extends StObject {
  
  var expires_at: js.Date
  
  var file_url: String
  
  var resHeaders: IncomingHttpHeaders
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
}
object fileurlstringexpiresatDat {
  
  inline def apply(expires_at: js.Date, file_url: String, resHeaders: IncomingHttpHeaders): fileurlstringexpiresatDat = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], file_url = file_url.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileurlstringexpiresatDat]
  }
  
  extension [Self <: fileurlstringexpiresatDat](x: Self) {
    
    inline def setExpires_at(value: js.Date): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setFile_url(value: String): Self = StObject.set(x, "file_url", value.asInstanceOf[js.Any])
    
    inline def setResHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "resHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
