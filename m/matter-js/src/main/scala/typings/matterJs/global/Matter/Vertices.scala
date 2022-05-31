package typings.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Vertices")
@js.native
class Vertices ()
  extends typings.matterJs.mod.Vertices
/* static members */
object Vertices {
  
  @JSGlobal("Matter.Vertices")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the area of the set of vertices.
    * @method area
    * @param {vertices} vertices
    * @param {bool} signed
    * @return {number} The area
    */
  inline def area(vertices: js.Array[typings.matterJs.mod.Vector], signed: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(vertices.asInstanceOf[js.Any], signed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the centre (centroid) of the set of vertices.
    * @method centre
    * @param {vertices} vertices
    * @return {vector} The centre point
    */
  inline def centre(vertices: js.Array[typings.matterJs.mod.Vector]): typings.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("centre")(vertices.asInstanceOf[js.Any]).asInstanceOf[typings.matterJs.mod.Vector]
  
  inline def chamfer(
    vertices: js.Array[typings.matterJs.mod.Vector],
    radius: js.Array[Double],
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  /**
    * Chamfers a set of vertices by giving them rounded corners, returns a new set of vertices.
    * The radius parameter is a single number or an array to specify the radius for each vertex.
    * @method chamfer
    * @param {vertices} vertices
    * @param {number[]} radius
    * @param {number} quality
    * @param {number} qualityMin
    * @param {number} qualityMax
    * @return {vertices} vertices
    */
  inline def chamfer(
    vertices: js.Array[typings.matterJs.mod.Vector],
    radius: Double,
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Sorts the input vertices into clockwise order in place.
    * @method clockwiseSort
    * @param {vertices} vertices
    * @return {vertices} vertices
    */
  inline def clockwiseSort(vertices: js.Array[typings.matterJs.mod.Vector]): js.Array[typings.matterJs.mod.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseSort")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Returns `true` if the `point` is inside the set of `vertices`.
    * @method contains
    * @param {vertices} vertices
    * @param {vector} point
    * @return {boolean} True if the vertices contains point, otherwise false
    */
  inline def contains(vertices: js.Array[typings.matterJs.mod.Vector], point: typings.matterJs.mod.Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(vertices.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Creates a new set of `Matter.Body` compatible vertices.
    * The `points` argument accepts an array of `Matter.Vector` points orientated around the origin `(0, 0)`, for example:
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * The `Vertices.create` method returns a new array of vertices, which are similar to Matter.Vector objects,
    * but with some additional references required for efficient collision detection routines.
    *
    * Note that the `body` argument is not optional, a `Matter.Body` reference must be provided.
    *
    * @method create
    * @param {vector[]} points
    * @param {body} body
    * @return {vertices} vertices
    */
  inline def create(points: js.Array[typings.matterJs.mod.Vector], body: typings.matterJs.mod.Body): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(points.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Parses a string containing ordered x y pairs separated by spaces (and optionally commas),
    * into a `Matter.Vertices` object for the given `Matter.Body`.
    * For parsing SVG paths, see `Svg.pathToVertices`.
    * @method fromPath
    * @param {string} path
    * @param {body} body
    * @return {vertices} vertices
    */
  inline def fromPath(path: String, body: typings.matterJs.mod.Body): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Returns the convex hull of the input vertices as a new array of points.
    * @method hull
    * @param {vertices} vertices
    * @return [vertex] vertices
    */
  inline def hull(vertices: js.Array[typings.matterJs.mod.Vector]): js.Array[typings.matterJs.mod.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("hull")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Returns the moment of inertia (second moment of area) of the set of vertices given the total mass.
    * @method inertia
    * @param {vertices} vertices
    * @param {number} mass
    * @return {number} The polygon's moment of inertia
    */
  inline def inertia(vertices: js.Array[typings.matterJs.mod.Vector], mass: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(vertices.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns true if the vertices form a convex shape (vertices must be in clockwise order).
    * @method isConvex
    * @param {vertices} vertices
    * @return {bool} `true` if the `vertices` are convex, `false` if not (or `null` if not computable).
    */
  inline def isConvex(vertices: js.Array[typings.matterJs.mod.Vector]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvex")(vertices.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the average (mean) of the set of vertices.
    * @method mean
    * @param {vertices} vertices
    * @return {vector} The average point
    */
  inline def mean(vertices: js.Array[typings.matterJs.mod.Vector]): js.Array[typings.matterJs.mod.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Rotates the set of vertices in-place.
    * @method rotate
    * @param {vertices} vertices
    * @param {number} angle
    * @param {vector} point
    * @return {vertices} vertices
    */
  inline def rotate(vertices: js.Array[typings.matterJs.mod.Vector], angle: Double, point: typings.matterJs.mod.Vector): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vertices.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Scales the vertices from a point (default is centre) in-place.
    * @method scale
    * @param {vertices} vertices
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    * @return {vertices} vertices
    */
  inline def scale(
    vertices: js.Array[typings.matterJs.mod.Vector],
    scaleX: Double,
    scaleY: Double,
    point: typings.matterJs.mod.Vector
  ): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(vertices.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
  
  /**
    * Translates the set of vertices in-place.
    * @method translate
    * @param {vertices} vertices
    * @param {vector} vector
    * @param {number} scalar
    * @return {vertices} vertices
    */
  inline def translate(
    vertices: js.Array[typings.matterJs.mod.Vector],
    vector: typings.matterJs.mod.Vector,
    scalar: Double
  ): js.Array[typings.matterJs.mod.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(vertices.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.matterJs.mod.Vector]]
}
