package typings.jestDashCli

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashCliMod {
  type ConsoleBuffer = js.Array[LogEntry]
  type LogCounters = StringDictionary[Double]
  type LogMessage = String
  type LogTimers = StringDictionary[Date]
  type RawCoverage = StringDictionary[RawFileCoverage]
  type ReporterConfig = js.Tuple2[String, js.Object]
}
