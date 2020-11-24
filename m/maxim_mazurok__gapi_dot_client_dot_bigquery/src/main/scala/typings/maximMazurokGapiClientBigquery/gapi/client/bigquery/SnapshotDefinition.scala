package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotDefinition extends js.Object {
  
  /** [Required] Reference describing the ID of the table that is snapshotted. */
  var baseTableReference: js.UndefOr[TableReference] = js.native
  
  /** [Required] The time at which the base table was snapshot. */
  var snapshotTime: js.UndefOr[String] = js.native
}
object SnapshotDefinition {
  
  @scala.inline
  def apply(): SnapshotDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDefinition]
  }
  
  @scala.inline
  implicit class SnapshotDefinitionOps[Self <: SnapshotDefinition] (val x: Self) extends AnyVal {
    
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
    def setBaseTableReference(value: TableReference): Self = this.set("baseTableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseTableReference: Self = this.set("baseTableReference", js.undefined)
    
    @scala.inline
    def setSnapshotTime(value: String): Self = this.set("snapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotTime: Self = this.set("snapshotTime", js.undefined)
  }
}
