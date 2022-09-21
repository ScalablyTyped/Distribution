package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateEmbeddedObjectPositionResponse extends StObject {
  
  /**
    * The new position of the embedded object.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.undefined
}
object SchemaUpdateEmbeddedObjectPositionResponse {
  
  inline def apply(): SchemaUpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateEmbeddedObjectPositionResponse]
  }
  
  extension [Self <: SchemaUpdateEmbeddedObjectPositionResponse](x: Self) {
    
    inline def setPosition(value: SchemaEmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
