package typings.logstub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<this, 'debug' | 'info' | 'warn' | 'error' | 'child' | 'level'> */
trait Pickthisdebuginfowarnerro extends js.Object {
  var child: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var info: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[js.Any] = js.undefined
  var warn: js.UndefOr[js.Any] = js.undefined
}

object Pickthisdebuginfowarnerro {
  @scala.inline
  def apply(
    child: js.Any = null,
    debug: js.Any = null,
    error: js.Any = null,
    info: js.Any = null,
    level: js.Any = null,
    warn: js.Any = null
  ): Pickthisdebuginfowarnerro = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pickthisdebuginfowarnerro]
  }
}

