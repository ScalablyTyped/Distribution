package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterValue extends StObject {
  
  /** [Optional] The array values, if this is an array type. */
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
  
  /** [Optional] The struct field values, in order of the struct type's declaration. */
  var structValues: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.bigquery.gapi.client.bigquery.QueryParameterValue}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.QueryParameterValue & TopLevel[Any]
  ] = js.undefined
  
  /** [Optional] The value of this value, if a simple scalar type. */
  var value: js.UndefOr[String] = js.undefined
}
object QueryParameterValue {
  
  inline def apply(): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterValue]
  }
  
  extension [Self <: QueryParameterValue](x: Self) {
    
    inline def setArrayValues(value: js.Array[QueryParameterValue]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    inline def setArrayValuesVarargs(value: QueryParameterValue*): Self = StObject.set(x, "arrayValues", js.Array(value*))
    
    inline def setStructValues(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.bigquery.gapi.client.bigquery.QueryParameterValue}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.QueryParameterValue & TopLevel[Any]
    ): Self = StObject.set(x, "structValues", value.asInstanceOf[js.Any])
    
    inline def setStructValuesUndefined: Self = StObject.set(x, "structValues", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
