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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object calendar {
        
        @JSGlobal("gapi.client.calendar.acl")
        @js.native
        val acl: AclResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendarList")
        @js.native
        val calendarList: CalendarListResource = js.native
        
        @JSGlobal("gapi.client.calendar.calendars")
        @js.native
        val calendars: CalendarsResource = js.native
        
        @JSGlobal("gapi.client.calendar.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.calendar.colors")
        @js.native
        val colors: ColorsResource = js.native
        
        @JSGlobal("gapi.client.calendar.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.calendar.freebusy")
        @js.native
        val freebusy: FreebusyResource = js.native
        
        @JSGlobal("gapi.client.calendar.settings")
        @js.native
        val settings: SettingsResource = js.native
      }
      
      /** Load Calendar API v3 */
      @scala.inline
      def load(name: calendar, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: calendar, version: v3, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
