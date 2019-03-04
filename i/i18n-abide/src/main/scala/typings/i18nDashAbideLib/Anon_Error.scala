package typings
package i18nDashAbideLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def error(msg: java.lang.String): scala.Unit
  def warn(msg: java.lang.String): scala.Unit
}

object Anon_Error {
  @scala.inline
  def apply(
    error: js.Function1[java.lang.String, scala.Unit],
    warn: js.Function1[java.lang.String, scala.Unit]
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, warn = warn)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

