package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsoluteDateRange extends StObject {
  
  /** The end date of the range (inclusive). Must be within the 30 days leading up to current date, and must be equal to or after start_date. */
  var endDate: js.UndefOr[Date] = js.native
  
  /** The start date of the range (inclusive). Must be within the 30 days leading up to current date, and must be equal to or before end_date. */
  var startDate: js.UndefOr[Date] = js.native
}
object AbsoluteDateRange {
  
  @scala.inline
  def apply(): AbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbsoluteDateRange]
  }
  
  @scala.inline
  implicit class AbsoluteDateRangeMutableBuilder[Self <: AbsoluteDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
