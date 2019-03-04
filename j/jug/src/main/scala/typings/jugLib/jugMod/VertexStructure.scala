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
    val __obj = js.Dynamic.literal(data = data, edge = edge, level = level, parent = parent)
  
    __obj.asInstanceOf[VertexStructure]
  }
}

