package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConsumptionData extends StObject {
  
  /**
    * Resources consumed by the instance.
    */
  var consumptionInfo: js.UndefOr[SchemaInstanceConsumptionInfo] = js.undefined
  
  /**
    * Server-defined URL for the instance.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceConsumptionData {
  
  inline def apply(): SchemaInstanceConsumptionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConsumptionData]
  }
  
  extension [Self <: SchemaInstanceConsumptionData](x: Self) {
    
    inline def setConsumptionInfo(value: SchemaInstanceConsumptionInfo): Self = StObject.set(x, "consumptionInfo", value.asInstanceOf[js.Any])
    
    inline def setConsumptionInfoUndefined: Self = StObject.set(x, "consumptionInfo", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
