package typings
package log4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object log4jsMod {
  type Appender = CategoryFilterAppender | ConsoleAppender | FileAppender | SyncfileAppender | DateFileAppender | LogLevelFilterAppender | MultiFileAppender | MultiprocessAppender | RecordingAppender | StandardErrorAppender | StandardOutputAppender | CustomAppender
  type Layout = BaseLayout | ColoredLayout | MessagePassThroughLayout | DummyLayout | PatternLayout | CustomLayout
  type Token = (js.Function1[/* logEvent */ LoggingEvent, java.lang.String]) | java.lang.String
}
