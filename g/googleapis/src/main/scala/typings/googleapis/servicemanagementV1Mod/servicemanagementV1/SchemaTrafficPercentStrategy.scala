package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrafficPercentStrategy extends StObject {
  
  /**
    * Maps service configuration IDs to their corresponding traffic percentage. Key is the service configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum must equal to 100.0.
    */
  var percentages: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaTrafficPercentStrategy {
  
  inline def apply(): SchemaTrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficPercentStrategy]
  }
  
  extension [Self <: SchemaTrafficPercentStrategy](x: Self) {
    
    inline def setPercentages(value: StringDictionary[Double]): Self = StObject.set(x, "percentages", value.asInstanceOf[js.Any])
    
    inline def setPercentagesNull: Self = StObject.set(x, "percentages", null)
    
    inline def setPercentagesUndefined: Self = StObject.set(x, "percentages", js.undefined)
  }
}
