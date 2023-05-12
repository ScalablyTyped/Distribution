package typings.k6.anon

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
  
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
}
object Params {
  
  inline def apply[RT /* <: js.UndefOr[ResponseType] */](): Params[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params[RT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Params[?], RT /* <: js.UndefOr[ResponseType] */] (val x: Self & Params[RT]) extends AnyVal {
    
    inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
