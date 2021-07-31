package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contiguous set of days: startDate, startDate + 1 day, ..., endDate. The
  * start and end dates are specified in
  * [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) date format `YYYY-MM-DD`.
  */
trait SchemaDateRange extends StObject {
  
  /**
    * The end date for the query in the format `YYYY-MM-DD`.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The start date for the query in the format `YYYY-MM-DD`.
    */
  var startDate: js.UndefOr[String] = js.undefined
}
object SchemaDateRange {
  
  @scala.inline
  def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  
  @scala.inline
  implicit class SchemaDateRangeMutableBuilder[Self <: SchemaDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
