package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */]
  extends StObject
     with Params {
  
  @JSName("responseType")
  var responseType_RefinedParams: js.UndefOr[RT] = js.undefined
}
object RefinedParams {
  
  inline def apply[RT /* <: js.UndefOr[ResponseType] */](): RefinedParams[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefinedParams[RT]]
  }
  
  extension [Self <: RefinedParams[?], RT /* <: js.UndefOr[ResponseType] */](x: Self & RefinedParams[RT]) {
    
    inline def setResponseType(value: RT): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
