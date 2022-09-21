package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaignFlight extends StObject {
  
  /**
    * Required. The dates that the campaign is expected to run. They are resolved relative to the parent advertiser's time zone. * The dates specified here will not affect serving. They are used to generate alerts and warnings. For example, if the flight date of any child insertion order is outside the range of these dates, the user interface will show a warning. * `start_date` is required and must be the current date or later. * `end_date` is optional. If specified, it must be the `start_date` or later. * Any specified date must be before the year 2037.
    */
  var plannedDates: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * The amount the campaign is expected to spend for its given planned_dates. This will not limit serving, but will be used for tracking spend in the DV360 UI. The amount is in micros. Must be greater than or equal to 0. For example, 500000000 represents 500 standard units of the currency.
    */
  var plannedSpendAmountMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaCampaignFlight {
  
  inline def apply(): SchemaCampaignFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignFlight]
  }
  
  extension [Self <: SchemaCampaignFlight](x: Self) {
    
    inline def setPlannedDates(value: SchemaDateRange): Self = StObject.set(x, "plannedDates", value.asInstanceOf[js.Any])
    
    inline def setPlannedDatesUndefined: Self = StObject.set(x, "plannedDates", js.undefined)
    
    inline def setPlannedSpendAmountMicros(value: String): Self = StObject.set(x, "plannedSpendAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPlannedSpendAmountMicrosNull: Self = StObject.set(x, "plannedSpendAmountMicros", null)
    
    inline def setPlannedSpendAmountMicrosUndefined: Self = StObject.set(x, "plannedSpendAmountMicros", js.undefined)
  }
}
