package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDateRange extends StObject {
  
  /** The number of days in the requested date range, e.g., for a range spanning today: 1. For a range spanning the last 7 days: 7. */
  var durationDays: js.UndefOr[Double] = js.undefined
  
  /** The end date of the filter set, specified as the number of days before today, e.g., for a range where the last date is today: 0. */
  var offsetDays: js.UndefOr[Double] = js.undefined
}
object RelativeDateRange {
  
  inline def apply(): RelativeDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeDateRange]
  }
  
  extension [Self <: RelativeDateRange](x: Self) {
    
    inline def setDurationDays(value: Double): Self = StObject.set(x, "durationDays", value.asInstanceOf[js.Any])
    
    inline def setDurationDaysUndefined: Self = StObject.set(x, "durationDays", js.undefined)
    
    inline def setOffsetDays(value: Double): Self = StObject.set(x, "offsetDays", value.asInstanceOf[js.Any])
    
    inline def setOffsetDaysUndefined: Self = StObject.set(x, "offsetDays", js.undefined)
  }
}
