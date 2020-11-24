package typings.ical.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rrule.mod.RRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CalendarComponentOps[Self <: CalendarComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: CalendarComponentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setCompleted(value: Date): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    
    @scala.inline
    def setCompletion(value: String): Self = this.set("completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletion: Self = this.set("completion", js.undefined)
    
    @scala.inline
    def setCreated(value: Date): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDtstamp(value: Date): Self = this.set("dtstamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDtstamp: Self = this.set("dtstamp", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setExdate(value: StringDictionary[Date]): Self = this.set("exdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExdate: Self = this.set("exdate", js.undefined)
    
    @scala.inline
    def setFreebusy(value: FreeBusy): Self = this.set("freebusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreebusy: Self = this.set("freebusy", js.undefined)
    
    @scala.inline
    def setGeo(value: Geo): Self = this.set("geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    
    @scala.inline
    def setLastmodified(value: Date): Self = this.set("lastmodified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastmodified: Self = this.set("lastmodified", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setRecurrenceid(value: Date): Self = this.set("recurrenceid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceid: Self = this.set("recurrenceid", js.undefined)
    
    @scala.inline
    def setRecurrencesVarargs(value: CalendarComponent*): Self = this.set("recurrences", js.Array(value :_*))
    
    @scala.inline
    def setRecurrences(value: js.Array[CalendarComponent]): Self = this.set("recurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrences: Self = this.set("recurrences", js.undefined)
    
    @scala.inline
    def setRrule(value: RRule): Self = this.set("rrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRrule: Self = this.set("rrule", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTransparency(value: String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
