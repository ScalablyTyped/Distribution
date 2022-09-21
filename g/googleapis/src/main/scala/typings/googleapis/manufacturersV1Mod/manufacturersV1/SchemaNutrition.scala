package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNutrition extends StObject {
  
  /**
    * Added sugars.
    */
  var addedSugars: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Added sugars daily percentage.
    */
  var addedSugarsDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Calcium.
    */
  var calcium: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Calcium daily percentage.
    */
  var calciumDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Cholesterol.
    */
  var cholesterol: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Cholesterol daily percentage.
    */
  var cholesterolDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Dietary fiber.
    */
  var dietaryFiber: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Dietary fiber daily percentage.
    */
  var dietaryFiberDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Mandatory Nutrition Facts. Energy.
    */
  var energy: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Energy from fat.
    */
  var energyFromFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Folate daily percentage.
    */
  var folateDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Folate folic acid.
    */
  var folateFolicAcid: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Folate mcg DFE.
    */
  var folateMcgDfe: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Iron.
    */
  var iron: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Iron daily percentage.
    */
  var ironDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Monounsaturated fat.
    */
  var monounsaturatedFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Nutrition fact measure.
    */
  var nutritionFactMeasure: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Polyols.
    */
  var polyols: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Polyunsaturated fat.
    */
  var polyunsaturatedFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Potassium.
    */
  var potassium: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Potassium daily percentage.
    */
  var potassiumDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Prepared size description.
    */
  var preparedSizeDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Protein.
    */
  var protein: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Protein daily percentage.
    */
  var proteinDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Saturated fat.
    */
  var saturatedFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Saturated fat daily percentage.
    */
  var saturatedFatDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Food Serving Size. Serving size description.
    */
  var servingSizeDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serving size measure.
    */
  var servingSizeMeasure: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Servings per container.
    */
  var servingsPerContainer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sodium.
    */
  var sodium: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Sodium daily percentage.
    */
  var sodiumDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Starch.
    */
  var starch: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Total carbohydrate.
    */
  var totalCarbohydrate: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Total carbohydrate daily percentage.
    */
  var totalCarbohydrateDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total fat.
    */
  var totalFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Total fat daily percentage.
    */
  var totalFatDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total sugars.
    */
  var totalSugars: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Total sugars daily percentage.
    */
  var totalSugarsDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Trans fat.
    */
  var transFat: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Trans fat daily percentage.
    */
  var transFatDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Vitamin D.
    */
  var vitaminD: js.UndefOr[SchemaFloatUnit] = js.undefined
  
  /**
    * Vitamin D daily percentage.
    */
  var vitaminDDailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Voluntary nutrition fact.
    */
  var voluntaryNutritionFact: js.UndefOr[js.Array[SchemaVoluntaryNutritionFact]] = js.undefined
}
object SchemaNutrition {
  
