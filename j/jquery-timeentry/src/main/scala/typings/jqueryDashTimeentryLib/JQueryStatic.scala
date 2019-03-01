package typings
package jqueryDashTimeentryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var timeEntry: ITimeEntryStatic
}

object JQueryStatic {
  @scala.inline
  def apply(timeEntry: ITimeEntryStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeEntry")(timeEntry)
    __obj.asInstanceOf[JQueryStatic]
  }
}

