package typings.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseStatic extends js.Object {
  /**
    * Create schedule data by parsing a cron string
    *
    * @param [input] - A string value to parse.
    * @param [hasSeconds] - Whether the cron expression has second part.
    */
  def cron(): ScheduleData = js.native
  def cron(input: String): ScheduleData = js.native
  def cron(input: String, hasSeconds: Boolean): ScheduleData = js.native
  /**
    * Create a recurrence builder for building schedule data.
    */
  def recur(): RecurrenceBuilder = js.native
  /**
    * Create schedule data by paring a human readable string.
    *
    * @param [input] - A string value to parse.
    */
  def text(): ScheduleData = js.native
  def text(input: String): ScheduleData = js.native
}

