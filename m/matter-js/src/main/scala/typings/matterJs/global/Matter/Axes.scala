package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Axes")
@js.native
class Axes ()
  extends typings.matterJs.mod.Axes
/* static members */
object Axes {
  
  @JSGlobal("Matter.Axes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  inline def fromVertices(vertices: js.Array[typings.matterJs.mod.Vector]): js.Array[typings.matterJs.mod.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  inline def rotate(axes: js.Array[typings.matterJs.mod.Vector], angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(axes.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
