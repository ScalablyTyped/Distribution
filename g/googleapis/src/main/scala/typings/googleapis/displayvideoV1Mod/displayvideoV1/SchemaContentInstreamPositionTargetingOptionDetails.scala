package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentInstreamPositionTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content instream position.
    */
  var contentInstreamPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentInstreamPositionTargetingOptionDetails {
  
  inline def apply(): SchemaContentInstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentInstreamPositionTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentInstreamPositionTargetingOptionDetails](x: Self) {
    
    inline def setContentInstreamPosition(value: String): Self = StObject.set(x, "contentInstreamPosition", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionNull: Self = StObject.set(x, "contentInstreamPosition", null)
    
    inline def setContentInstreamPositionUndefined: Self = StObject.set(x, "contentInstreamPosition", js.undefined)
  }
}
