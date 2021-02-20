package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Axes")
@js.native
class Axes () extends StObject
/* static members */
object Axes {
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  @JSImport("matter-js", "Axes.fromVertices")
  @js.native
  def fromVertices(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  @JSImport("matter-js", "Axes.rotate")
  @js.native
  def rotate(axes: js.Array[Vector], angle: Double): Unit = js.native
}
