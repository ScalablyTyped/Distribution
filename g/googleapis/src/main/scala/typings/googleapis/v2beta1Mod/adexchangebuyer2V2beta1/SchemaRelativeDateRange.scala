package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A relative date range, specified by an offset and a duration. The supported
  * range of dates begins 30 days before today and ends today, i.e., the limits
  * for these values are: offset_days &gt;= 0 duration_days &gt;= 1 offset_days
  * + duration_days &lt;= 30
  */
trait SchemaRelativeDateRange extends StObject {
  
  /**
    * The number of days in the requested date range, e.g., for a range
    * spanning today: 1. For a range spanning the last 7 days: 7.
    */
  var durationDays: js.UndefOr[Double] = js.undefined
  
  /**
    * The end date of the filter set, specified as the number of days before
    * today, e.g., for a range where the last date is today: 0.
    */
  var offsetDays: js.UndefOr[Double] = js.undefined
}
object SchemaRelativeDateRange {
  
  @scala.inline
  def apply(): SchemaRelativeDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelativeDateRange]
  }
  
  @scala.inline
  implicit class SchemaRelativeDateRangeMutableBuilder[Self <: SchemaRelativeDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationDays(value: Double): Self = StObject.set(x, "durationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationDaysUndefined: Self = StObject.set(x, "durationDays", js.undefined)
    
    @scala.inline
    def setOffsetDays(value: Double): Self = StObject.set(x, "offsetDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDaysUndefined: Self = StObject.set(x, "offsetDays", js.undefined)
  }
}
