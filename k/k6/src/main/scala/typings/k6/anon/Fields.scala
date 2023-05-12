package typings.k6.anon

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
  
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var formSelector: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  
  var submitSelector: js.UndefOr[String] = js.undefined
}
object Fields {
  
  inline def apply[RT /* <: js.UndefOr[ResponseType] */](): Fields[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields[RT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fields[?], RT /* <: js.UndefOr[ResponseType] */] (val x: Self & Fields[RT]) extends AnyVal {
    
    inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFormSelector(value: String): Self = StObject.set(x, "formSelector", value.asInstanceOf[js.Any])
    
    inline def setFormSelectorUndefined: Self = StObject.set(x, "formSelector", js.undefined)
    
    inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setSubmitSelector(value: String): Self = StObject.set(x, "submitSelector", value.asInstanceOf[js.Any])
    
    inline def setSubmitSelectorUndefined: Self = StObject.set(x, "submitSelector", js.undefined)
  }
}
