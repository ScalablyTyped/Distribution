package typings
package jugLib.jugMod

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
  def init(data: jugLib.VertexData): Vertex = js.native
}

