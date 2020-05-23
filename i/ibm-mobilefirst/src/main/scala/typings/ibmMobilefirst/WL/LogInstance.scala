package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
trait LogInstance extends js.Object {
  def debug(message: String): Unit
  def error(message: String): Unit
  def fatal(message: String): Unit
  def info(message: String): Unit
  def trace(message: String): Unit
  def warn(message: String): Unit
}

object LogInstance {
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    fatal: String => Unit,
    info: String => Unit,
    trace: String => Unit,
    warn: String => Unit
  ): LogInstance = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogInstance]
  }
}

