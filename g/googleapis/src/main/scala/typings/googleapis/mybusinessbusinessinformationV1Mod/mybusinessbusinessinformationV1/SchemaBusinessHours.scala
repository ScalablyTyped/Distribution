package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBusinessHours extends StObject {
  
  /**
    * Required. A collection of times that this location is open for business. Each period represents a range of hours when the location is open during the week.
    */
  var periods: js.UndefOr[js.Array[SchemaTimePeriod]] = js.undefined
}
object SchemaBusinessHours {
  
  inline def apply(): SchemaBusinessHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBusinessHours]
  }
  
  extension [Self <: SchemaBusinessHours](x: Self) {
    
    inline def setPeriods(value: js.Array[SchemaTimePeriod]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
    
    inline def setPeriodsVarargs(value: SchemaTimePeriod*): Self = StObject.set(x, "periods", js.Array(value*))
  }
}
