package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDLogger extends js.Object {
  def debug(message: java.lang.String): scala.Unit
  def error(message: java.lang.String): scala.Unit
  def info(message: java.lang.String): scala.Unit
  def warn(message: java.lang.String): scala.Unit
}

object LDLogger {
  @scala.inline
  def apply(
    debug: java.lang.String => scala.Unit,
    error: java.lang.String => scala.Unit,
    info: java.lang.String => scala.Unit,
    warn: java.lang.String => scala.Unit
  ): LDLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[LDLogger]
  }
}

