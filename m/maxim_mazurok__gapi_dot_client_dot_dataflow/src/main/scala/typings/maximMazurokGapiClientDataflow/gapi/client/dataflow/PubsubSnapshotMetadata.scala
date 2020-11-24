package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubSnapshotMetadata extends js.Object {
  
  /** The expire time of the Pubsub snapshot. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** The name of the Pubsub snapshot. */
  var snapshotName: js.UndefOr[String] = js.native
  
  /** The name of the Pubsub topic. */
  var topicName: js.UndefOr[String] = js.native
}
object PubsubSnapshotMetadata {
  
  @scala.inline
  def apply(): PubsubSnapshotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubSnapshotMetadata]
  }
  
  @scala.inline
  implicit class PubsubSnapshotMetadataOps[Self <: PubsubSnapshotMetadata] (val x: Self) extends AnyVal {
    
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = this.set("snapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotName: Self = this.set("snapshotName", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
