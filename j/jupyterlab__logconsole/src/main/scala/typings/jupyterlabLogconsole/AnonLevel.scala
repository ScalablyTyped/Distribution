package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.loggerMod.FullLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  /**
    * Log level
    */
  var level: FullLogLevel
  /**
    * Date & time when output is logged in integer representation.
    */
  var timestamp: Double
}

object AnonLevel {
  @scala.inline
  def apply(level: FullLogLevel, timestamp: Double): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

