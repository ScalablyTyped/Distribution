package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardSqlStructType extends StObject {
  
  var fields: js.UndefOr[js.Array[StandardSqlField]] = js.undefined
}
object StandardSqlStructType {
  
  inline def apply(): StandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlStructType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardSqlStructType] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[StandardSqlField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: StandardSqlField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
