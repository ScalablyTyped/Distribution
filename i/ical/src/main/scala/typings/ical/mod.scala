package typings.ical

import org.scalablytyped.runtime.StringDictionary
import typings.request.mod.CoreOptions
import typings.rrule.mod.RRule
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ical", "fromURL")
  @js.native
  def fromURL(
    url: String,
    options: CoreOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ FullCalendar, Unit]
  ): Unit = js.native
  
  @JSImport("ical", "parseFile")
  @js.native
  def parseFile(filename: String): FullCalendar = js.native
  
  @JSImport("ical", "parseICS")
  @js.native
  def parseICS(icsData: String): FullCalendar = js.native
  
  @js.native
  trait CalendarComponent
    extends /* prop */ StringDictionary[js.UndefOr[String | ParamList]] {
    
    var categories: js.UndefOr[js.Array[String]] = js.native
    
    var `class`: js.UndefOr[String] = js.native
    
    var completed: js.UndefOr[Date] = js.native
    
    var completion: js.UndefOr[String] = js.native
    
    var created: js.UndefOr[Date] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var dtstamp: js.UndefOr[Date] = js.native
    
    var end: js.UndefOr[Date] = js.native
    
    var exdate: js.UndefOr[StringDictionary[Date]] = js.native
    
    var freebusy: js.UndefOr[FreeBusy] = js.native
    
    var geo: js.UndefOr[Geo] = js.native
    
    var lastmodified: js.UndefOr[Date] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var recurrenceid: js.UndefOr[Date] = js.native
    
    var recurrences: js.UndefOr[js.Array[CalendarComponent]] = js.native
    
    var rrule: js.UndefOr[RRule] = js.native
    
    var start: js.UndefOr[Date] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var transparency: js.UndefOr[String] = js.native
    
    var `type`: CalendarComponentType = js.native
    
    var uid: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object CalendarComponent {
    
    @scala.inline
    def apply(`type`: CalendarComponentType): CalendarComponent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarComponent]
    }
    
    @scala.inline
    implicit class CalendarComponentMutableBuilder[Self <: CalendarComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCompleted(value: Date): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setCompletion(value: String): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      @scala.inline
      def setCreated(value: Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDtstamp(value: Date): Self = StObject.set(x, "dtstamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstampUndefined: Self = StObject.set(x, "dtstamp", js.undefined)
      
      @scala.inline
      def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setExdate(value: StringDictionary[Date]): Self = StObject.set(x, "exdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExdateUndefined: Self = StObject.set(x, "exdate", js.undefined)
      
      @scala.inline
      def setFreebusy(value: FreeBusy): Self = StObject.set(x, "freebusy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreebusyUndefined: Self = StObject.set(x, "freebusy", js.undefined)
      
      @scala.inline
      def setGeo(value: Geo): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      @scala.inline
      def setLastmodified(value: Date): Self = StObject.set(x, "lastmodified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastmodifiedUndefined: Self = StObject.set(x, "lastmodified", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setRecurrenceid(value: Date): Self = StObject.set(x, "recurrenceid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrenceidUndefined: Self = StObject.set(x, "recurrenceid", js.undefined)
      
      @scala.inline
      def setRecurrences(value: js.Array[CalendarComponent]): Self = StObject.set(x, "recurrences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrencesUndefined: Self = StObject.set(x, "recurrences", js.undefined)
      
      @scala.inline
      def setRecurrencesVarargs(value: CalendarComponent*): Self = StObject.set(x, "recurrences", js.Array(value :_*))
      
      @scala.inline
      def setRrule(value: RRule): Self = StObject.set(x, "rrule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRruleUndefined: Self = StObject.set(x, "rrule", js.undefined)
      
      @scala.inline
      def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
      
      @scala.inline
      def setType(value: CalendarComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def VALARM: typings.ical.icalStrings.VALARM = "VALARM".asInstanceOf[typings.ical.icalStrings.VALARM]
    
    @scala.inline
    def VEVENT: typings.ical.icalStrings.VEVENT = "VEVENT".asInstanceOf[typings.ical.icalStrings.VEVENT]
    
    @scala.inline
    def VFREEBUSY: typings.ical.icalStrings.VFREEBUSY = "VFREEBUSY".asInstanceOf[typings.ical.icalStrings.VFREEBUSY]
    
    @scala.inline
    def VJOURNAL: typings.ical.icalStrings.VJOURNAL = "VJOURNAL".asInstanceOf[typings.ical.icalStrings.VJOURNAL]
    
    @scala.inline
    def VTIMEZONE: typings.ical.icalStrings.VTIMEZONE = "VTIMEZONE".asInstanceOf[typings.ical.icalStrings.VTIMEZONE]
    
    @scala.inline
    def VTODO: typings.ical.icalStrings.VTODO = "VTODO".asInstanceOf[typings.ical.icalStrings.VTODO]
  }
  
  @js.native
  trait FreeBusy extends StObject {
    
    var end: Date = js.native
    
    var start: Date = js.native
    
    var `type`: FreeBusyType = js.native
  }
  object FreeBusy {
    
    @scala.inline
    def apply(end: Date, start: Date, `type`: FreeBusyType): FreeBusy = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FreeBusy]
    }
    
    @scala.inline
    implicit class FreeBusyMutableBuilder[Self <: FreeBusy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: FreeBusyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ical.icalStrings.FREE
    - typings.ical.icalStrings.BUSY
  */
  trait FreeBusyType extends StObject
  object FreeBusyType {
    
    @scala.inline
    def BUSY: typings.ical.icalStrings.BUSY = "BUSY".asInstanceOf[typings.ical.icalStrings.BUSY]
    
    @scala.inline
    def FREE: typings.ical.icalStrings.FREE = "FREE".asInstanceOf[typings.ical.icalStrings.FREE]
  }
  
  type FullCalendar = StringDictionary[CalendarComponent]
  
  @js.native
  trait Geo extends StObject {
    
    var lat: Double = js.native
    
    var lon: Double = js.native
  }
  object Geo {
    
    @scala.inline
    def apply(lat: Double, lon: Double): Geo = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geo]
    }
    
    @scala.inline
    implicit class GeoMutableBuilder[Self <: Geo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParamList extends StObject {
    
    var params: StringDictionary[String] = js.native
    
    var `val`: String = js.native
  }
  object ParamList {
    
    @scala.inline
    def apply(params: StringDictionary[String], `val`: String): ParamList = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamList]
    }
    
    @scala.inline
    implicit class ParamListMutableBuilder[Self <: ParamList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
