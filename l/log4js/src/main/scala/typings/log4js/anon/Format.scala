package typings.log4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[typings.log4js.mod.Format] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var nolog: js.UndefOr[js.Any] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: typings.log4js.mod.Format = null, level: String = null, nolog: js.Any = null): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (nolog != null) __obj.updateDynamic("nolog")(nolog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

