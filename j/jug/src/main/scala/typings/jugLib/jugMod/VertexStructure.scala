package typings
package jugLib.jugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexStructure extends js.Object {
  var data: jugLib.VertexData
  var edge: js.Array[Vertex]
  var level: scala.Double
  var parent: Vertex
}

object VertexStructure {
  @scala.inline
  def apply(data: jugLib.VertexData, edge: js.Array[Vertex], level: scala.Double, parent: Vertex): VertexStructure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("edge")(edge)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[VertexStructure]
  }
}

