package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementTransactionAmountCommission extends StObject {
  
  /**
    * The category of the commission. Acceptable values are: - "`animalsAndPetSupplies`" - "`dogCatFoodAndCatLitter`" - "`apparelAndAccessories`" - "`shoesHandbagsAndSunglasses`" -
    * "`costumesAndAccessories`" - "`jewelry`" - "`watches`" - "`hobbiesArtsAndCrafts`" - "`homeAndGarden`" - "`entertainmentCollectibles`" - "`collectibleCoins`" - "`sportsCollectibles`"
    * - "`sportingGoods`" - "`toysAndGames`" - "`musicalInstruments`" - "`giftCards`" - "`babyAndToddler`" - "`babyFoodWipesAndDiapers`" - "`businessAndIndustrial`" -
    * "`camerasOpticsAndPhotography`" - "`consumerElectronics`" - "`electronicsAccessories`" - "`personalComputers`" - "`videoGameConsoles`" - "`foodAndGrocery`" - "`beverages`" -
    * "`tobaccoProducts`" - "`furniture`" - "`hardware`" - "`buildingMaterials`" - "`tools`" - "`healthAndPersonalCare`" - "`beauty`" - "`householdSupplies`" - "`kitchenAndDining`" -
    * "`majorAppliances`" - "`luggageAndBags`" - "`media`" - "`officeSupplies`" - "`softwareAndVideoGames`" - "`vehiclePartsAndAccessories`" - "`vehicleTiresAndWheels`" - "`vehicles`" -
    * "`everythingElse`"
    */
  var category: js.UndefOr[String] = js.undefined
  
  /** Rate of the commission in percentage. */
  var rate: js.UndefOr[String] = js.undefined
}
object SettlementTransactionAmountCommission {
  
  inline def apply(): SettlementTransactionAmountCommission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionAmountCommission]
  }
  
  extension [Self <: SettlementTransactionAmountCommission](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
