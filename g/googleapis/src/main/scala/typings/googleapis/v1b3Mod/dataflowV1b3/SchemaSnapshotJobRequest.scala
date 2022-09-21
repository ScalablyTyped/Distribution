package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshotJobRequest extends StObject {
  
  /**
    * User specified description of the snapshot. Maybe empty.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location that contains this job.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, perform snapshots for sources which support this.
    */
  var snapshotSources: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * TTL for the snapshot.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaSnapshotJobRequest {
  
  inline def apply(): SchemaSnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotJobRequest]
  }
  
  extension [Self <: SchemaSnapshotJobRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSnapshotSources(value: Boolean): Self = StObject.set(x, "snapshotSources", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSourcesNull: Self = StObject.set(x, "snapshotSources", null)
    
    inline def setSnapshotSourcesUndefined: Self = StObject.set(x, "snapshotSources", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
