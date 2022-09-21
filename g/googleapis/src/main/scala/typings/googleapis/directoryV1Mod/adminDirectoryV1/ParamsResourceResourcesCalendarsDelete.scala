package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesCalendarsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID of the calendar resource to delete.
    */
  var calendarResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcesCalendarsDelete {
  
  inline def apply(): ParamsResourceResourcesCalendarsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesCalendarsDelete]
  }
  
  extension [Self <: ParamsResourceResourcesCalendarsDelete](x: Self) {
    
    inline def setCalendarResourceId(value: String): Self = StObject.set(x, "calendarResourceId", value.asInstanceOf[js.Any])
    
    inline def setCalendarResourceIdUndefined: Self = StObject.set(x, "calendarResourceId", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
