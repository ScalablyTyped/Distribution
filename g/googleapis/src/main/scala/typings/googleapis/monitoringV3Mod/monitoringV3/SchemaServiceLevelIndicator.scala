package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceLevelIndicator extends StObject {
  
  /**
    * Basic SLI on a well-known service type.
    */
  var basicSli: js.UndefOr[SchemaBasicSli] = js.undefined
  
  /**
    * Request-based SLIs
    */
  var requestBased: js.UndefOr[SchemaRequestBasedSli] = js.undefined
  
  /**
    * Windows-based SLIs
    */
  var windowsBased: js.UndefOr[SchemaWindowsBasedSli] = js.undefined
}
object SchemaServiceLevelIndicator {
  
  inline def apply(): SchemaServiceLevelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceLevelIndicator]
  }
  
  extension [Self <: SchemaServiceLevelIndicator](x: Self) {
    
    inline def setBasicSli(value: SchemaBasicSli): Self = StObject.set(x, "basicSli", value.asInstanceOf[js.Any])
    
    inline def setBasicSliUndefined: Self = StObject.set(x, "basicSli", js.undefined)
    
    inline def setRequestBased(value: SchemaRequestBasedSli): Self = StObject.set(x, "requestBased", value.asInstanceOf[js.Any])
    
    inline def setRequestBasedUndefined: Self = StObject.set(x, "requestBased", js.undefined)
    
    inline def setWindowsBased(value: SchemaWindowsBasedSli): Self = StObject.set(x, "windowsBased", value.asInstanceOf[js.Any])
    
    inline def setWindowsBasedUndefined: Self = StObject.set(x, "windowsBased", js.undefined)
  }
}
