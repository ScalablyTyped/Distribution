package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTopicSnapshotsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more snapshots that match the request; this value should be passed in a new `ListTopicSnapshotsRequest` to get more snapshots.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The names of the snapshots that match the request.
    */
  var snapshots: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListTopicSnapshotsResponse {
  
  inline def apply(): SchemaListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicSnapshotsResponse]
  }
  
  extension [Self <: SchemaListTopicSnapshotsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSnapshots(value: js.Array[String]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsNull: Self = StObject.set(x, "snapshots", null)
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: String*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
