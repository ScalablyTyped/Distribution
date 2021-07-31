package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubSnapshotMetadata extends StObject {
  
  /** The expire time of the Pubsub snapshot. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** The name of the Pubsub snapshot. */
  var snapshotName: js.UndefOr[String] = js.undefined
  
  /** The name of the Pubsub topic. */
  var topicName: js.UndefOr[String] = js.undefined
}
object PubsubSnapshotMetadata {
  
  @scala.inline
  def apply(): PubsubSnapshotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubSnapshotMetadata]
  }
  
  @scala.inline
  implicit class PubsubSnapshotMetadataMutableBuilder[Self <: PubsubSnapshotMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
