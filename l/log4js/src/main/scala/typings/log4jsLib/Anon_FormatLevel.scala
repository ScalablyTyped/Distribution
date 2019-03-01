package typings
package log4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatLevel extends js.Object {
  var format: js.UndefOr[Format] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var nolog: js.UndefOr[js.Any] = js.undefined
  var statusRules: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_FormatLevel {
  @scala.inline
  def apply(
    format: Format = null,
    level: java.lang.String = null,
    nolog: js.Any = null,
    statusRules: js.Array[_] = null
  ): Anon_FormatLevel = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (nolog != null) __obj.updateDynamic("nolog")(nolog)
    if (statusRules != null) __obj.updateDynamic("statusRules")(statusRules)
    __obj.asInstanceOf[Anon_FormatLevel]
  }
}