  inline def apply(): SchemaNutrition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNutrition]
  }
  
  extension [Self <: SchemaNutrition](x: Self) {
    
    inline def setAddedSugars(value: SchemaFloatUnit): Self = StObject.set(x, "addedSugars", value.asInstanceOf[js.Any])
    
    inline def setAddedSugarsDailyPercentage(value: Double): Self = StObject.set(x, "addedSugarsDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setAddedSugarsDailyPercentageNull: Self = StObject.set(x, "addedSugarsDailyPercentage", null)
    
    inline def setAddedSugarsDailyPercentageUndefined: Self = StObject.set(x, "addedSugarsDailyPercentage", js.undefined)
    
    inline def setAddedSugarsUndefined: Self = StObject.set(x, "addedSugars", js.undefined)
    
    inline def setCalcium(value: SchemaFloatUnit): Self = StObject.set(x, "calcium", value.asInstanceOf[js.Any])
    
    inline def setCalciumDailyPercentage(value: Double): Self = StObject.set(x, "calciumDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setCalciumDailyPercentageNull: Self = StObject.set(x, "calciumDailyPercentage", null)
    
    inline def setCalciumDailyPercentageUndefined: Self = StObject.set(x, "calciumDailyPercentage", js.undefined)
    
    inline def setCalciumUndefined: Self = StObject.set(x, "calcium", js.undefined)
    
    inline def setCholesterol(value: SchemaFloatUnit): Self = StObject.set(x, "cholesterol", value.asInstanceOf[js.Any])
    
    inline def setCholesterolDailyPercentage(value: Double): Self = StObject.set(x, "cholesterolDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setCholesterolDailyPercentageNull: Self = StObject.set(x, "cholesterolDailyPercentage", null)
    
    inline def setCholesterolDailyPercentageUndefined: Self = StObject.set(x, "cholesterolDailyPercentage", js.undefined)
    
    inline def setCholesterolUndefined: Self = StObject.set(x, "cholesterol", js.undefined)
    
    inline def setDietaryFiber(value: SchemaFloatUnit): Self = StObject.set(x, "dietaryFiber", value.asInstanceOf[js.Any])
    
    inline def setDietaryFiberDailyPercentage(value: Double): Self = StObject.set(x, "dietaryFiberDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setDietaryFiberDailyPercentageNull: Self = StObject.set(x, "dietaryFiberDailyPercentage", null)
    
    inline def setDietaryFiberDailyPercentageUndefined: Self = StObject.set(x, "dietaryFiberDailyPercentage", js.undefined)
    
    inline def setDietaryFiberUndefined: Self = StObject.set(x, "dietaryFiber", js.undefined)
    
    inline def setEnergy(value: SchemaFloatUnit): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyFromFat(value: SchemaFloatUnit): Self = StObject.set(x, "energyFromFat", value.asInstanceOf[js.Any])
    
    inline def setEnergyFromFatUndefined: Self = StObject.set(x, "energyFromFat", js.undefined)
    
    inline def setEnergyUndefined: Self = StObject.set(x, "energy", js.undefined)
    
    inline def setFolateDailyPercentage(value: Double): Self = StObject.set(x, "folateDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setFolateDailyPercentageNull: Self = StObject.set(x, "folateDailyPercentage", null)
    
    inline def setFolateDailyPercentageUndefined: Self = StObject.set(x, "folateDailyPercentage", js.undefined)
    
    inline def setFolateFolicAcid(value: SchemaFloatUnit): Self = StObject.set(x, "folateFolicAcid", value.asInstanceOf[js.Any])
    
    inline def setFolateFolicAcidUndefined: Self = StObject.set(x, "folateFolicAcid", js.undefined)
    
    inline def setFolateMcgDfe(value: Double): Self = StObject.set(x, "folateMcgDfe", value.asInstanceOf[js.Any])
    
    inline def setFolateMcgDfeNull: Self = StObject.set(x, "folateMcgDfe", null)
    
    inline def setFolateMcgDfeUndefined: Self = StObject.set(x, "folateMcgDfe", js.undefined)
    
    inline def setIron(value: SchemaFloatUnit): Self = StObject.set(x, "iron", value.asInstanceOf[js.Any])
    
    inline def setIronDailyPercentage(value: Double): Self = StObject.set(x, "ironDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setIronDailyPercentageNull: Self = StObject.set(x, "ironDailyPercentage", null)
    
    inline def setIronDailyPercentageUndefined: Self = StObject.set(x, "ironDailyPercentage", js.undefined)
    
    inline def setIronUndefined: Self = StObject.set(x, "iron", js.undefined)
    
    inline def setMonounsaturatedFat(value: SchemaFloatUnit): Self = StObject.set(x, "monounsaturatedFat", value.asInstanceOf[js.Any])
    
    inline def setMonounsaturatedFatUndefined: Self = StObject.set(x, "monounsaturatedFat", js.undefined)
    
    inline def setNutritionFactMeasure(value: String): Self = StObject.set(x, "nutritionFactMeasure", value.asInstanceOf[js.Any])
    
    inline def setNutritionFactMeasureNull: Self = StObject.set(x, "nutritionFactMeasure", null)
    
    inline def setNutritionFactMeasureUndefined: Self = StObject.set(x, "nutritionFactMeasure", js.undefined)
    
    inline def setPolyols(value: SchemaFloatUnit): Self = StObject.set(x, "polyols", value.asInstanceOf[js.Any])
    
    inline def setPolyolsUndefined: Self = StObject.set(x, "polyols", js.undefined)
    
    inline def setPolyunsaturatedFat(value: SchemaFloatUnit): Self = StObject.set(x, "polyunsaturatedFat", value.asInstanceOf[js.Any])
    
    inline def setPolyunsaturatedFatUndefined: Self = StObject.set(x, "polyunsaturatedFat", js.undefined)
    
    inline def setPotassium(value: SchemaFloatUnit): Self = StObject.set(x, "potassium", value.asInstanceOf[js.Any])
    
    inline def setPotassiumDailyPercentage(value: Double): Self = StObject.set(x, "potassiumDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setPotassiumDailyPercentageNull: Self = StObject.set(x, "potassiumDailyPercentage", null)
    
    inline def setPotassiumDailyPercentageUndefined: Self = StObject.set(x, "potassiumDailyPercentage", js.undefined)
    
    inline def setPotassiumUndefined: Self = StObject.set(x, "potassium", js.undefined)
    
    inline def setPreparedSizeDescription(value: String): Self = StObject.set(x, "preparedSizeDescription", value.asInstanceOf[js.Any])
    
    inline def setPreparedSizeDescriptionNull: Self = StObject.set(x, "preparedSizeDescription", null)
    
    inline def setPreparedSizeDescriptionUndefined: Self = StObject.set(x, "preparedSizeDescription", js.undefined)
    
    inline def setProtein(value: SchemaFloatUnit): Self = StObject.set(x, "protein", value.asInstanceOf[js.Any])
    
    inline def setProteinDailyPercentage(value: Double): Self = StObject.set(x, "proteinDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setProteinDailyPercentageNull: Self = StObject.set(x, "proteinDailyPercentage", null)
    
    inline def setProteinDailyPercentageUndefined: Self = StObject.set(x, "proteinDailyPercentage", js.undefined)
    
    inline def setProteinUndefined: Self = StObject.set(x, "protein", js.undefined)
    
    inline def setSaturatedFat(value: SchemaFloatUnit): Self = StObject.set(x, "saturatedFat", value.asInstanceOf[js.Any])
    
    inline def setSaturatedFatDailyPercentage(value: Double): Self = StObject.set(x, "saturatedFatDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setSaturatedFatDailyPercentageNull: Self = StObject.set(x, "saturatedFatDailyPercentage", null)
    
    inline def setSaturatedFatDailyPercentageUndefined: Self = StObject.set(x, "saturatedFatDailyPercentage", js.undefined)
    
    inline def setSaturatedFatUndefined: Self = StObject.set(x, "saturatedFat", js.undefined)
    
    inline def setServingSizeDescription(value: String): Self = StObject.set(x, "servingSizeDescription", value.asInstanceOf[js.Any])
    
    inline def setServingSizeDescriptionNull: Self = StObject.set(x, "servingSizeDescription", null)
    
    inline def setServingSizeDescriptionUndefined: Self = StObject.set(x, "servingSizeDescription", js.undefined)
    
    inline def setServingSizeMeasure(value: SchemaFloatUnit): Self = StObject.set(x, "servingSizeMeasure", value.asInstanceOf[js.Any])
    
    inline def setServingSizeMeasureUndefined: Self = StObject.set(x, "servingSizeMeasure", js.undefined)
    
    inline def setServingsPerContainer(value: String): Self = StObject.set(x, "servingsPerContainer", value.asInstanceOf[js.Any])
    
    inline def setServingsPerContainerNull: Self = StObject.set(x, "servingsPerContainer", null)
    
    inline def setServingsPerContainerUndefined: Self = StObject.set(x, "servingsPerContainer", js.undefined)
    
    inline def setSodium(value: SchemaFloatUnit): Self = StObject.set(x, "sodium", value.asInstanceOf[js.Any])
    
    inline def setSodiumDailyPercentage(value: Double): Self = StObject.set(x, "sodiumDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setSodiumDailyPercentageNull: Self = StObject.set(x, "sodiumDailyPercentage", null)
    
    inline def setSodiumDailyPercentageUndefined: Self = StObject.set(x, "sodiumDailyPercentage", js.undefined)
    
    inline def setSodiumUndefined: Self = StObject.set(x, "sodium", js.undefined)
    
    inline def setStarch(value: SchemaFloatUnit): Self = StObject.set(x, "starch", value.asInstanceOf[js.Any])
    
    inline def setStarchUndefined: Self = StObject.set(x, "starch", js.undefined)
    
    inline def setTotalCarbohydrate(value: SchemaFloatUnit): Self = StObject.set(x, "totalCarbohydrate", value.asInstanceOf[js.Any])
    
    inline def setTotalCarbohydrateDailyPercentage(value: Double): Self = StObject.set(x, "totalCarbohydrateDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setTotalCarbohydrateDailyPercentageNull: Self = StObject.set(x, "totalCarbohydrateDailyPercentage", null)
    
    inline def setTotalCarbohydrateDailyPercentageUndefined: Self = StObject.set(x, "totalCarbohydrateDailyPercentage", js.undefined)
    
    inline def setTotalCarbohydrateUndefined: Self = StObject.set(x, "totalCarbohydrate", js.undefined)
    
    inline def setTotalFat(value: SchemaFloatUnit): Self = StObject.set(x, "totalFat", value.asInstanceOf[js.Any])
    
    inline def setTotalFatDailyPercentage(value: Double): Self = StObject.set(x, "totalFatDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setTotalFatDailyPercentageNull: Self = StObject.set(x, "totalFatDailyPercentage", null)
    
    inline def setTotalFatDailyPercentageUndefined: Self = StObject.set(x, "totalFatDailyPercentage", js.undefined)
    
    inline def setTotalFatUndefined: Self = StObject.set(x, "totalFat", js.undefined)
    
    inline def setTotalSugars(value: SchemaFloatUnit): Self = StObject.set(x, "totalSugars", value.asInstanceOf[js.Any])
    
    inline def setTotalSugarsDailyPercentage(value: Double): Self = StObject.set(x, "totalSugarsDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setTotalSugarsDailyPercentageNull: Self = StObject.set(x, "totalSugarsDailyPercentage", null)
    
    inline def setTotalSugarsDailyPercentageUndefined: Self = StObject.set(x, "totalSugarsDailyPercentage", js.undefined)
    
    inline def setTotalSugarsUndefined: Self = StObject.set(x, "totalSugars", js.undefined)
    
    inline def setTransFat(value: SchemaFloatUnit): Self = StObject.set(x, "transFat", value.asInstanceOf[js.Any])
    
    inline def setTransFatDailyPercentage(value: Double): Self = StObject.set(x, "transFatDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setTransFatDailyPercentageNull: Self = StObject.set(x, "transFatDailyPercentage", null)
    
    inline def setTransFatDailyPercentageUndefined: Self = StObject.set(x, "transFatDailyPercentage", js.undefined)
    
    inline def setTransFatUndefined: Self = StObject.set(x, "transFat", js.undefined)
    
    inline def setVitaminD(value: SchemaFloatUnit): Self = StObject.set(x, "vitaminD", value.asInstanceOf[js.Any])
    
    inline def setVitaminDDailyPercentage(value: Double): Self = StObject.set(x, "vitaminDDailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setVitaminDDailyPercentageNull: Self = StObject.set(x, "vitaminDDailyPercentage", null)
    
    inline def setVitaminDDailyPercentageUndefined: Self = StObject.set(x, "vitaminDDailyPercentage", js.undefined)
    
    inline def setVitaminDUndefined: Self = StObject.set(x, "vitaminD", js.undefined)
    
    inline def setVoluntaryNutritionFact(value: js.Array[SchemaVoluntaryNutritionFact]): Self = StObject.set(x, "voluntaryNutritionFact", value.asInstanceOf[js.Any])
    
    inline def setVoluntaryNutritionFactUndefined: Self = StObject.set(x, "voluntaryNutritionFact", js.undefined)
    
    inline def setVoluntaryNutritionFactVarargs(value: SchemaVoluntaryNutritionFact*): Self = StObject.set(x, "voluntaryNutritionFact", js.Array(value*))
  }
}
