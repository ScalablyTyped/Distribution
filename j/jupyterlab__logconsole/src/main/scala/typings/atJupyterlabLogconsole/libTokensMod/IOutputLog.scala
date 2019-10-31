package typings.atJupyterlabLogconsole.libTokensMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as Notebook kernel output.
    */
  @JSName("data")
  var data_IOutputLog: IOutput
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_IOutputLog: output
}

object IOutputLog {
  @scala.inline
  def apply(data: IOutput, level: LogLevel, `type`: output): IOutputLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOutputLog]
  }
}

