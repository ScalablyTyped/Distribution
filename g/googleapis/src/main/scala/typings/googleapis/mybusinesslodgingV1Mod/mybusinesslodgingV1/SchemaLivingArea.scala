package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLivingArea extends StObject {
  
  /**
    * Accessibility features of the living area.
    */
  var accessibility: js.UndefOr[SchemaLivingAreaAccessibility] = js.undefined
  
  /**
    * Information about eating features in the living area.
    */
  var eating: js.UndefOr[SchemaLivingAreaEating] = js.undefined
  
  /**
    * Features in the living area.
    */
  var features: js.UndefOr[SchemaLivingAreaFeatures] = js.undefined
  
  /**
    * Information about the layout of the living area.
    */
  var layout: js.UndefOr[SchemaLivingAreaLayout] = js.undefined
  
  /**
    * Information about sleeping features in the living area.
    */
  var sleeping: js.UndefOr[SchemaLivingAreaSleeping] = js.undefined
}
object SchemaLivingArea {
  
  inline def apply(): SchemaLivingArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivingArea]
  }
  
  extension [Self <: SchemaLivingArea](x: Self) {
    
    inline def setAccessibility(value: SchemaLivingAreaAccessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setEating(value: SchemaLivingAreaEating): Self = StObject.set(x, "eating", value.asInstanceOf[js.Any])
    
    inline def setEatingUndefined: Self = StObject.set(x, "eating", js.undefined)
    
    inline def setFeatures(value: SchemaLivingAreaFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setLayout(value: SchemaLivingAreaLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSleeping(value: SchemaLivingAreaSleeping): Self = StObject.set(x, "sleeping", value.asInstanceOf[js.Any])
    
    inline def setSleepingUndefined: Self = StObject.set(x, "sleeping", js.undefined)
  }
}
