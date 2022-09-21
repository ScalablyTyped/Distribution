package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubSnapshotMetadata extends StObject {
  
  /**
    * The expire time of the Pubsub snapshot.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Pubsub snapshot.
    */
  var snapshotName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Pubsub topic.
    */
  var topicName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubsubSnapshotMetadata {
  
  inline def apply(): SchemaPubsubSnapshotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubSnapshotMetadata]
  }
  
  extension [Self <: SchemaPubsubSnapshotMetadata](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameNull: Self = StObject.set(x, "snapshotName", null)
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameNull: Self = StObject.set(x, "topicName", null)
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
