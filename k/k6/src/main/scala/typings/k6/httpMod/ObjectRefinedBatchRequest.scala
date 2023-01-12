package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */]
  extends StObject
     with _RefinedBatchRequest[RT] {
  
  var body: js.UndefOr[RequestBody | Null] = js.undefined
  
  var method: String
  
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  
  var url: String | HttpURL
}
object ObjectRefinedBatchRequest {
  
  inline def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String | HttpURL): ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectRefinedBatchRequest[?], RT /* <: js.UndefOr[ResponseType] */] (val x: Self & ObjectRefinedBatchRequest[RT]) extends AnyVal {
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setUrl(value: String | HttpURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
