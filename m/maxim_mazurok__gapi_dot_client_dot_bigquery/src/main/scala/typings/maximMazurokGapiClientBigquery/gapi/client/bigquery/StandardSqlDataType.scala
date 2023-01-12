package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardSqlDataType extends StObject {
  
  /** The type of the array's elements, if type_kind = "ARRAY". */
  var arrayElementType: js.UndefOr[StandardSqlDataType] = js.undefined
  
  /** The fields of this struct, in order, if type_kind = "STRUCT". */
  var structType: js.UndefOr[StandardSqlStructType] = js.undefined
  
  /** Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64", "DATE", "ARRAY"). */
  var typeKind: js.UndefOr[String] = js.undefined
}
object StandardSqlDataType {
  
  inline def apply(): StandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardSqlDataType] (val x: Self) extends AnyVal {
    
    inline def setArrayElementType(value: StandardSqlDataType): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    inline def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    inline def setStructType(value: StandardSqlStructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    inline def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
    
    inline def setTypeKind(value: String): Self = StObject.set(x, "typeKind", value.asInstanceOf[js.Any])
    
    inline def setTypeKindUndefined: Self = StObject.set(x, "typeKind", js.undefined)
  }
}
