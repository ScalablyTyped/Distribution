package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardSqlField extends js.Object {
  
  /** Optional. The name of this field. Can be absent for struct fields. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The type of this parameter. Absent if not explicitly specified (e.g., CREATE FUNCTION statement can omit the return type; in this case the output parameter does not have
    * this "type" field).
    */
  var `type`: js.UndefOr[StandardSqlDataType] = js.native
}
object StandardSqlField {
  
  @scala.inline
  def apply(): StandardSqlField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlField]
  }
  
  @scala.inline
  implicit class StandardSqlFieldOps[Self <: StandardSqlField] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: StandardSqlDataType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
