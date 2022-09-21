package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBusinessChainAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of a business chain, e.g. "KFC", "Chase Bank".
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The radius of the area around the business chain that will be targeted. The units of the radius are specified by proximity_radius_unit. Must be 1 to 800 if unit is `DISTANCE_UNIT_KILOMETERS` and 1 to 500 if unit is `DISTANCE_UNIT_MILES`. The minimum increment for both cases is 0.1. Inputs will be rounded to the nearest acceptable value if it is too granular, e.g. 15.57 will become 15.6.
    */
  var proximityRadiusAmount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The unit of distance by which the targeting radius is measured.
    */
  var proximityRadiusUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BUSINESS_CHAIN`. Accepted business chain targeting option IDs can be retrieved using SearchTargetingOptions.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBusinessChainAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaBusinessChainAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBusinessChainAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaBusinessChainAssignedTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProximityRadiusAmount(value: Double): Self = StObject.set(x, "proximityRadiusAmount", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusAmountNull: Self = StObject.set(x, "proximityRadiusAmount", null)
    
    inline def setProximityRadiusAmountUndefined: Self = StObject.set(x, "proximityRadiusAmount", js.undefined)
    
    inline def setProximityRadiusUnit(value: String): Self = StObject.set(x, "proximityRadiusUnit", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusUnitNull: Self = StObject.set(x, "proximityRadiusUnit", null)
    
    inline def setProximityRadiusUnitUndefined: Self = StObject.set(x, "proximityRadiusUnit", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
