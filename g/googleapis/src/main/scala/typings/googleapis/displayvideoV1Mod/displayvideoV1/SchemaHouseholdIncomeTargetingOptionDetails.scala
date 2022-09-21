package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHouseholdIncomeTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The household income of an audience.
    */
  var householdIncome: js.UndefOr[String | Null] = js.undefined
}
object SchemaHouseholdIncomeTargetingOptionDetails {
  
  inline def apply(): SchemaHouseholdIncomeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHouseholdIncomeTargetingOptionDetails]
  }
  
  extension [Self <: SchemaHouseholdIncomeTargetingOptionDetails](x: Self) {
    
    inline def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeNull: Self = StObject.set(x, "householdIncome", null)
    
    inline def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
  }
}
