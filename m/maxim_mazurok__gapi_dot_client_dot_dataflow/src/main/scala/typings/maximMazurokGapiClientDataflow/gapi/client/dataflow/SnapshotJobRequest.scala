package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotJobRequest extends js.Object {
  
  /** User specified description of the snapshot. Maybe empty. */
  var description: js.UndefOr[String] = js.native
  
  /** The location that contains this job. */
  var location: js.UndefOr[String] = js.native
  
  /** If true, perform snapshots for sources which support this. */
  var snapshotSources: js.UndefOr[Boolean] = js.native
  
  /** TTL for the snapshot. */
  var ttl: js.UndefOr[String] = js.native
}
object SnapshotJobRequest {
  
  @scala.inline
  def apply(): SnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotJobRequest]
  }
  
  @scala.inline
  implicit class SnapshotJobRequestOps[Self <: SnapshotJobRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSnapshotSources(value: Boolean): Self = this.set("snapshotSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSources: Self = this.set("snapshotSources", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
