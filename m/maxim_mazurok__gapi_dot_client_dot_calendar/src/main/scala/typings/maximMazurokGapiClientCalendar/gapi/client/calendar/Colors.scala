package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  /** A global palette of calendar colors, mapping from the color ID to its definition. A calendarListEntry resource refers to one of these color IDs in its colorId field. Read-only. */
  var calendar: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.ColorDefinition} */ js.Any
  ] = js.undefined
  
  /** A global palette of event colors, mapping from the color ID to its definition. An event resource may refer to one of these color IDs in its colorId field. Read-only. */
  var event: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.ColorDefinition} */ js.Any
  ] = js.undefined
  
  /** Type of the resource ("calendar#colors"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Last modification time of the color palette (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[String] = js.undefined
}
object Colors {
  
  inline def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setCalendar(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.ColorDefinition} */ js.Any
    ): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.calendar.gapi.client.calendar.ColorDefinition} */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
