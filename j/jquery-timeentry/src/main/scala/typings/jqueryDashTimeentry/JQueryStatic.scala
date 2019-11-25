package typings.jqueryDashTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var timeEntry: ITimeEntryStatic
}

object JQueryStatic {
  @scala.inline
  def apply(timeEntry: ITimeEntryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(timeEntry = timeEntry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

