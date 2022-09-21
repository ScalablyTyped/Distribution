package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartitionCursor extends StObject {
  
  /**
    * The value of the cursor.
    */
  var cursor: js.UndefOr[SchemaCursor] = js.undefined
  
  /**
    * The partition this is for.
    */
  var partition: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartitionCursor {
  
  inline def apply(): SchemaPartitionCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionCursor]
  }
  
  extension [Self <: SchemaPartitionCursor](x: Self) {
    
    inline def setCursor(value: SchemaCursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionNull: Self = StObject.set(x, "partition", null)
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
