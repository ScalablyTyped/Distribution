package typings.atJestConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date

  type ConsoleBuffer = js.Array[LogEntry]
  type LogCounters = StringDictionary[Double]
  type LogMessage = String
  type LogTimers = StringDictionary[Date]
}
