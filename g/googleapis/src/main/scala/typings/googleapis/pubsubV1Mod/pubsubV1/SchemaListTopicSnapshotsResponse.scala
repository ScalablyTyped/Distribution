package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListTopicSnapshots` method.
  */
@js.native
trait SchemaListTopicSnapshotsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more snapshots that match the
    * request; this value should be passed in a new `ListTopicSnapshotsRequest`
    * to get more snapshots.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The names of the snapshots that match the request.
    */
  var snapshots: js.UndefOr[js.Array[String]] = js.native
}
object SchemaListTopicSnapshotsResponse {
  
  @scala.inline
  def apply(): SchemaListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicSnapshotsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTopicSnapshotsResponseMutableBuilder[Self <: SchemaListTopicSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[String]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: String*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
