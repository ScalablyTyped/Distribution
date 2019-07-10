package typings
package loggerLib.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", "Logger")
@js.native
object LoggerNs extends js.Object {
  val levels: js.Tuple5[
    loggerLib.loggerLibStrings.fatal, 
    loggerLib.loggerLibStrings.error, 
    loggerLib.loggerLibStrings.warn, 
    loggerLib.loggerLibStrings.info, 
    loggerLib.loggerLibStrings.debug
  ] = js.native
}

