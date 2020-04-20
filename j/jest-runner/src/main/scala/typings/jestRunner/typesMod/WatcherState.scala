package typings.jestRunner.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherState extends js.Object {
  var interrupted: Boolean
}

object WatcherState {
  @scala.inline
  def apply(interrupted: Boolean): WatcherState = {
    val __obj = js.Dynamic.literal(interrupted = interrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherState]
  }
}

