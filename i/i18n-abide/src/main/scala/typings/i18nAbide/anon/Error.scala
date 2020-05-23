package typings.i18nAbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  def error(msg: String): Unit
  def warn(msg: String): Unit
}

object Error {
  @scala.inline
  def apply(error: String => Unit, warn: String => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Error]
  }
}

