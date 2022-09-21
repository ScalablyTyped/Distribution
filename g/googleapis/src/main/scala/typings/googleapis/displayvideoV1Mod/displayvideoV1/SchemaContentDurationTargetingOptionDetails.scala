package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentDurationTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content duration.
    */
  var contentDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentDurationTargetingOptionDetails {
  
  inline def apply(): SchemaContentDurationTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentDurationTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentDurationTargetingOptionDetails](x: Self) {
    
    inline def setContentDuration(value: String): Self = StObject.set(x, "contentDuration", value.asInstanceOf[js.Any])
    
    inline def setContentDurationNull: Self = StObject.set(x, "contentDuration", null)
    
    inline def setContentDurationUndefined: Self = StObject.set(x, "contentDuration", js.undefined)
  }
}
