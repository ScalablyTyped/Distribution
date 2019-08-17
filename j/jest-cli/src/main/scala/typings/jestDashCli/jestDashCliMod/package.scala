package typings.jestDashCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashCliMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date

  type ConsoleBuffer = js.Array[LogEntry]
  type LogCounters = StringDictionary[Double]
  type LogMessage = String
  type LogTimers = StringDictionary[Date]
  type RawCoverage = StringDictionary[RawFileCoverage]
  type ReporterConfig = js.Tuple2[String, js.Object]
}
