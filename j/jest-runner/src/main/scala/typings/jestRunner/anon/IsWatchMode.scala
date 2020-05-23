package typings.jestRunner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsWatchMode extends js.Object {
  var isWatchMode: Boolean
}

object IsWatchMode {
  @scala.inline
  def apply(isWatchMode: Boolean): IsWatchMode = {
    val __obj = js.Dynamic.literal(isWatchMode = isWatchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWatchMode]
  }
}

