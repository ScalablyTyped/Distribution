package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshot extends StObject {
  
  /**
    * The time this snapshot was created.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User specified description of the snapshot. Maybe empty.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The disk byte size of the snapshot. Only available for snapshots in READY state.
    */
  var diskSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of this snapshot.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project this snapshot belongs to.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pub/Sub snapshot metadata.
    */
  var pubsubMetadata: js.UndefOr[js.Array[SchemaPubsubSnapshotMetadata]] = js.undefined
  
  /**
    * Cloud region where this snapshot lives in, e.g., "us-central1".
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The job this snapshot was created from.
    */
  var sourceJobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the snapshot.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time after which this snapshot will be automatically deleted.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshot {
  
  inline def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  extension [Self <: SchemaSnapshot](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiskSizeBytes(value: String): Self = StObject.set(x, "diskSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeBytesNull: Self = StObject.set(x, "diskSizeBytes", null)
    
    inline def setDiskSizeBytesUndefined: Self = StObject.set(x, "diskSizeBytes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setPubsubMetadata(value: js.Array[SchemaPubsubSnapshotMetadata]): Self = StObject.set(x, "pubsubMetadata", value.asInstanceOf[js.Any])
    
    inline def setPubsubMetadataUndefined: Self = StObject.set(x, "pubsubMetadata", js.undefined)
    
    inline def setPubsubMetadataVarargs(value: SchemaPubsubSnapshotMetadata*): Self = StObject.set(x, "pubsubMetadata", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSourceJobId(value: String): Self = StObject.set(x, "sourceJobId", value.asInstanceOf[js.Any])
    
    inline def setSourceJobIdNull: Self = StObject.set(x, "sourceJobId", null)
    
    inline def setSourceJobIdUndefined: Self = StObject.set(x, "sourceJobId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
