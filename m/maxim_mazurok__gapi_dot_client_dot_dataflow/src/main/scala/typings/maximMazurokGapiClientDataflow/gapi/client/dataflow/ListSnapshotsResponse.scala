package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotsResponse extends js.Object {
  
  /** Returned snapshots. */
  var snapshots: js.UndefOr[js.Array[Snapshot]] = js.native
}
object ListSnapshotsResponse {
  
  @scala.inline
  def apply(): ListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsResponse]
  }
  
  @scala.inline
  implicit class ListSnapshotsResponseOps[Self <: ListSnapshotsResponse] (val x: Self) extends AnyVal {
    
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
    def setSnapshotsVarargs(value: Snapshot*): Self = this.set("snapshots", js.Array(value :_*))
    
    @scala.inline
    def setSnapshots(value: js.Array[Snapshot]): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshots: Self = this.set("snapshots", js.undefined)
  }
}
