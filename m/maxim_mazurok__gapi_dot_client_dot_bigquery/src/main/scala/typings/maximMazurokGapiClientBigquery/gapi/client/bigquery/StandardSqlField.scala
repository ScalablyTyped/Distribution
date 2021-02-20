package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardSqlField extends StObject {
  
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
  implicit class StandardSqlFieldMutableBuilder[Self <: StandardSqlField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: StandardSqlDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
