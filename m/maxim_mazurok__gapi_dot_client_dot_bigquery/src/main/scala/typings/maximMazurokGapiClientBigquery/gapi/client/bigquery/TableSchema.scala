package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSchema extends StObject {
  
  /** Describes the fields in a table. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
}
object TableSchema {
  
  inline def apply(): TableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSchema]
  }
  
  extension [Self <: TableSchema](x: Self) {
    
    inline def setFields(value: js.Array[TableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: TableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
