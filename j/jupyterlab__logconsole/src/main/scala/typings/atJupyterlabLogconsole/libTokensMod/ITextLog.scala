package typings.atJupyterlabLogconsole.libTokensMod

import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as plain text.
    */
  @JSName("data")
  var data_ITextLog: String
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_ITextLog: text
}

object ITextLog {
  @scala.inline
  def apply(data: String, level: LogLevel, `type`: text): ITextLog = {
    val __obj = js.Dynamic.literal(data = data, level = level)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITextLog]
  }
}

