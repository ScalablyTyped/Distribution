package typings.logform.logformMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadLevelsOptions extends js.Object {
  /**
    * Log levels. Defaults to `configs.npm.levels` from [triple-beam](https://github.com/winstonjs/triple-beam)
    * module.
    */
  var levels: js.UndefOr[Record[String, Double]] = js.undefined
}

object PadLevelsOptions {
  @scala.inline
  def apply(levels: Record[String, Double] = null): PadLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadLevelsOptions]
  }
}

