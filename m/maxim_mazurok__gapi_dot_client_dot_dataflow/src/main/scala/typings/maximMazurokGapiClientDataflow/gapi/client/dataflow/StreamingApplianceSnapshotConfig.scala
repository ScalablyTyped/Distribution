package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingApplianceSnapshotConfig extends js.Object {
  
  /** Indicates which endpoint is used to import appliance state. */
  var importStateEndpoint: js.UndefOr[String] = js.native
  
  /** If set, indicates the snapshot id for the snapshot being performed. */
  var snapshotId: js.UndefOr[String] = js.native
}
object StreamingApplianceSnapshotConfig {
  
  @scala.inline
  def apply(): StreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingApplianceSnapshotConfig]
  }
  
  @scala.inline
  implicit class StreamingApplianceSnapshotConfigOps[Self <: StreamingApplianceSnapshotConfig] (val x: Self) extends AnyVal {
    
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
    def setImportStateEndpoint(value: String): Self = this.set("importStateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportStateEndpoint: Self = this.set("importStateEndpoint", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
  }
}
