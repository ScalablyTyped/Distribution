package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetChange extends StObject {
  
  /**
    * The error that resulted in this change, if applicable.
    */
  var cause: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The consistent `read_time` for the given `target_ids` (omitted when the target_ids are not at a consistent snapshot). The stream is guaranteed to send a `read_time` with `target_ids` empty whenever the entire stream reaches a new consistent snapshot. ADD, CURRENT, and RESET messages are guaranteed to (eventually) result in a new consistent snapshot (while NO_CHANGE and REMOVE messages are not). For a given stream, `read_time` is guaranteed to be monotonically increasing.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token that can be used to resume the stream for the given `target_ids`, or all targets if `target_ids` is empty. Not set on every target change.
    */
  var resumeToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of change that occurred.
    */
  var targetChangeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target IDs of targets that have changed. If empty, the change applies to all targets. The order of the target IDs is not defined.
    */
  var targetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaTargetChange {
  
  inline def apply(): SchemaTargetChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetChange]
  }
  
  extension [Self <: SchemaTargetChange](x: Self) {
    
    inline def setCause(value: SchemaStatus): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetChangeType(value: String): Self = StObject.set(x, "targetChangeType", value.asInstanceOf[js.Any])
    
    inline def setTargetChangeTypeNull: Self = StObject.set(x, "targetChangeType", null)
    
    inline def setTargetChangeTypeUndefined: Self = StObject.set(x, "targetChangeType", js.undefined)
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsNull: Self = StObject.set(x, "targetIds", null)
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
