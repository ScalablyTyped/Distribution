package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Graph")
@js.native
class Graph protected () extends js.Object {
  def this(grid: js.Array[js.Array[Double]]) = this()
  def this(grid: js.Array[js.Array[Double]], options: AnonDiagonal) = this()
  var grid: js.Array[js.Array[GridNode]] = js.native
}

