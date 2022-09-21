package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeHeadCursorRequest extends StObject {
  
  /**
    * Required. The partition for which we should compute the head cursor.
    */
  var partition: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputeHeadCursorRequest {
  
  inline def apply(): SchemaComputeHeadCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeHeadCursorRequest]
  }
  
  extension [Self <: SchemaComputeHeadCursorRequest](x: Self) {
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
