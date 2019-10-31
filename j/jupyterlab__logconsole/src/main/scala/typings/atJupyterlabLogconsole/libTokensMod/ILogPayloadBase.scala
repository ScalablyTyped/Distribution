package typings.atJupyterlabLogconsole.libTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogPayloadBase extends js.Object {
  /**
    * Data
    */
  var data: js.Any
  /**
    * Log level
    */
  var level: LogLevel
  /**
    * Type of log data.
    */
  var `type`: String
}

object ILogPayloadBase {
  @scala.inline
  def apply(data: js.Any, level: LogLevel, `type`: String): ILogPayloadBase = {
    val __obj = js.Dynamic.literal(data = data, level = level)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILogPayloadBase]
  }
}

