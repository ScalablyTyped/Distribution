package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthAndSafety extends StObject {
  
  /**
    * Enhanced cleaning measures implemented by the hotel during COVID-19.
    */
  var enhancedCleaning: js.UndefOr[SchemaEnhancedCleaning] = js.undefined
  
  /**
    * Increased food safety measures implemented by the hotel during COVID-19.
    */
  var increasedFoodSafety: js.UndefOr[SchemaIncreasedFoodSafety] = js.undefined
  
  /**
    * Minimized contact measures implemented by the hotel during COVID-19.
    */
  var minimizedContact: js.UndefOr[SchemaMinimizedContact] = js.undefined
  
  /**
    * Personal protection measures implemented by the hotel during COVID-19.
    */
  var personalProtection: js.UndefOr[SchemaPersonalProtection] = js.undefined
  
  /**
    * Physical distancing measures implemented by the hotel during COVID-19.
    */
  var physicalDistancing: js.UndefOr[SchemaPhysicalDistancing] = js.undefined
}
object SchemaHealthAndSafety {
  
  inline def apply(): SchemaHealthAndSafety = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthAndSafety]
  }
  
  extension [Self <: SchemaHealthAndSafety](x: Self) {
    
    inline def setEnhancedCleaning(value: SchemaEnhancedCleaning): Self = StObject.set(x, "enhancedCleaning", value.asInstanceOf[js.Any])
    
    inline def setEnhancedCleaningUndefined: Self = StObject.set(x, "enhancedCleaning", js.undefined)
    
    inline def setIncreasedFoodSafety(value: SchemaIncreasedFoodSafety): Self = StObject.set(x, "increasedFoodSafety", value.asInstanceOf[js.Any])
    
    inline def setIncreasedFoodSafetyUndefined: Self = StObject.set(x, "increasedFoodSafety", js.undefined)
    
    inline def setMinimizedContact(value: SchemaMinimizedContact): Self = StObject.set(x, "minimizedContact", value.asInstanceOf[js.Any])
    
    inline def setMinimizedContactUndefined: Self = StObject.set(x, "minimizedContact", js.undefined)
    
    inline def setPersonalProtection(value: SchemaPersonalProtection): Self = StObject.set(x, "personalProtection", value.asInstanceOf[js.Any])
    
    inline def setPersonalProtectionUndefined: Self = StObject.set(x, "personalProtection", js.undefined)
    
    inline def setPhysicalDistancing(value: SchemaPhysicalDistancing): Self = StObject.set(x, "physicalDistancing", value.asInstanceOf[js.Any])
    
    inline def setPhysicalDistancingUndefined: Self = StObject.set(x, "physicalDistancing", js.undefined)
  }
}
