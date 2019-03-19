package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def error(args: js.Any*): scala.Unit
  def log(args: js.Any*): scala.Unit
  def warn(args: js.Any*): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => scala.Unit,
    log: /* repeated */ js.Any => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

