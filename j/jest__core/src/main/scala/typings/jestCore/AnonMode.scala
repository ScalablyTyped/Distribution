package typings.jestCore

import typings.jestCore.jestCoreStrings.watch
import typings.jestCore.jestCoreStrings.watchAll
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

