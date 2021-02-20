package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Bounds")
@js.native
class Bounds () extends StObject {
  
  var max: Vector = js.native
  
  var min: Vector = js.native
}
/* static members */
object Bounds {
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {bounds} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  @JSImport("matter-js", "Bounds.contains")
  @js.native
  def contains(bounds: Bounds, point: Vector): Boolean = js.native
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {bounds} A new bounds object
    */
  @JSImport("matter-js", "Bounds.create")
  @js.native
  def create(vertices: Vertices): Bounds = js.native
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {bounds} boundsA
    * @param {bounds} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  @JSImport("matter-js", "Bounds.overlaps")
  @js.native
  def overlaps(boundsA: Bounds, boundsB: Bounds): Boolean = js.native
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {bounds} bounds
    * @param {vector} position
    */
  @JSImport("matter-js", "Bounds.shift")
  @js.native
  def shift(bounds: Bounds, position: Vector): Unit = js.native
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {bounds} bounds
    * @param {vector} vector
    */
  @JSImport("matter-js", "Bounds.translate")
  @js.native
  def translate(bounds: Bounds, vector: Vector): Unit = js.native
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {bounds} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  @JSImport("matter-js", "Bounds.update")
  @js.native
  def update(bounds: Bounds, vertices: Vertices, velocity: Vector): Unit = js.native
}
