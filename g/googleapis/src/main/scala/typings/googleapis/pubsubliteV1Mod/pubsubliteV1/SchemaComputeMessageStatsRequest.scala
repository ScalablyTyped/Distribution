package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeMessageStatsRequest extends StObject {
  
  /**
    * The exclusive end of the range. The range is empty if end_cursor <= start_cursor. Specifying a start_cursor before the first message and an end_cursor after the last message will retrieve all messages.
    */
  var endCursor: js.UndefOr[SchemaCursor] = js.undefined
  
  /**
    * Required. The partition for which we should compute message stats.
    */
  var partition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The inclusive start of the range.
    */
  var startCursor: js.UndefOr[SchemaCursor] = js.undefined
}
object SchemaComputeMessageStatsRequest {
  
  inline def apply(): SchemaComputeMessageStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeMessageStatsRequest]
  }
  
  extension [Self <: SchemaComputeMessageStatsRequest](x: Self) {
    
    inline def setEndCursor(value: SchemaCursor): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setStartCursor(value: SchemaCursor): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
