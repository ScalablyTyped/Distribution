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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextLog]
  }
}

