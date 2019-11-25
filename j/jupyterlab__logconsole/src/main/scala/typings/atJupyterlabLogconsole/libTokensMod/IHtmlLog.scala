package typings.atJupyterlabLogconsole.libTokensMod

import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlLog
  extends ILogPayloadBase
     with ILogPayload {
  /**
    * Log data as HTML string.
    */
  @JSName("data")
  var data_IHtmlLog: String
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_IHtmlLog: html
}

object IHtmlLog {
  @scala.inline
  def apply(data: String, level: LogLevel, `type`: html): IHtmlLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHtmlLog]
  }
}

