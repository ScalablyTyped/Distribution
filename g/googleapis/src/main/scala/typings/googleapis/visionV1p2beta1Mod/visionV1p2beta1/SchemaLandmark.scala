package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A face-specific landmark (for example, a face feature).
  */
trait SchemaLandmark extends StObject {
  
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
  
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.undefined
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
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
