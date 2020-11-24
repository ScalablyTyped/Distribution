package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardSqlDataType extends js.Object {
  
  /** The type of the array's elements, if type_kind = "ARRAY". */
  var arrayElementType: js.UndefOr[StandardSqlDataType] = js.native
  
  /** The fields of this struct, in order, if type_kind = "STRUCT". */
  var structType: js.UndefOr[StandardSqlStructType] = js.native
  
  /** Required. The top level type of this field. Can be any standard SQL data type (e.g., "INT64", "DATE", "ARRAY"). */
  var typeKind: js.UndefOr[String] = js.native
}
object StandardSqlDataType {
  
  @scala.inline
  def apply(): StandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlDataType]
  }
  
  @scala.inline
  implicit class StandardSqlDataTypeOps[Self <: StandardSqlDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayElementType(value: StandardSqlDataType): Self = this.set("arrayElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayElementType: Self = this.set("arrayElementType", js.undefined)
    
    @scala.inline
    def setStructType(value: StandardSqlStructType): Self = this.set("structType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructType: Self = this.set("structType", js.undefined)
    
    @scala.inline
    def setTypeKind(value: String): Self = this.set("typeKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeKind: Self = this.set("typeKind", js.undefined)
  }
}
