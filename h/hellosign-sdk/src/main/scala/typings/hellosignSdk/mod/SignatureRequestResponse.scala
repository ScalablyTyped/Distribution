package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureRequestResponse
  extends StObject
     with BaseResponse {
  
  var signature_request: SignatureRequest[StringDictionary[Any]]
}
object SignatureRequestResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders, signature_request: SignatureRequest[StringDictionary[Any]]): SignatureRequestResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any], signature_request = signature_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureRequestResponse]
  }
  
  extension [Self <: SignatureRequestResponse](x: Self) {
    
    inline def setSignature_request(value: SignatureRequest[StringDictionary[Any]]): Self = StObject.set(x, "signature_request", value.asInstanceOf[js.Any])
  }
}
