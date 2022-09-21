package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoreHours extends StObject {
  
  /**
    * Required. Type of hours. Clients should call {#link businessCategories:BatchGet\} to get supported hours types for categories of their locations.
    */
  var hoursTypeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A collection of times that this location is open. Each period represents a range of hours when the location is open during the week.
    */
  var periods: js.UndefOr[js.Array[SchemaTimePeriod]] = js.undefined
}
object SchemaMoreHours {
  
  inline def apply(): SchemaMoreHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoreHours]
  }
  
  extension [Self <: SchemaMoreHours](x: Self) {
    
    inline def setHoursTypeId(value: String): Self = StObject.set(x, "hoursTypeId", value.asInstanceOf[js.Any])
    
    inline def setHoursTypeIdNull: Self = StObject.set(x, "hoursTypeId", null)
    
    inline def setHoursTypeIdUndefined: Self = StObject.set(x, "hoursTypeId", js.undefined)
    
    inline def setPeriods(value: js.Array[SchemaTimePeriod]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
    
    inline def setPeriodsVarargs(value: SchemaTimePeriod*): Self = StObject.set(x, "periods", js.Array(value*))
  }
}
