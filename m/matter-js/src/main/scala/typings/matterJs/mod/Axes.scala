package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Axes")
@js.native
class Axes () extends js.Object

/* static members */
@JSImport("matter-js", "Axes")
@js.native
object Axes extends js.Object {
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  def fromVertices(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  def rotate(axes: js.Array[Vector], angle: Double): Unit = js.native
}

