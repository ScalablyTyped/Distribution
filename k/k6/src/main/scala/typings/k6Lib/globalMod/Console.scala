package typings
package k6Lib.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def debug(msg: js.Any, fields: js.Any*): scala.Unit
  def error(msg: js.Any, fields: js.Any*): scala.Unit
  def info(msg: js.Any, fields: js.Any*): scala.Unit
  def log(msg: js.Any, fields: js.Any*): scala.Unit
  def warn(msg: js.Any, fields: js.Any*): scala.Unit
}

object Console {
  @scala.inline
  def apply(
    debug: (js.Any, /* repeated */ js.Any) => scala.Unit,
    error: (js.Any, /* repeated */ js.Any) => scala.Unit,
    info: (js.Any, /* repeated */ js.Any) => scala.Unit,
    log: (js.Any, /* repeated */ js.Any) => scala.Unit,
    warn: (js.Any, /* repeated */ js.Any) => scala.Unit
  ): Console = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), warn = js.Any.fromFunction2(warn))
  
    __obj.asInstanceOf[Console]
  }
}

