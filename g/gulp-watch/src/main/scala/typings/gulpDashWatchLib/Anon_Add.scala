package typings
package gulpDashWatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var event: gulpDashWatchLib.gulpDashWatchLibStrings.add | gulpDashWatchLib.gulpDashWatchLibStrings.change | gulpDashWatchLib.gulpDashWatchLibStrings.unlink
}

object Anon_Add {
  @scala.inline
  def apply(
    event: gulpDashWatchLib.gulpDashWatchLibStrings.add | gulpDashWatchLib.gulpDashWatchLibStrings.change | gulpDashWatchLib.gulpDashWatchLibStrings.unlink
  ): Anon_Add = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Add]
  }
}

