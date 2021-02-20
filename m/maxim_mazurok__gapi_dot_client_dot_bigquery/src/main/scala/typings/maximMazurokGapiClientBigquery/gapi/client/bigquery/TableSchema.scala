package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSchema extends StObject {
  
  /** Describes the fields in a table. */
  var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.native
}
object TableSchema {
  
  @scala.inline
  def apply(): TableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSchema]
  }
  
  @scala.inline
  implicit class TableSchemaMutableBuilder[Self <: TableSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[TableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: TableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
