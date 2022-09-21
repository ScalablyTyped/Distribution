package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoluntaryNutritionFact extends StObject {
  
  /**
    * Daily percentage.
    */
  var dailyPercentage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value.
    */
  var value: js.UndefOr[SchemaFloatUnit] = js.undefined
}
object SchemaVoluntaryNutritionFact {
  
  inline def apply(): SchemaVoluntaryNutritionFact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoluntaryNutritionFact]
  }
  
  extension [Self <: SchemaVoluntaryNutritionFact](x: Self) {
    
    inline def setDailyPercentage(value: Double): Self = StObject.set(x, "dailyPercentage", value.asInstanceOf[js.Any])
    
    inline def setDailyPercentageNull: Self = StObject.set(x, "dailyPercentage", null)
    
    inline def setDailyPercentageUndefined: Self = StObject.set(x, "dailyPercentage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: SchemaFloatUnit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
