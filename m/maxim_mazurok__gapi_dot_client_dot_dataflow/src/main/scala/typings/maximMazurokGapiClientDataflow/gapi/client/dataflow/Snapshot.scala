package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends js.Object {
  
  /** The time this snapshot was created. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** User specified description of the snapshot. Maybe empty. */
  var description: js.UndefOr[String] = js.native
  
  /** The disk byte size of the snapshot. Only available for snapshots in READY state. */
  var diskSizeBytes: js.UndefOr[String] = js.native
  
  /** The unique ID of this snapshot. */
  var id: js.UndefOr[String] = js.native
  
  /** The project this snapshot belongs to. */
  var projectId: js.UndefOr[String] = js.native
  
  /** PubSub snapshot metadata. */
  var pubsubMetadata: js.UndefOr[js.Array[PubsubSnapshotMetadata]] = js.native
  
  /** The job this snapshot was created from. */
  var sourceJobId: js.UndefOr[String] = js.native
  
  /** State of the snapshot. */
  var state: js.UndefOr[String] = js.native
  
  /** The time after which this snapshot will be automatically deleted. */
  var ttl: js.UndefOr[String] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiskSizeBytes(value: String): Self = this.set("diskSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeBytes: Self = this.set("diskSizeBytes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setPubsubMetadataVarargs(value: PubsubSnapshotMetadata*): Self = this.set("pubsubMetadata", js.Array(value :_*))
    
    @scala.inline
    def setPubsubMetadata(value: js.Array[PubsubSnapshotMetadata]): Self = this.set("pubsubMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubMetadata: Self = this.set("pubsubMetadata", js.undefined)
    
    @scala.inline
    def setSourceJobId(value: String): Self = this.set("sourceJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceJobId: Self = this.set("sourceJobId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
