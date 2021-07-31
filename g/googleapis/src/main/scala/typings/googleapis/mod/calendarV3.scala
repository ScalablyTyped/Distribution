package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarV3 {
  
  /**
    * Calendar API
    *
    * Manipulates events and other calendar data.
    *
    * @example
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * @namespace calendar
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Calendar
    */
  @JSImport("googleapis", "calendar_v3.Calendar")
  @js.native
  class Calendar protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.Calendar {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Acl")
  @js.native
  class ResourceAcl protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceAcl {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Calendarlist")
  @js.native
  class ResourceCalendarlist protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceCalendarlist {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Calendars")
  @js.native
  class ResourceCalendars protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceCalendars {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Colors")
  @js.native
  class ResourceColors protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceColors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Events")
  @js.native
  class ResourceEvents protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceEvents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Freebusy")
  @js.native
  class ResourceFreebusy protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceFreebusy {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "calendar_v3.Resource$Settings")
  @js.native
  class ResourceSettings protected ()
    extends typings.googleapis.calendarV3Mod.calendarV3.ResourceSettings {
    def this(context: APIRequestContext) = this()
  }
}
