package typings.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Vertices")
@js.native
class Vertices () extends js.Object
/* static members */
@JSImport("matter-js", "Vertices")
@js.native
object Vertices extends js.Object {
  
  /**
    * Returns the area of the set of vertices.
    * @method area
    * @param {vertices} vertices
    * @param {bool} signed
    * @return {number} The area
    */
  def area(vertices: js.Array[Vector], signed: Boolean): Double = js.native
  
  /**
    * Returns the centre (centroid) of the set of vertices.
    * @method centre
    * @param {vertices} vertices
    * @return {vector} The centre point
    */
  def centre(vertices: js.Array[Vector]): Vector = js.native
  
  def chamfer(
    vertices: js.Array[Vector],
    radius: js.Array[Double],
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[Vector] = js.native
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
  def chamfer(
    vertices: js.Array[Vector],
    radius: Double,
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[Vector] = js.native
  
  /**
    * Sorts the input vertices into clockwise order in place.
    * @method clockwiseSort
    * @param {vertices} vertices
    * @return {vertices} vertices
    */
  def clockwiseSort(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  
  /**
    * Returns `true` if the `point` is inside the set of `vertices`.
    * @method contains
    * @param {vertices} vertices
    * @param {vector} point
    * @return {boolean} True if the vertices contains point, otherwise false
    */
  def contains(vertices: js.Array[Vector], point: Vector): Boolean = js.native
  
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
  def create(points: js.Array[Vector], body: Body): js.Array[Vector] = js.native
  
  /**
    * Parses a string containing ordered x y pairs separated by spaces (and optionally commas),
    * into a `Matter.Vertices` object for the given `Matter.Body`.
    * For parsing SVG paths, see `Svg.pathToVertices`.
    * @method fromPath
    * @param {string} path
    * @param {body} body
    * @return {vertices} vertices
    */
  def fromPath(path: String, body: Body): js.Array[Vector] = js.native
  
  /**
    * Returns the convex hull of the input vertices as a new array of points.
    * @method hull
    * @param {vertices} vertices
    * @return [vertex] vertices
    */
  def hull(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  
  /**
    * Returns the moment of inertia (second moment of area) of the set of vertices given the total mass.
    * @method inertia
    * @param {vertices} vertices
    * @param {number} mass
    * @return {number} The polygon's moment of inertia
    */
  def inertia(vertices: js.Array[Vector], mass: Double): Double = js.native
  
  /**
    * Returns true if the vertices form a convex shape (vertices must be in clockwise order).
    * @method isConvex
    * @param {vertices} vertices
    * @return {bool} `true` if the `vertices` are convex, `false` if not (or `null` if not computable).
    */
  def isConvex(vertices: js.Array[Vector]): Boolean = js.native
  
  /**
    * Returns the average (mean) of the set of vertices.
    * @method mean
    * @param {vertices} vertices
    * @return {vector} The average point
    */
  def mean(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  
  /**
    * Rotates the set of vertices in-place.
    * @method rotate
    * @param {vertices} vertices
    * @param {number} angle
    * @param {vector} point
    * @return {vertices} vertices
    */
  def rotate(vertices: js.Array[Vector], angle: Double, point: Vector): js.Array[Vector] = js.native
  
  /**
    * Scales the vertices from a point (default is centre) in-place.
    * @method scale
    * @param {vertices} vertices
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    * @return {vertices} vertices
    */
  def scale(vertices: js.Array[Vector], scaleX: Double, scaleY: Double, point: Vector): js.Array[Vector] = js.native
  
  /**
    * Translates the set of vertices in-place.
    * @method translate
    * @param {vertices} vertices
    * @param {vector} vector
    * @param {number} scalar
    * @return {vertices} vertices
    */
  def translate(vertices: js.Array[Vector], vector: Vector, scalar: Double): js.Array[Vector] = js.native
}
