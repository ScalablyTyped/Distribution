package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListTopicSnapshots` method.
  */
@js.native
trait SchemaListTopicSnapshotsResponse extends js.Object {
  
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
  implicit class SchemaListTopicSnapshotsResponseOps[Self <: SchemaListTopicSnapshotsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: String*): Self = this.set("snapshots", js.Array(value :_*))
    
    @scala.inline
    def setSnapshots(value: js.Array[String]): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshots: Self = this.set("snapshots", js.undefined)
  }
}
