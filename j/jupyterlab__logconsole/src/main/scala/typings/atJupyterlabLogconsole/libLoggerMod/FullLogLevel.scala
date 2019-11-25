package typings.atJupyterlabLogconsole.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All severity levels, including an internal one for metadata.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.metadata
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.critical
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.error
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.warning
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.info
  - typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.debug
*/
trait FullLogLevel extends js.Object

object FullLogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.error = this.cast("error")
  @scala.inline
  def info: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.info = this.cast("info")
  @scala.inline
  def metadata: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.metadata = this.cast("metadata")
  @scala.inline
  def warning: typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.warning = this.cast("warning")
}

