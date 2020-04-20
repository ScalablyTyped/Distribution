package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var GridStack: typings.gridstack.GridStack
}

object Window {
  @scala.inline
  def apply(GridStack: GridStack): Window = {
    val __obj = js.Dynamic.literal(GridStack = GridStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

