package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeTimeCursorResponse extends StObject {
  
  /**
    * If present, the cursor references the first message with time greater than or equal to the specified target time. If such a message cannot be found, the cursor will be unset (i.e. `cursor` is not present).
    */
  var cursor: js.UndefOr[SchemaCursor] = js.undefined
}
object SchemaComputeTimeCursorResponse {
  
  inline def apply(): SchemaComputeTimeCursorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeTimeCursorResponse]
  }
  
  extension [Self <: SchemaComputeTimeCursorResponse](x: Self) {
    
    inline def setCursor(value: SchemaCursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
  }
}
