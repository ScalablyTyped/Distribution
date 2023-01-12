package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotJobRequest extends StObject {
  
  /** User specified description of the snapshot. Maybe empty. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The location that contains this job. */
  var location: js.UndefOr[String] = js.undefined
  
  /** If true, perform snapshots for sources which support this. */
  var snapshotSources: js.UndefOr[Boolean] = js.undefined
  
  /** TTL for the snapshot. */
  var ttl: js.UndefOr[String] = js.undefined
}
object SnapshotJobRequest {
  
  inline def apply(): SnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSnapshotSources(value: Boolean): Self = StObject.set(x, "snapshotSources", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSourcesUndefined: Self = StObject.set(x, "snapshotSources", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
