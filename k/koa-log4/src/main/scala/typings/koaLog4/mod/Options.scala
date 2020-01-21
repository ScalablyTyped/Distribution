package typings.koaLog4.mod

import typings.koaLog4.koaLog4Strings.auto
import typings.log4js.mod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Level | auto] = js.undefined
}

object Options {
  @scala.inline
  def apply(format: String = null, level: Level | auto = null): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

