package typings.leafletRoutingMachine.mod.Routing_

import typings.leafletRoutingMachine.leafletRoutingMachineStrings.imperial
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.metric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatterOptions extends StObject {
  
  var distanceTemplate: String
  
  var language: js.UndefOr[String] = js.undefined
  
  var roundingSensitivity: js.UndefOr[Double] = js.undefined
  
  var unitNames: js.UndefOr[js.Object] = js.undefined
  
  var units: js.UndefOr[metric | imperial] = js.undefined
}
object FormatterOptions {
  
  inline def apply(distanceTemplate: String): FormatterOptions = {
    val __obj = js.Dynamic.literal(distanceTemplate = distanceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterOptions]
  }
  
  extension [Self <: FormatterOptions](x: Self) {
    
    inline def setDistanceTemplate(value: String): Self = StObject.set(x, "distanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRoundingSensitivity(value: Double): Self = StObject.set(x, "roundingSensitivity", value.asInstanceOf[js.Any])
    
    inline def setRoundingSensitivityUndefined: Self = StObject.set(x, "roundingSensitivity", js.undefined)
    
    inline def setUnitNames(value: js.Object): Self = StObject.set(x, "unitNames", value.asInstanceOf[js.Any])
    
    inline def setUnitNamesUndefined: Self = StObject.set(x, "unitNames", js.undefined)
    
    inline def setUnits(value: metric | imperial): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
