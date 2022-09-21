package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettlementTransactionAmountCommission extends StObject {
  
  /**
    * The category of the commission. Acceptable values are: - "`animalsAndPetSupplies`" - "`dogCatFoodAndCatLitter`" - "`apparelAndAccessories`" - "`shoesHandbagsAndSunglasses`" - "`costumesAndAccessories`" - "`jewelry`" - "`watches`" - "`hobbiesArtsAndCrafts`" - "`homeAndGarden`" - "`entertainmentCollectibles`" - "`collectibleCoins`" - "`sportsCollectibles`" - "`sportingGoods`" - "`toysAndGames`" - "`musicalInstruments`" - "`giftCards`" - "`babyAndToddler`" - "`babyFoodWipesAndDiapers`" - "`businessAndIndustrial`" - "`camerasOpticsAndPhotography`" - "`consumerElectronics`" - "`electronicsAccessories`" - "`personalComputers`" - "`videoGameConsoles`" - "`foodAndGrocery`" - "`beverages`" - "`tobaccoProducts`" - "`furniture`" - "`hardware`" - "`buildingMaterials`" - "`tools`" - "`healthAndPersonalCare`" - "`beauty`" - "`householdSupplies`" - "`kitchenAndDining`" - "`majorAppliances`" - "`luggageAndBags`" - "`media`" - "`officeSupplies`" - "`softwareAndVideoGames`" - "`vehiclePartsAndAccessories`" - "`vehicleTiresAndWheels`" - "`vehicles`" - "`everythingElse`"
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate of the commission in percentage.
    */
  var rate: js.UndefOr[String | Null] = js.undefined
}
object SchemaSettlementTransactionAmountCommission {
  
  inline def apply(): SchemaSettlementTransactionAmountCommission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettlementTransactionAmountCommission]
  }
  
  extension [Self <: SchemaSettlementTransactionAmountCommission](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateNull: Self = StObject.set(x, "rate", null)
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
