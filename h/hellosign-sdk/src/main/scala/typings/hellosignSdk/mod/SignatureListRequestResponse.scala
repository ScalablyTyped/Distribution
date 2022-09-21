package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.Numpages
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureListRequestResponse
  extends StObject
     with BaseResponse
     with ListInfo {
  
  var signature_requests: js.Array[SignatureRequest[StringDictionary[Any]]]
}
object SignatureListRequestResponse {
  
  inline def apply(
    list_info: Numpages,
    resHeaders: IncomingHttpHeaders,
    signature_requests: js.Array[SignatureRequest[StringDictionary[Any]]]
  ): SignatureListRequestResponse = {
    val __obj = js.Dynamic.literal(list_info = list_info.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any], signature_requests = signature_requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureListRequestResponse]
  }
  
  extension [Self <: SignatureListRequestResponse](x: Self) {
    
    inline def setSignature_requests(value: js.Array[SignatureRequest[StringDictionary[Any]]]): Self = StObject.set(x, "signature_requests", value.asInstanceOf[js.Any])
    
    inline def setSignature_requestsVarargs(value: SignatureRequest[StringDictionary[Any]]*): Self = StObject.set(x, "signature_requests", js.Array(value*))
  }
}
