package typings.jupyterlabLogconsole.tokensMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayloadBase]
  }
}

