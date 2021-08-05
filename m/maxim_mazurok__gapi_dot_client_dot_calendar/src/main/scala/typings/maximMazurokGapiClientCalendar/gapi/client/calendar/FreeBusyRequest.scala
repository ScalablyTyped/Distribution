package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyRequest extends StObject {
  
  /** Maximal number of calendars for which FreeBusy information is to be provided. Optional. Maximum value is 50. */
  var calendarExpansionMax: js.UndefOr[Double] = js.undefined
  
  /** Maximal number of calendar identifiers to be provided for a single group. Optional. An error is returned for a group with more members than this value. Maximum value is 100. */
  var groupExpansionMax: js.UndefOr[Double] = js.undefined
  
  /** List of calendars and/or groups to query. */
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
  
  /** The end of the interval for the query formatted as per RFC3339. */
  var timeMax: js.UndefOr[String] = js.undefined
  
  /** The start of the interval for the query formatted as per RFC3339. */
  var timeMin: js.UndefOr[String] = js.undefined
  
  /** Time zone used in the response. Optional. The default is UTC. */
  var timeZone: js.UndefOr[String] = js.undefined
}
object FreeBusyRequest {
  
  inline def apply(): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyRequest]
  }
  
  extension [Self <: FreeBusyRequest](x: Self) {
    
    inline def setCalendarExpansionMax(value: Double): Self = StObject.set(x, "calendarExpansionMax", value.asInstanceOf[js.Any])
    
    inline def setCalendarExpansionMaxUndefined: Self = StObject.set(x, "calendarExpansionMax", js.undefined)
    
    inline def setGroupExpansionMax(value: Double): Self = StObject.set(x, "groupExpansionMax", value.asInstanceOf[js.Any])
    
    inline def setGroupExpansionMaxUndefined: Self = StObject.set(x, "groupExpansionMax", js.undefined)
    
    inline def setItems(value: js.Array[FreeBusyRequestItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FreeBusyRequestItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
