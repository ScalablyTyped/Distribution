package typings.iso8601Duration.mod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iso8601-duration", JSImport.Default)
@js.native
object default extends js.Object {
  
  def end(duration: Duration): Date = js.native
  def end(duration: Duration, startDate: Date): Date = js.native
  @JSName("end")
  var end_Original: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Date] = js.native
  
  def parse(durationString: String): Duration = js.native
  @JSName("parse")
  var parse_Original: js.Function1[/* durationString */ String, Duration] = js.native
  
  var pattern: RegExp = js.native
  
  def toSeconds(duration: Duration): Double = js.native
  def toSeconds(duration: Duration, startDate: Date): Double = js.native
  @JSName("toSeconds")
  var toSeconds_Original: js.Function2[/* duration */ Duration, /* startDate */ js.UndefOr[Date], Double] = js.native
}
