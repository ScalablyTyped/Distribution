package typings.jug.jugMod

import typings.jug.VertexData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexStructure extends js.Object {
  var data: VertexData
  var edge: js.Array[Vertex]
  var level: Double
  var parent: Vertex
}

object VertexStructure {
  @scala.inline
  def apply(data: VertexData, edge: js.Array[Vertex], level: Double, parent: Vertex): VertexStructure = {
    val __obj = js.Dynamic.literal(data = data, edge = edge, level = level, parent = parent)
  
    __obj.asInstanceOf[VertexStructure]
  }
}

