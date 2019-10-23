package typings.ical.icalMod

import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ical", "fromURL")
@js.native
object fromURL extends js.Object {
  def apply(
    url: String,
    options: CoreOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ FullCalendar, Unit]
  ): Unit = js.native
}

