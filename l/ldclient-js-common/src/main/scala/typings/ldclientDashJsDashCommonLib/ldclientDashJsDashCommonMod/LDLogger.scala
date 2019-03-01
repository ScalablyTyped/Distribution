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
    debug: js.Function1[java.lang.String, scala.Unit],
    error: js.Function1[java.lang.String, scala.Unit],
    info: js.Function1[java.lang.String, scala.Unit],
    warn: js.Function1[java.lang.String, scala.Unit]
  ): LDLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[LDLogger]
  }
}

