package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Bounds")
@js.native
open class Bounds () extends StObject {
  
  var max: Vector = js.native
  
  var min: Vector = js.native
}
/* static members */
object Bounds {
  
  @JSImport("matter-js", "Bounds")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {Bounds} bounds
    * @param {Vector} point
    * @returns {boolean} True if the bounds contain the point, otherwise false
    */
  inline def contains(bounds: Bounds, point: Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(bounds.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {Vertices} vertices
    * @returns {Bounds} A new bounds object
    */
  inline def create(vertices: Vertices): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vertices.asInstanceOf[js.Any]).asInstanceOf[Bounds]
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {Bounds} boundsA
    * @param {Bounds} boundsB
    * @returns {boolean} True if the bounds overlap, otherwise false
    */
  inline def overlaps(boundsA: Bounds, boundsB: Bounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("overlaps")(boundsA.asInstanceOf[js.Any], boundsB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {Bounds} bounds
    * @param {Vector} position
    */
  inline def shift(bounds: Bounds, position: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shift")(bounds.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {Bounds} bounds
    * @param {Vector} vector
    */
  inline def translate(bounds: Bounds, vector: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(bounds.asInstanceOf[js.Any], vector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {Bounds} bounds
    * @param {Vertices} vertices
    * @param {Vector} velocity
    */
  inline def update(bounds: Bounds, vertices: Vertices, velocity: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(bounds.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
