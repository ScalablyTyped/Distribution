package typings.jug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates root node of a graph.
  */
@js.native
trait Graph extends js.Object {
  
  def init(): Vertex = js.native
  def init(data: VertexData): Vertex = js.native
  
  var vertex: VertexConstructor = js.native
}
