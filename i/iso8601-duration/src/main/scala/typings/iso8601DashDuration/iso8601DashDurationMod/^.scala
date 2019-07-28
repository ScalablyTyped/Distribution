package typings.iso8601DashDuration.iso8601DashDurationMod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso8601-duration", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val pattern: RegExp = js.native
  def end(duration: Duration): Date = js.native
  def end(duration: Duration, startDate: Date): Date = js.native
  def parse(durationString: String): Duration = js.native
  def toSeconds(duration: Duration): Double = js.native
  def toSeconds(duration: Duration, startDate: Date): Double = js.native
}

