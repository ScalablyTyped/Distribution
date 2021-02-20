package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
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
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiskSizeBytes(value: String): Self = StObject.set(x, "diskSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeBytesUndefined: Self = StObject.set(x, "diskSizeBytes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setPubsubMetadata(value: js.Array[PubsubSnapshotMetadata]): Self = StObject.set(x, "pubsubMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubMetadataUndefined: Self = StObject.set(x, "pubsubMetadata", js.undefined)
    
    @scala.inline
    def setPubsubMetadataVarargs(value: PubsubSnapshotMetadata*): Self = StObject.set(x, "pubsubMetadata", js.Array(value :_*))
    
    @scala.inline
    def setSourceJobId(value: String): Self = StObject.set(x, "sourceJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJobIdUndefined: Self = StObject.set(x, "sourceJobId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
