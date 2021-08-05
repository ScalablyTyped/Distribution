package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListSnapshots` method.
  */
trait SchemaListSnapshotsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more snapshot that match the
    * request; this value should be passed in a new `ListSnapshotsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The resulting snapshots.
    */
  var snapshots: js.UndefOr[js.Array[SchemaSnapshot]] = js.undefined
}
object SchemaListSnapshotsResponse {
  
  inline def apply(): SchemaListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSnapshotsResponse]
  }
  
  extension [Self <: SchemaListSnapshotsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSnapshots(value: js.Array[SchemaSnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SchemaSnapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
