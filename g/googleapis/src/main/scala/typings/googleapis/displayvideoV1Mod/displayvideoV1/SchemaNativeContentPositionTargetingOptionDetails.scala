package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNativeContentPositionTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content position.
    */
  var contentPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaNativeContentPositionTargetingOptionDetails {
  
  inline def apply(): SchemaNativeContentPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeContentPositionTargetingOptionDetails]
  }
  
  extension [Self <: SchemaNativeContentPositionTargetingOptionDetails](x: Self) {
    
    inline def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    inline def setContentPositionNull: Self = StObject.set(x, "contentPosition", null)
    
    inline def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
  }
}
