package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesCalendarsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID of the calendar resource to retrieve.
    */
  var calendarResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcesCalendarsGet {
  
  inline def apply(): ParamsResourceResourcesCalendarsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesCalendarsGet]
  }
  
  extension [Self <: ParamsResourceResourcesCalendarsGet](x: Self) {
    
    inline def setCalendarResourceId(value: String): Self = StObject.set(x, "calendarResourceId", value.asInstanceOf[js.Any])
    
    inline def setCalendarResourceIdUndefined: Self = StObject.set(x, "calendarResourceId", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
