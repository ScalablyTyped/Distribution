package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbsoluteDateRange extends StObject {
  
  /**
    * The end date of the range (inclusive). Must be within the 30 days leading up to current date, and must be equal to or after start_date.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The start date of the range (inclusive). Must be within the 30 days leading up to current date, and must be equal to or before end_date.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaAbsoluteDateRange {
  
  inline def apply(): SchemaAbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbsoluteDateRange]
  }
  
  extension [Self <: SchemaAbsoluteDateRange](x: Self) {
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
