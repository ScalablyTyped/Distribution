package typings
package iso8601DashDurationLib.iso8601DashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso8601-duration", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("end")
  var end_Original: js.Function2[
    /* duration */ iso8601DashDurationLib.iso8601DashDurationMod.Duration, 
    /* startDate */ js.UndefOr[stdLib.Date], 
    stdLib.Date
  ] = js.native
  @JSName("parse")
  var parse_Original: js.Function1[
    /* durationString */ java.lang.String, 
    iso8601DashDurationLib.iso8601DashDurationMod.Duration
  ] = js.native
  var pattern: stdLib.RegExp = js.native
  @JSName("toSeconds")
  var toSeconds_Original: js.Function2[
    /* duration */ iso8601DashDurationLib.iso8601DashDurationMod.Duration, 
    /* startDate */ js.UndefOr[stdLib.Date], 
    scala.Double
  ] = js.native
  def end(duration: iso8601DashDurationLib.iso8601DashDurationMod.Duration): stdLib.Date = js.native
  def end(duration: iso8601DashDurationLib.iso8601DashDurationMod.Duration, startDate: stdLib.Date): stdLib.Date = js.native
  def parse(durationString: java.lang.String): iso8601DashDurationLib.iso8601DashDurationMod.Duration = js.native
  def toSeconds(duration: iso8601DashDurationLib.iso8601DashDurationMod.Duration): scala.Double = js.native
  def toSeconds(duration: iso8601DashDurationLib.iso8601DashDurationMod.Duration, startDate: stdLib.Date): scala.Double = js.native
}

