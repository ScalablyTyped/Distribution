package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterType extends StObject {
  
  /** [Optional] The type of the array's elements, if this is an array. */
  var arrayType: js.UndefOr[QueryParameterType] = js.undefined
  
  /** [Optional] The types of the fields of this struct, in order, if this is a struct. */
  var structTypes: js.UndefOr[js.Array[Description]] = js.undefined
  
  /** [Required] The top level type of this field. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryParameterType {
  
  inline def apply(): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterType]
  }
  
  extension [Self <: QueryParameterType](x: Self) {
    
    inline def setArrayType(value: QueryParameterType): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
    
    inline def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
    
    inline def setStructTypes(value: js.Array[Description]): Self = StObject.set(x, "structTypes", value.asInstanceOf[js.Any])
    
    inline def setStructTypesUndefined: Self = StObject.set(x, "structTypes", js.undefined)
    
    inline def setStructTypesVarargs(value: Description*): Self = StObject.set(x, "structTypes", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
