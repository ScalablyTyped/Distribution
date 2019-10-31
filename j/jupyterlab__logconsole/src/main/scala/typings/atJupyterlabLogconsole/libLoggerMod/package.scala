package typings.atJupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLoggerMod {
  import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
  import typings.atJupyterlabLogconsole.Anon_Level

  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = IOutput with Anon_Level
  type LogOutputModel = LogOutputModel_
  type Logger = Logger_
  type LoggerOutputAreaModel = LoggerOutputAreaModel_
}
