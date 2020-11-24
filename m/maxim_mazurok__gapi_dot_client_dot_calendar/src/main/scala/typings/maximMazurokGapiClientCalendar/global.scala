package typings.maximMazurokGapiClientCalendar

import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.AclResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarListResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarsResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.ChannelsResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.ColorsResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.EventsResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.FreebusyResource
import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.SettingsResource
import typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.calendar
import typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Calendar API v3 */
      def load(name: calendar, version: v3): js.Thenable[Unit] = js.native
      def load(name: calendar, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object calendar extends js.Object {
        
        val acl: AclResource = js.native
        
        val calendarList: CalendarListResource = js.native
        
        val calendars: CalendarsResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val colors: ColorsResource = js.native
        
        val events: EventsResource = js.native
        
        val freebusy: FreebusyResource = js.native
        
        val settings: SettingsResource = js.native
      }
    }
  }
}
