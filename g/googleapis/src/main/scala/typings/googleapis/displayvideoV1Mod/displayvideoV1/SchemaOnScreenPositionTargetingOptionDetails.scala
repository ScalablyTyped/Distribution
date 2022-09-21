package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnScreenPositionTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The on screen position.
    */
  var onScreenPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaOnScreenPositionTargetingOptionDetails {
  
  inline def apply(): SchemaOnScreenPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnScreenPositionTargetingOptionDetails]
  }
  
  extension [Self <: SchemaOnScreenPositionTargetingOptionDetails](x: Self) {
    
    inline def setOnScreenPosition(value: String): Self = StObject.set(x, "onScreenPosition", value.asInstanceOf[js.Any])
    
    inline def setOnScreenPositionNull: Self = StObject.set(x, "onScreenPosition", null)
    
    inline def setOnScreenPositionUndefined: Self = StObject.set(x, "onScreenPosition", js.undefined)
  }
}
