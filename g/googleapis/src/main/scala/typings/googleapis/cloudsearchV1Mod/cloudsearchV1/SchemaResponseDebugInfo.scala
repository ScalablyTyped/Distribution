package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponseDebugInfo extends StObject {
  
  /**
    * Experiments enabled in QAPI.
    */
  var enabledExperiments: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaResponseDebugInfo {
  
  inline def apply(): SchemaResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseDebugInfo]
  }
  
  extension [Self <: SchemaResponseDebugInfo](x: Self) {
    
    inline def setEnabledExperiments(value: js.Array[Double]): Self = StObject.set(x, "enabledExperiments", value.asInstanceOf[js.Any])
    
    inline def setEnabledExperimentsNull: Self = StObject.set(x, "enabledExperiments", null)
    
    inline def setEnabledExperimentsUndefined: Self = StObject.set(x, "enabledExperiments", js.undefined)
    
    inline def setEnabledExperimentsVarargs(value: Double*): Self = StObject.set(x, "enabledExperiments", js.Array(value*))
    
    inline def setFormattedDebugInfo(value: String): Self = StObject.set(x, "formattedDebugInfo", value.asInstanceOf[js.Any])
    
    inline def setFormattedDebugInfoNull: Self = StObject.set(x, "formattedDebugInfo", null)
    
    inline def setFormattedDebugInfoUndefined: Self = StObject.set(x, "formattedDebugInfo", js.undefined)
  }
}
