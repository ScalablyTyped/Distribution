package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesCalendarsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID of the calendar resource to update.
    */
  var calendarResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCalendarResource] = js.undefined
}
object ParamsResourceResourcesCalendarsUpdate {
  
  inline def apply(): ParamsResourceResourcesCalendarsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesCalendarsUpdate]
  }
  
  extension [Self <: ParamsResourceResourcesCalendarsUpdate](x: Self) {
    
    inline def setCalendarResourceId(value: String): Self = StObject.set(x, "calendarResourceId", value.asInstanceOf[js.Any])
    
    inline def setCalendarResourceIdUndefined: Self = StObject.set(x, "calendarResourceId", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRequestBody(value: SchemaCalendarResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
