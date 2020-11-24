package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A relative date range, specified by an offset and a duration. The supported
  * range of dates begins 30 days before today and ends today, i.e., the limits
  * for these values are: offset_days &gt;= 0 duration_days &gt;= 1 offset_days
  * + duration_days &lt;= 30
  */
@js.native
trait SchemaRelativeDateRange extends js.Object {
  
  /**
    * The number of days in the requested date range, e.g., for a range
    * spanning today: 1. For a range spanning the last 7 days: 7.
    */
  var durationDays: js.UndefOr[Double] = js.native
  
  /**
    * The end date of the filter set, specified as the number of days before
    * today, e.g., for a range where the last date is today: 0.
    */
  var offsetDays: js.UndefOr[Double] = js.native
}
object SchemaRelativeDateRange {
  
  @scala.inline
  def apply(): SchemaRelativeDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelativeDateRange]
  }
  
  @scala.inline
  implicit class SchemaRelativeDateRangeOps[Self <: SchemaRelativeDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDurationDays(value: Double): Self = this.set("durationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationDays: Self = this.set("durationDays", js.undefined)
    
    @scala.inline
    def setOffsetDays(value: Double): Self = this.set("offsetDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetDays: Self = this.set("offsetDays", js.undefined)
  }
}
