package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeTimeCursorRequest extends StObject {
  
  /**
    * Required. The partition for which we should compute the cursor.
    */
  var partition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The target publish or event time. Specifying a future time will return an unset cursor.
    */
  var target: js.UndefOr[SchemaTimeTarget] = js.undefined
}
object SchemaComputeTimeCursorRequest {
  
  inline def apply(): SchemaComputeTimeCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeTimeCursorRequest]
  }
  
  extension [Self <: SchemaComputeTimeCursorRequest](x: Self) {
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTarget(value: SchemaTimeTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
