package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubExchangeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_SUB_EXCHANGE`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubExchangeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaSubExchangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubExchangeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaSubExchangeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
