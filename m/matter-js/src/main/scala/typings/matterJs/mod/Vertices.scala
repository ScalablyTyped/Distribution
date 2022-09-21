package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Vertices")
@js.native
open class Vertices () extends StObject
/* static members */
object Vertices {
  
  @JSImport("matter-js", "Vertices")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the area of the set of vertices.
    * @method area
    * @param {Vertices} vertices
    * @param {boolean} signed
    * @returns {number} The area
    */
  inline def area(vertices: js.Array[Vector], signed: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(vertices.asInstanceOf[js.Any], signed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the centre (centroid) of the set of vertices.
    * @method centre
    * @param {Vertices} vertices
    * @returns {Vector} The centre point
    */
  inline def centre(vertices: js.Array[Vector]): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("centre")(vertices.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  inline def chamfer(
    vertices: js.Array[Vector],
    radius: js.Array[Double],
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  /**
    * Chamfers a set of vertices by giving them rounded corners, returns a new set of vertices.
    * The radius parameter is a single number or an array to specify the radius for each vertex.
    * @method chamfer
    * @param {Vertices} vertices
    * @param {number[]} radius
    * @param {number} quality
    * @param {number} qualityMin
    * @param {number} qualityMax
    * @returns {Vertices} vertices
    */
  inline def chamfer(
    vertices: js.Array[Vector],
    radius: Double,
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  
  /**
    * Sorts the input vertices into clockwise order in place.
    * @method clockwiseSort
    * @param {Vertices} vertices
    * @returns {Vertices} vertices
    */
  inline def clockwiseSort(vertices: js.Array[Vector]): js.Array[Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseSort")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vector]]
  
  /**
    * Returns `true` if the `point` is inside the set of `vertices`.
    * @method contains
    * @param {Vertices} vertices
    * @param {Vector} point
    * @returns {boolean} True if the vertices contains point, otherwise false
    */
  inline def contains(vertices: js.Array[Vector], point: Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(vertices.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
    * @param {Vector[]} points
    * @param {Body} body
    * @returns {Vertices} vertices
    */
  inline def create(points: js.Array[Vector], body: Body): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(points.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  
  /**
    * Parses a string containing ordered x y pairs separated by spaces (and optionally commas),
    * into a `Matter.Vertices` object for the given `Matter.Body`.
    * For parsing SVG paths, see `Svg.pathToVertices`.
    * @method fromPath
    * @param {string} path
    * @param {Body} body
    * @returns {Vertices} vertices
    */
  inline def fromPath(path: String, body: Body): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  
  /**
    * Returns the convex hull of the input vertices as a new array of points.
    * @method hull
    * @param {Vertices} vertices
    * @returns {Array<Vertex>} vertices
    */
  inline def hull(vertices: js.Array[Vertex]): js.Array[Vertex] = ^.asInstanceOf[js.Dynamic].applyDynamic("hull")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[Vertex]]
  
  /**
    * Returns the moment of inertia (second moment of area) of the set of vertices given the total mass.
    * @method inertia
    * @param {Vertices} vertices
    * @param {number} mass
    * @returns {number} The polygon's moment of inertia
    */
  inline def inertia(vertices: js.Array[Vector], mass: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(vertices.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns true if the vertices form a convex shape (vertices must be in clockwise order).
    * @method isConvex
    * @param {Vertices} vertices
    * @returns {boolean} `true` if the `vertices` are convex, `false` if not (or `null` if not computable).
    */
  inline def isConvex(vertices: js.Array[Vector]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvex")(vertices.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the average (mean) of the set of vertices.
    * @method mean
    * @param {Vertices} vertices
    * @returns {Vector} The average point
    */
  inline def mean(vertices: js.Array[Vector]): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(vertices.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * Rotates the set of vertices in-place.
    * @method rotate
    * @param {Vertices} vertices
    * @param {number} angle
    * @param {Vector} point
    * @returns {Vertices} vertices
    */
  inline def rotate(vertices: js.Array[Vector], angle: Double, point: Vector): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vertices.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  
  /**
    * Scales the vertices from a point (default is centre) in-place.
    * @method scale
    * @param {Vertices} vertices
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {Vector} point
    * @returns {Vertices} vertices
    */
  inline def scale(vertices: js.Array[Vector], scaleX: Double, scaleY: Double, point: Vector): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(vertices.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
  
  /**
    * Translates the set of vertices in-place.
    * @method translate
    * @param {Vertices} vertices
    * @param {Vector} vector
    * @param {number} scalar
    * @returns {Vertices} vertices
    */
  inline def translate(vertices: js.Array[Vector], vector: Vector, scalar: Double): js.Array[Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(vertices.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[js.Array[Vector]]
}
