package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHouseholdIncomeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The household income of the audience. Output only in v1. Required in v2.
    */
  var householdIncome: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_HOUSEHOLD_INCOME`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaHouseholdIncomeAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaHouseholdIncomeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHouseholdIncomeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaHouseholdIncomeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeNull: Self = StObject.set(x, "householdIncome", null)
    
    inline def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
