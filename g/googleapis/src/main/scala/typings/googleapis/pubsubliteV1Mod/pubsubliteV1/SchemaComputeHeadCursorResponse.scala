package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeHeadCursorResponse extends StObject {
  
  /**
    * The head cursor.
    */
  var headCursor: js.UndefOr[SchemaCursor] = js.undefined
}
object SchemaComputeHeadCursorResponse {
  
  inline def apply(): SchemaComputeHeadCursorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeHeadCursorResponse]
  }
  
  extension [Self <: SchemaComputeHeadCursorResponse](x: Self) {
    
    inline def setHeadCursor(value: SchemaCursor): Self = StObject.set(x, "headCursor", value.asInstanceOf[js.Any])
    
    inline def setHeadCursorUndefined: Self = StObject.set(x, "headCursor", js.undefined)
  }
}
