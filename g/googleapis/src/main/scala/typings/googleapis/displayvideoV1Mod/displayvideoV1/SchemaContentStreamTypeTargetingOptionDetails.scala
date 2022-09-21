package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentStreamTypeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The content stream type.
    */
  var contentStreamType: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentStreamTypeTargetingOptionDetails {
  
  inline def apply(): SchemaContentStreamTypeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentStreamTypeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaContentStreamTypeTargetingOptionDetails](x: Self) {
    
    inline def setContentStreamType(value: String): Self = StObject.set(x, "contentStreamType", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeNull: Self = StObject.set(x, "contentStreamType", null)
    
    inline def setContentStreamTypeUndefined: Self = StObject.set(x, "contentStreamType", js.undefined)
  }
}
