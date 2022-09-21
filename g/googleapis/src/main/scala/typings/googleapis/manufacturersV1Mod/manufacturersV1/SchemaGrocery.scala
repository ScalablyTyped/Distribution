package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrocery extends StObject {
  
  /**
    * Active ingredients.
    */
  var activeIngredients: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Alcohol by volume.
    */
  var alcoholByVolume: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Allergens.
    */
  var allergens: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Derived nutrition claim.
    */
  var derivedNutritionClaim: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Directions.
    */
  var directions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indications.
    */
  var indications: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ingredients.
    */
  var ingredients: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Nutrition claim.
    */
  var nutritionClaim: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Storage instructions.
    */
  var storageInstructions: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrocery {
  
  inline def apply(): SchemaGrocery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrocery]
  }
  
  extension [Self <: SchemaGrocery](x: Self) {
    
    inline def setActiveIngredients(value: String): Self = StObject.set(x, "activeIngredients", value.asInstanceOf[js.Any])
    
    inline def setActiveIngredientsNull: Self = StObject.set(x, "activeIngredients", null)
    
    inline def setActiveIngredientsUndefined: Self = StObject.set(x, "activeIngredients", js.undefined)
    
    inline def setAlcoholByVolume(value: Double): Self = StObject.set(x, "alcoholByVolume", value.asInstanceOf[js.Any])
    
    inline def setAlcoholByVolumeNull: Self = StObject.set(x, "alcoholByVolume", null)
    
    inline def setAlcoholByVolumeUndefined: Self = StObject.set(x, "alcoholByVolume", js.undefined)
    
    inline def setAllergens(value: String): Self = StObject.set(x, "allergens", value.asInstanceOf[js.Any])
    
    inline def setAllergensNull: Self = StObject.set(x, "allergens", null)
    
    inline def setAllergensUndefined: Self = StObject.set(x, "allergens", js.undefined)
    
    inline def setDerivedNutritionClaim(value: js.Array[String]): Self = StObject.set(x, "derivedNutritionClaim", value.asInstanceOf[js.Any])
    
    inline def setDerivedNutritionClaimNull: Self = StObject.set(x, "derivedNutritionClaim", null)
    
    inline def setDerivedNutritionClaimUndefined: Self = StObject.set(x, "derivedNutritionClaim", js.undefined)
    
    inline def setDerivedNutritionClaimVarargs(value: String*): Self = StObject.set(x, "derivedNutritionClaim", js.Array(value*))
    
    inline def setDirections(value: String): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsNull: Self = StObject.set(x, "directions", null)
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setIndications(value: String): Self = StObject.set(x, "indications", value.asInstanceOf[js.Any])
    
    inline def setIndicationsNull: Self = StObject.set(x, "indications", null)
    
    inline def setIndicationsUndefined: Self = StObject.set(x, "indications", js.undefined)
    
    inline def setIngredients(value: String): Self = StObject.set(x, "ingredients", value.asInstanceOf[js.Any])
    
    inline def setIngredientsNull: Self = StObject.set(x, "ingredients", null)
    
    inline def setIngredientsUndefined: Self = StObject.set(x, "ingredients", js.undefined)
    
    inline def setNutritionClaim(value: js.Array[String]): Self = StObject.set(x, "nutritionClaim", value.asInstanceOf[js.Any])
    
    inline def setNutritionClaimNull: Self = StObject.set(x, "nutritionClaim", null)
    
    inline def setNutritionClaimUndefined: Self = StObject.set(x, "nutritionClaim", js.undefined)
    
    inline def setNutritionClaimVarargs(value: String*): Self = StObject.set(x, "nutritionClaim", js.Array(value*))
    
    inline def setStorageInstructions(value: String): Self = StObject.set(x, "storageInstructions", value.asInstanceOf[js.Any])
    
    inline def setStorageInstructionsNull: Self = StObject.set(x, "storageInstructions", null)
    
    inline def setStorageInstructionsUndefined: Self = StObject.set(x, "storageInstructions", js.undefined)
  }
}
