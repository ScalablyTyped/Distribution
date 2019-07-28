package typings.jug.jugMod

import typings.jug.VertexData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates root node of a graph.
  */
@js.native
trait Graph extends js.Object {
  var vertex: VertexConstructor = js.native
  def init(): Vertex = js.native
  def init(data: VertexData): Vertex = js.native
}

