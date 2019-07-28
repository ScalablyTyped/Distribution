package typings.i18nDashAbide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def error(msg: String): Unit
  def warn(msg: String): Unit
}

object Anon_Error {
  @scala.inline
  def apply(error: String => Unit, warn: String => Unit): Anon_Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Anon_Error]
  }
}

