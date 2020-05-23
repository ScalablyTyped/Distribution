package typings.jupyterlabLogconsole.anon

import typings.jupyterlabLogconsole.loggerMod.FullLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * Log level
    */
  var level: FullLogLevel
  /**
    * Date & time when output is logged in integer representation.
    */
  var timestamp: Double
}

object Level {
  @scala.inline
  def apply(level: FullLogLevel, timestamp: Double): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

