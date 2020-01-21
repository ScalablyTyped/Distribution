package typings.jestWatcher

import typings.jestWatcher.jestWatcherStrings.watch
import typings.jestWatcher.jestWatcherStrings.watchAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: watch | watchAll
}

object AnonMode {
  @scala.inline
  def apply(mode: watch | watchAll): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMode]
  }
}

