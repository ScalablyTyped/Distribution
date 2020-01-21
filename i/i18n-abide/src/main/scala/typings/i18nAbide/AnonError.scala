package typings.i18nAbide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(msg: String): Unit
  def warn(msg: String): Unit
}

object AnonError {
  @scala.inline
  def apply(error: String => Unit, warn: String => Unit): AnonError = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[AnonError]
  }
}

