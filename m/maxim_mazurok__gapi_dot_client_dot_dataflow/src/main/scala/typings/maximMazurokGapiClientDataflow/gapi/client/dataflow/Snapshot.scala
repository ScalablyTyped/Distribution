package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  /** The time this snapshot was created. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** User specified description of the snapshot. Maybe empty. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The disk byte size of the snapshot. Only available for snapshots in READY state. */
  var diskSizeBytes: js.UndefOr[String] = js.undefined
  
  /** The unique ID of this snapshot. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The project this snapshot belongs to. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** PubSub snapshot metadata. */
  var pubsubMetadata: js.UndefOr[js.Array[PubsubSnapshotMetadata]] = js.undefined
  
  /** The job this snapshot was created from. */
  var sourceJobId: js.UndefOr[String] = js.undefined
  
  /** State of the snapshot. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The time after which this snapshot will be automatically deleted. */
  var ttl: js.UndefOr[String] = js.undefined
}
object Snapshot {
  
  inline def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiskSizeBytes(value: String): Self = StObject.set(x, "diskSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeBytesUndefined: Self = StObject.set(x, "diskSizeBytes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setPubsubMetadata(value: js.Array[PubsubSnapshotMetadata]): Self = StObject.set(x, "pubsubMetadata", value.asInstanceOf[js.Any])
    
    inline def setPubsubMetadataUndefined: Self = StObject.set(x, "pubsubMetadata", js.undefined)
    
    inline def setPubsubMetadataVarargs(value: PubsubSnapshotMetadata*): Self = StObject.set(x, "pubsubMetadata", js.Array(value :_*))
    
    inline def setSourceJobId(value: String): Self = StObject.set(x, "sourceJobId", value.asInstanceOf[js.Any])
    
    inline def setSourceJobIdUndefined: Self = StObject.set(x, "sourceJobId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
