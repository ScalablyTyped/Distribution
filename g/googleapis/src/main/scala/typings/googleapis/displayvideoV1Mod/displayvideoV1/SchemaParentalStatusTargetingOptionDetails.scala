package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParentalStatusTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The parental status of an audience.
    */
  var parentalStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaParentalStatusTargetingOptionDetails {
  
  inline def apply(): SchemaParentalStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParentalStatusTargetingOptionDetails]
  }
  
  extension [Self <: SchemaParentalStatusTargetingOptionDetails](x: Self) {
    
    inline def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusNull: Self = StObject.set(x, "parentalStatus", null)
    
    inline def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
  }
}
