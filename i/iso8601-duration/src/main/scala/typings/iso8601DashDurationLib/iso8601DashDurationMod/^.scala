package typings
package iso8601DashDurationLib.iso8601DashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso8601-duration", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val pattern: stdLib.RegExp = js.native
  def end(duration: Duration): stdLib.Date = js.native
  def end(duration: Duration, startDate: stdLib.Date): stdLib.Date = js.native
  def parse(durationString: java.lang.String): Duration = js.native
  def toSeconds(duration: Duration): scala.Double = js.native
  def toSeconds(duration: Duration, startDate: stdLib.Date): scala.Double = js.native
}

