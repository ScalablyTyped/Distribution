package typings.jestDashRunner.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherState extends js.Object {
  var interrupted: Boolean
}

object WatcherState {
  @scala.inline
  def apply(interrupted: Boolean): WatcherState = {
    val __obj = js.Dynamic.literal(interrupted = interrupted)
  
    __obj.asInstanceOf[WatcherState]
  }
}

