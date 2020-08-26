package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var grid: js.Array[js.Array[GridNode]] = js.native
}

object Graph {
  @scala.inline
  def apply(grid: js.Array[js.Array[GridNode]]): Graph = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGridVarargs(value: js.Array[GridNode]*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: js.Array[js.Array[GridNode]]): Self = this.set("grid", value.asInstanceOf[js.Any])
  }
  
}

