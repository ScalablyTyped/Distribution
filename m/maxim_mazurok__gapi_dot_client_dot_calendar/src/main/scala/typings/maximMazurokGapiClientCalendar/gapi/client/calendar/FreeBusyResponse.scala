package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyResponse extends StObject {
  
  /** List of free/busy information for calendars. */
  var calendars: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.FreeBusyCalendar} */ js.Any
  ] = js.undefined
  
  /** Expansion of groups. */
  var groups: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.FreeBusyGroup} */ js.Any
  ] = js.undefined
  
  /** Type of the resource ("calendar#freeBusy"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The end of the interval. */
  var timeMax: js.UndefOr[String] = js.undefined
  
  /** The start of the interval. */
  var timeMin: js.UndefOr[String] = js.undefined
}
object FreeBusyResponse {
  
  inline def apply(): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyResponse]
  }
  
  extension [Self <: FreeBusyResponse](x: Self) {
    
    inline def setCalendars(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.FreeBusyCalendar} */ js.Any
    ): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setGroups(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.FreeBusyGroup} */ js.Any
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
  }
}
