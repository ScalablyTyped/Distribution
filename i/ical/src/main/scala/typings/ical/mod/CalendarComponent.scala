package typings.ical.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rrule.mod.RRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarComponent
  extends /* prop */ StringDictionary[js.UndefOr[String | ParamList]] {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var completed: js.UndefOr[Date] = js.undefined
  var completion: js.UndefOr[String] = js.undefined
  var created: js.UndefOr[Date] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dtstamp: js.UndefOr[Date] = js.undefined
  var end: js.UndefOr[Date] = js.undefined
  var exdate: js.UndefOr[StringDictionary[Date]] = js.undefined
  var freebusy: js.UndefOr[FreeBusy] = js.undefined
  var geo: js.UndefOr[Geo] = js.undefined
  var lastmodified: js.UndefOr[Date] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var recurrenceid: js.UndefOr[Date] = js.undefined
  var recurrences: js.UndefOr[js.Array[CalendarComponent]] = js.undefined
  var rrule: js.UndefOr[RRule] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var transparency: js.UndefOr[String] = js.undefined
  var `type`: CalendarComponentType
  var uid: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CalendarComponent {
  @scala.inline
  def apply(
    `type`: CalendarComponentType,
    StringDictionary: /* prop */ StringDictionary[js.UndefOr[String | ParamList]] = null,
    categories: js.Array[String] = null,
    `class`: String = null,
    completed: Date = null,
    completion: String = null,
    created: Date = null,
    description: String = null,
    dtstamp: Date = null,
    end: Date = null,
    exdate: StringDictionary[Date] = null,
    freebusy: FreeBusy = null,
    geo: Geo = null,
    lastmodified: Date = null,
    location: String = null,
    recurrenceid: Date = null,
    recurrences: js.Array[CalendarComponent] = null,
    rrule: RRule = null,
    start: Date = null,
    summary: String = null,
    transparency: String = null,
    uid: String = null,
    url: String = null
  ): CalendarComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (completion != null) __obj.updateDynamic("completion")(completion.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dtstamp != null) __obj.updateDynamic("dtstamp")(dtstamp.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exdate != null) __obj.updateDynamic("exdate")(exdate.asInstanceOf[js.Any])
    if (freebusy != null) __obj.updateDynamic("freebusy")(freebusy.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (lastmodified != null) __obj.updateDynamic("lastmodified")(lastmodified.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (recurrenceid != null) __obj.updateDynamic("recurrenceid")(recurrenceid.asInstanceOf[js.Any])
    if (recurrences != null) __obj.updateDynamic("recurrences")(recurrences.asInstanceOf[js.Any])
    if (rrule != null) __obj.updateDynamic("rrule")(rrule.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarComponent]
  }
}

