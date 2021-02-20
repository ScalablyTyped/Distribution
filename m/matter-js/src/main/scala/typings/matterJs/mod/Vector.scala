package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Vector")
@js.native
class Vector () extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
object Vector {
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  @JSImport("matter-js", "Vector.add")
  @js.native
  def add(vectorA: Vector, vectorB: Vector): Vector = js.native
  @JSImport("matter-js", "Vector.add")
  @js.native
  def add(vectorA: Vector, vectorB: Vector, output: Vector): Vector = js.native
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  @JSImport("matter-js", "Vector.angle")
  @js.native
  def angle(vectorA: Vector, vectorB: Vector): Double = js.native
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  @JSImport("matter-js", "Vector.clone")
  @js.native
  def clone(vector: Vector): Vector = js.native
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  @JSImport("matter-js", "Vector.create")
  @js.native
  def create(): Vector = js.native
  @JSImport("matter-js", "Vector.create")
  @js.native
  def create(x: js.UndefOr[scala.Nothing], y: Double): Vector = js.native
  @JSImport("matter-js", "Vector.create")
  @js.native
  def create(x: Double): Vector = js.native
  @JSImport("matter-js", "Vector.create")
  @js.native
  def create(x: Double, y: Double): Vector = js.native
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  @JSImport("matter-js", "Vector.cross")
  @js.native
  def cross(vectorA: Vector, vectorB: Vector): Double = js.native
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  @JSImport("matter-js", "Vector.cross3")
  @js.native
  def cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Double = js.native
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  @JSImport("matter-js", "Vector.div")
  @js.native
  def div(vector: Vector, scalar: Double): Vector = js.native
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  @JSImport("matter-js", "Vector.dot")
  @js.native
  def dot(vectorA: Vector, vectorB: Vector): Double = js.native
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  @JSImport("matter-js", "Vector.magnitude")
  @js.native
  def magnitude(vector: Vector): Double = js.native
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  @JSImport("matter-js", "Vector.magnitudeSquared")
  @js.native
  def magnitudeSquared(vector: Vector): Double = js.native
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  @JSImport("matter-js", "Vector.mult")
  @js.native
  def mult(vector: Vector, scalar: Double): Vector = js.native
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  @JSImport("matter-js", "Vector.neg")
  @js.native
  def neg(vector: Vector): Vector = js.native
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  @JSImport("matter-js", "Vector.normalise")
  @js.native
  def normalise(vector: Vector): Vector = js.native
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  @JSImport("matter-js", "Vector.perp")
  @js.native
  def perp(vector: Vector): Vector = js.native
  @JSImport("matter-js", "Vector.perp")
  @js.native
  def perp(vector: Vector, negate: Boolean): Vector = js.native
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  @JSImport("matter-js", "Vector.rotate")
  @js.native
  def rotate(vector: Vector, angle: Double): Vector = js.native
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  @JSImport("matter-js", "Vector.rotateAbout")
  @js.native
  def rotateAbout(vector: Vector, angle: Double, point: Vector): Vector = js.native
  @JSImport("matter-js", "Vector.rotateAbout")
  @js.native
  def rotateAbout(vector: Vector, angle: Double, point: Vector, output: Vector): Vector = js.native
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  @JSImport("matter-js", "Vector.sub")
  @js.native
  def sub(vectorA: Vector, vectorB: Vector): Vector = js.native
  @JSImport("matter-js", "Vector.sub")
  @js.native
  def sub(vectorA: Vector, vectorB: Vector, optional: Vector): Vector = js.native
}
