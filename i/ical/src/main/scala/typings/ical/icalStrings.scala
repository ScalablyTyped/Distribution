package typings.ical

import typings.ical.mod.CalendarComponentType
import typings.ical.mod.FreeBusyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icalStrings {
  
  @js.native
  sealed trait BUSY
    extends StObject
       with FreeBusyType
  inline def BUSY: BUSY = "BUSY".asInstanceOf[BUSY]
  
  @js.native
  sealed trait FREE
    extends StObject
       with FreeBusyType
  inline def FREE: FREE = "FREE".asInstanceOf[FREE]
  
  @js.native
  sealed trait VALARM
    extends StObject
       with CalendarComponentType
  inline def VALARM: VALARM = "VALARM".asInstanceOf[VALARM]
  
  @js.native
  sealed trait VEVENT
    extends StObject
       with CalendarComponentType
  inline def VEVENT: VEVENT = "VEVENT".asInstanceOf[VEVENT]
  
  @js.native
  sealed trait VFREEBUSY
    extends StObject
       with CalendarComponentType
  inline def VFREEBUSY: VFREEBUSY = "VFREEBUSY".asInstanceOf[VFREEBUSY]
  
  @js.native
  sealed trait VJOURNAL
    extends StObject
       with CalendarComponentType
  inline def VJOURNAL: VJOURNAL = "VJOURNAL".asInstanceOf[VJOURNAL]
  
  @js.native
  sealed trait VTIMEZONE
    extends StObject
       with CalendarComponentType
  inline def VTIMEZONE: VTIMEZONE = "VTIMEZONE".asInstanceOf[VTIMEZONE]
  
  @js.native
  sealed trait VTODO
    extends StObject
       with CalendarComponentType
  inline def VTODO: VTODO = "VTODO".asInstanceOf[VTODO]
}
