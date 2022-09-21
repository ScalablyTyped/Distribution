package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpecialHours extends StObject {
  
  /**
    * Required. A list of exceptions to the business's regular hours.
    */
  var specialHourPeriods: js.UndefOr[js.Array[SchemaSpecialHourPeriod]] = js.undefined
}
object SchemaSpecialHours {
  
  inline def apply(): SchemaSpecialHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpecialHours]
  }
  
  extension [Self <: SchemaSpecialHours](x: Self) {
    
    inline def setSpecialHourPeriods(value: js.Array[SchemaSpecialHourPeriod]): Self = StObject.set(x, "specialHourPeriods", value.asInstanceOf[js.Any])
    
    inline def setSpecialHourPeriodsUndefined: Self = StObject.set(x, "specialHourPeriods", js.undefined)
    
    inline def setSpecialHourPeriodsVarargs(value: SchemaSpecialHourPeriod*): Self = StObject.set(x, "specialHourPeriods", js.Array(value*))
  }
}
