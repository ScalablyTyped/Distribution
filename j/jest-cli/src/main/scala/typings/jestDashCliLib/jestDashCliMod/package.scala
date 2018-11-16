package typings
package jestDashCliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashCliMod {
  type ConsoleBuffer = js.Array[LogEntry]
  type LogMessage = java.lang.String
  type LogType = jestDashCliLib.jestDashCliLibStrings.assert | jestDashCliLib.jestDashCliLibStrings.count | jestDashCliLib.jestDashCliLibStrings.debug | jestDashCliLib.jestDashCliLibStrings.dir | jestDashCliLib.jestDashCliLibStrings.dirxml | jestDashCliLib.jestDashCliLibStrings.error | jestDashCliLib.jestDashCliLibStrings.group | jestDashCliLib.jestDashCliLibStrings.groupCollapsed | jestDashCliLib.jestDashCliLibStrings.info | jestDashCliLib.jestDashCliLibStrings.log | jestDashCliLib.jestDashCliLibStrings.time | jestDashCliLib.jestDashCliLibStrings.warn
  type ReporterConfig = js.Tuple2[java.lang.String, js.Object]
  type SnapshotUpdateState = jestDashCliLib.jestDashCliLibStrings.all | jestDashCliLib.jestDashCliLibStrings.`new` | jestDashCliLib.jestDashCliLibStrings.none
  type Status = jestDashCliLib.jestDashCliLibStrings.passed | jestDashCliLib.jestDashCliLibStrings.failed | jestDashCliLib.jestDashCliLibStrings.skipped | jestDashCliLib.jestDashCliLibStrings.pending
}
