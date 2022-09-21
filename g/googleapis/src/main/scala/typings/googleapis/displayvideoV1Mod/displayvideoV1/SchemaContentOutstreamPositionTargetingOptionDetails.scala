package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentOutstreamPositionTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content outstream position.
    */
  var contentOutstreamPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentOutstreamPositionTargetingOptionDetails {
  
  inline def apply(): SchemaContentOutstreamPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentOutstreamPositionTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentOutstreamPositionTargetingOptionDetails](x: Self) {
    
    inline def setContentOutstreamPosition(value: String): Self = StObject.set(x, "contentOutstreamPosition", value.asInstanceOf[js.Any])
    
    inline def setContentOutstreamPositionNull: Self = StObject.set(x, "contentOutstreamPosition", null)
    
    inline def setContentOutstreamPositionUndefined: Self = StObject.set(x, "contentOutstreamPosition", js.undefined)
  }
}
