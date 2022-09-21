package typings.hellosignSdk.anon

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data_uri :string,   expires_at :std.Date} & hellosign-sdk.hellosign-sdk.BaseResponse */
trait datauristringexpiresatDat extends StObject {
  
  var data_uri: String
  
  var expires_at: js.Date
  
  var resHeaders: IncomingHttpHeaders
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
}
object datauristringexpiresatDat {
  
  inline def apply(data_uri: String, expires_at: js.Date, resHeaders: IncomingHttpHeaders): datauristringexpiresatDat = {
    val __obj = js.Dynamic.literal(data_uri = data_uri.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[datauristringexpiresatDat]
  }
  
  extension [Self <: datauristringexpiresatDat](x: Self) {
    
    inline def setData_uri(value: String): Self = StObject.set(x, "data_uri", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: js.Date): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setResHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "resHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
