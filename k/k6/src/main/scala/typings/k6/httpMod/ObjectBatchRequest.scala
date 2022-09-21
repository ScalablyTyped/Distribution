package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectBatchRequest
  extends StObject
     with _BatchRequest {
  
  /** Request body. */
  var body: js.UndefOr[RequestBody | Null] = js.undefined
  
  /** Request method. */
  var method: String
  
  /** Requset parameters. */
  var params: js.UndefOr[Params | Null] = js.undefined
  
  /** Request URL. */
  var url: String | HttpURL
}
object ObjectBatchRequest {
  
  inline def apply(method: String, url: String | HttpURL): ObjectBatchRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectBatchRequest]
  }
  
  extension [Self <: ObjectBatchRequest](x: Self) {
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setUrl(value: String | HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
