package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLandmark extends StObject {
  
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
  
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaLandmark {
  
  inline def apply(): SchemaLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLandmark]
  }
  
  extension [Self <: SchemaLandmark](x: Self) {
    
    inline def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
