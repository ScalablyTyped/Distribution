package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeekRequest extends StObject {
  
  /**
    * The snapshot to seek to. The snapshot's topic must be the same as that of the provided subscription. Format is `projects/{project\}/snapshots/{snap\}`.
    */
  var snapshot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time to seek to. Messages retained in the subscription that were published before this time are marked as acknowledged, and messages retained in the subscription that were published after this time are marked as unacknowledged. Note that this operation affects only those messages retained in the subscription (configured by the combination of `message_retention_duration` and `retain_acked_messages`). For example, if `time` corresponds to a point before the message retention window (or to a point before the system's notion of the subscription creation time), only retained messages will be marked as unacknowledged, and already-expunged messages will not be restored.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaSeekRequest {
  
  inline def apply(): SchemaSeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeekRequest]
  }
  
  extension [Self <: SchemaSeekRequest](x: Self) {
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
