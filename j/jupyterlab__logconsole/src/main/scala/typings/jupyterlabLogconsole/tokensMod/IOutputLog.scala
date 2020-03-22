package typings.jupyterlabLogconsole.tokensMod

import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typings.jupyterlabNbformat.mod.IOutput
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputLog]
  }
}

