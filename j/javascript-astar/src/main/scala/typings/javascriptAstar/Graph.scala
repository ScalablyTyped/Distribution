package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var grid: js.Array[js.Array[GridNode]]
}

object Graph {
  @scala.inline
  def apply(grid: js.Array[js.Array[GridNode]]): Graph = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

