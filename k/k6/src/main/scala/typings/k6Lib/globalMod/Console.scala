package typings
package k6Lib.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @public */
@js.native
trait Console extends js.Object {
  /** Log debug message. */
  @JSName("debug")
  var debug_Original: Logger = js.native
  /** Log error message. */
  @JSName("error")
  var error_Original: Logger = js.native
  /** Log informational message. */
  @JSName("info")
  var info_Original: Logger = js.native
  /** Log message. */
  @JSName("log")
  var log_Original: Logger = js.native
  /** Log warning message. */
  @JSName("warn")
  var warn_Original: Logger = js.native
  /** Log debug message. */
  def debug(msg: js.Any, fields: js.Any*): scala.Unit = js.native
  /** Log error message. */
  def error(msg: js.Any, fields: js.Any*): scala.Unit = js.native
  /** Log informational message. */
  def info(msg: js.Any, fields: js.Any*): scala.Unit = js.native
  /** Log message. */
  def log(msg: js.Any, fields: js.Any*): scala.Unit = js.native
  /** Log warning message. */
  def warn(msg: js.Any, fields: js.Any*): scala.Unit = js.native
}

