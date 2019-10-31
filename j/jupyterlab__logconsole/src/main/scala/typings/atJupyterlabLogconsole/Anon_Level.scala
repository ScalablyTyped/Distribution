package typings.atJupyterlabLogconsole

import typings.atJupyterlabLogconsole.libLoggerMod.FullLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  /**
    * Log level
    */
  var level: FullLogLevel
  /**
    * Date & time when output is logged in integer representation.
    */
  var timestamp: Double
}

object Anon_Level {
  @scala.inline
  def apply(level: FullLogLevel, timestamp: Double): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

