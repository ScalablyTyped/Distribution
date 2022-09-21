package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitCursorRequest extends StObject {
  
  /**
    * The new value for the committed cursor.
    */
  var cursor: js.UndefOr[SchemaCursor] = js.undefined
  
  /**
    * The partition for which to update the cursor. Partitions are zero indexed, so `partition` must be in the range [0, topic.num_partitions).
    */
  var partition: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommitCursorRequest {
  
  inline def apply(): SchemaCommitCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitCursorRequest]
  }
  
  extension [Self <: SchemaCommitCursorRequest](x: Self) {
    
    inline def setCursor(value: SchemaCursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
