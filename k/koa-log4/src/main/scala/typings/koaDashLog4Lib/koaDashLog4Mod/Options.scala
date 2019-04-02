package typings
package koaDashLog4Lib.koaDashLog4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[log4jsLib.log4jsMod.Level | koaDashLog4Lib.koaDashLog4LibStrings.auto] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    level: log4jsLib.log4jsMod.Level | koaDashLog4Lib.koaDashLog4LibStrings.auto = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

