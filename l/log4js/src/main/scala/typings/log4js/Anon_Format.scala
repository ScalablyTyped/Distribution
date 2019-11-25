package typings.log4js

import typings.log4js.log4jsMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[Format] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var nolog: js.UndefOr[js.Any] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(format: Format = null, level: String = null, nolog: js.Any = null): Anon_Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (nolog != null) __obj.updateDynamic("nolog")(nolog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Format]
  }
}

