package typings.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDLogger extends js.Object {
  def debug(message: String): Unit
  def error(message: String): Unit
  def info(message: String): Unit
  def warn(message: String): Unit
}

object LDLogger {
  @scala.inline
  def apply(debug: String => Unit, error: String => Unit, info: String => Unit, warn: String => Unit): LDLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LDLogger]
  }
}

