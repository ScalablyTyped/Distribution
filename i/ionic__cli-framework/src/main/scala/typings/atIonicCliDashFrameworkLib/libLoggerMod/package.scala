package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLoggerMod {
  type LoggerFormatter = js.Function1[/* record */ LogRecord, java.lang.String]
  type LoggerLevel = atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.DEBUG | atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.INFO | atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.WARN | atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.ERROR
  type LoggerLevelWeight = scala.Double
}
