package typings.jupyterlabLogconsole.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All severity levels, including an internal one for metadata.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
  - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
*/
trait FullLogLevel extends js.Object

object FullLogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = this.cast("error")
  @scala.inline
  def info: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = this.cast("info")
  @scala.inline
  def metadata: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata = this.cast("metadata")
  @scala.inline
  def warning: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = this.cast("warning")
}

