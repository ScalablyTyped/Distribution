package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardSqlTableType extends StObject {
  
  /** The columns in this table type */
  var columns: js.UndefOr[js.Array[StandardSqlField]] = js.undefined
}
object StandardSqlTableType {
  
  inline def apply(): StandardSqlTableType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlTableType]
  }
  
  extension [Self <: StandardSqlTableType](x: Self) {
    
    inline def setColumns(value: js.Array[StandardSqlField]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: StandardSqlField*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
