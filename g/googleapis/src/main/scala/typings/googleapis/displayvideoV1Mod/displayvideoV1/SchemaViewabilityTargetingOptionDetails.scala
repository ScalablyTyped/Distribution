package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViewabilityTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The predicted viewability percentage.
    */
  var viewability: js.UndefOr[String | Null] = js.undefined
}
object SchemaViewabilityTargetingOptionDetails {
  
  inline def apply(): SchemaViewabilityTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViewabilityTargetingOptionDetails]
  }
  
  extension [Self <: SchemaViewabilityTargetingOptionDetails](x: Self) {
    
    inline def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    inline def setViewabilityNull: Self = StObject.set(x, "viewability", null)
    
    inline def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
  }
}
