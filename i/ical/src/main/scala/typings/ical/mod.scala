package typings.ical

import org.scalablytyped.runtime.StringDictionary
import typings.rrule.mod.RRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseFile(filename: String): FullCalendar = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filename.asInstanceOf[js.Any]).asInstanceOf[FullCalendar]
  
  inline def parseICS(icsData: String): FullCalendar = ^.asInstanceOf[js.Dynamic].applyDynamic("parseICS")(icsData.asInstanceOf[js.Any]).asInstanceOf[FullCalendar]
  
  trait CalendarComponent
    extends StObject
       with /* prop */ StringDictionary[js.UndefOr[String | ParamList]] {
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var completed: js.UndefOr[js.Date] = js.undefined
    
    var completion: js.UndefOr[String] = js.undefined
    
    var created: js.UndefOr[js.Date] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var dtstamp: js.UndefOr[js.Date] = js.undefined
    
    var end: js.UndefOr[js.Date] = js.undefined
    
    var exdate: js.UndefOr[StringDictionary[js.Date]] = js.undefined
    
    var freebusy: js.UndefOr[FreeBusy] = js.undefined
    
    var geo: js.UndefOr[Geo] = js.undefined
    
    var lastmodified: js.UndefOr[js.Date] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var recurrenceid: js.UndefOr[js.Date] = js.undefined
    
    var recurrences: js.UndefOr[js.Array[CalendarComponent]] = js.undefined
    
    var rrule: js.UndefOr[RRule] = js.undefined
    
    var start: js.UndefOr[js.Date] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var transparency: js.UndefOr[String] = js.undefined
    
    var `type`: CalendarComponentType
    
    var uid: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CalendarComponent {
    
    inline def apply(`type`: CalendarComponentType): CalendarComponent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarComponent]
    }
    
    extension [Self <: CalendarComponent](x: Self) {
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCompleted(value: js.Date): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      inline def setCompletion(value: String): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDtstamp(value: js.Date): Self = StObject.set(x, "dtstamp", value.asInstanceOf[js.Any])
      
      inline def setDtstampUndefined: Self = StObject.set(x, "dtstamp", js.undefined)
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setExdate(value: StringDictionary[js.Date]): Self = StObject.set(x, "exdate", value.asInstanceOf[js.Any])
      
      inline def setExdateUndefined: Self = StObject.set(x, "exdate", js.undefined)
      
      inline def setFreebusy(value: FreeBusy): Self = StObject.set(x, "freebusy", value.asInstanceOf[js.Any])
      
      inline def setFreebusyUndefined: Self = StObject.set(x, "freebusy", js.undefined)
      
      inline def setGeo(value: Geo): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setLastmodified(value: js.Date): Self = StObject.set(x, "lastmodified", value.asInstanceOf[js.Any])
      
      inline def setLastmodifiedUndefined: Self = StObject.set(x, "lastmodified", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setRecurrenceid(value: js.Date): Self = StObject.set(x, "recurrenceid", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceidUndefined: Self = StObject.set(x, "recurrenceid", js.undefined)
      
      inline def setRecurrences(value: js.Array[CalendarComponent]): Self = StObject.set(x, "recurrences", value.asInstanceOf[js.Any])
      
      inline def setRecurrencesUndefined: Self = StObject.set(x, "recurrences", js.undefined)
      
      inline def setRecurrencesVarargs(value: CalendarComponent*): Self = StObject.set(x, "recurrences", js.Array(value*))
      
      inline def setRrule(value: RRule): Self = StObject.set(x, "rrule", value.asInstanceOf[js.Any])
      
      inline def setRruleUndefined: Self = StObject.set(x, "rrule", js.undefined)
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      inline def setType(value: CalendarComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ical.icalStrings.VEVENT
    - typings.ical.icalStrings.VTODO
    - typings.ical.icalStrings.VJOURNAL
    - typings.ical.icalStrings.VFREEBUSY
    - typings.ical.icalStrings.VTIMEZONE
    - typings.ical.icalStrings.VALARM
  */
  trait CalendarComponentType extends StObject
  object CalendarComponentType {
    
    inline def VALARM: typings.ical.icalStrings.VALARM = "VALARM".asInstanceOf[typings.ical.icalStrings.VALARM]
    
    inline def VEVENT: typings.ical.icalStrings.VEVENT = "VEVENT".asInstanceOf[typings.ical.icalStrings.VEVENT]
    
    inline def VFREEBUSY: typings.ical.icalStrings.VFREEBUSY = "VFREEBUSY".asInstanceOf[typings.ical.icalStrings.VFREEBUSY]
    
    inline def VJOURNAL: typings.ical.icalStrings.VJOURNAL = "VJOURNAL".asInstanceOf[typings.ical.icalStrings.VJOURNAL]
    
    inline def VTIMEZONE: typings.ical.icalStrings.VTIMEZONE = "VTIMEZONE".asInstanceOf[typings.ical.icalStrings.VTIMEZONE]
    
    inline def VTODO: typings.ical.icalStrings.VTODO = "VTODO".asInstanceOf[typings.ical.icalStrings.VTODO]
  }
  
  trait FreeBusy extends StObject {
    
    var end: js.Date
    
    var start: js.Date
    
    var `type`: FreeBusyType
  }
  object FreeBusy {
    
    inline def apply(end: js.Date, start: js.Date, `type`: FreeBusyType): FreeBusy = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FreeBusy]
    }
    
    extension [Self <: FreeBusy](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: FreeBusyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ical.icalStrings.FREE
    - typings.ical.icalStrings.BUSY
  */
  trait FreeBusyType extends StObject
  object FreeBusyType {
    
    inline def BUSY: typings.ical.icalStrings.BUSY = "BUSY".asInstanceOf[typings.ical.icalStrings.BUSY]
    
    inline def FREE: typings.ical.icalStrings.FREE = "FREE".asInstanceOf[typings.ical.icalStrings.FREE]
  }
  
  type FullCalendar = StringDictionary[CalendarComponent]
  
  trait Geo extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Geo {
    
    inline def apply(lat: Double, lon: Double): Geo = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geo]
    }
    
    extension [Self <: Geo](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParamList extends StObject {
    
    var params: StringDictionary[String]
    
    var `val`: String
  }
  object ParamList {
    
    inline def apply(params: StringDictionary[String], `val`: String): ParamList = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamList]
    }
    
    extension [Self <: ParamList](x: Self) {
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
