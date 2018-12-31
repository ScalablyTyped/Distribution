package typings
package laterLib.laterMod.laterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleData extends js.Object {
  /**
    * A code to identify any errors in the composite schedule and exceptions.
    * The number tells you the position of the error within the schedule.
    */
  var error: scala.Double
  /**
    * A list of exceptions to the composite recurrence information.
    */
  var exceptions: js.Array[Recurrence]
  /**
    * A list of recurrence information as a composite schedule.
    */
  var schedules: js.Array[Recurrence]
}

