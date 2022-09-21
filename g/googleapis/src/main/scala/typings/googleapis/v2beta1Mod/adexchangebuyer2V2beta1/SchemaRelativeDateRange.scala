package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelativeDateRange extends StObject {
  
  /**
    * The number of days in the requested date range, e.g., for a range spanning today: 1. For a range spanning the last 7 days: 7.
    */
  var durationDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The end date of the filter set, specified as the number of days before today, e.g., for a range where the last date is today: 0.
    */
  var offsetDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRelativeDateRange {
  
  inline def apply(): SchemaRelativeDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelativeDateRange]
  }
  
  extension [Self <: SchemaRelativeDateRange](x: Self) {
    
    inline def setDurationDays(value: Double): Self = StObject.set(x, "durationDays", value.asInstanceOf[js.Any])
    
    inline def setDurationDaysNull: Self = StObject.set(x, "durationDays", null)
    
    inline def setDurationDaysUndefined: Self = StObject.set(x, "durationDays", js.undefined)
    
    inline def setOffsetDays(value: Double): Self = StObject.set(x, "offsetDays", value.asInstanceOf[js.Any])
    
    inline def setOffsetDaysNull: Self = StObject.set(x, "offsetDays", null)
    
    inline def setOffsetDaysUndefined: Self = StObject.set(x, "offsetDays", js.undefined)
  }
}
