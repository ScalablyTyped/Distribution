package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Vector")
@js.native
class Vector () extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
/* static members */
object Vector {
  
  @JSImport("matter-js", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the two vectors.
    * @method add
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB added
    */
  @scala.inline
  def add(vectorA: Vector, vectorB: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Vector]
  @scala.inline
  def add(vectorA: Vector, vectorB: Vector, output: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Returns the angle in radians between the two vectors relative to the x-axis.
    * @method angle
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The angle in radians
    */
  @scala.inline
  def angle(vectorA: Vector, vectorB: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns a new vector with `x` and `y` copied from the given `vector`.
    * @method clone
    * @param {vector} vector
    * @return {vector} A new cloned vector
    */
  @scala.inline
  def clone(vector: Vector): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * Creates a new vector.
    * @method create
    * @param {number} x
    * @param {number} y
    * @return {vector} A new vector
    */
  @scala.inline
  def create(): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Vector]
  @scala.inline
  def create(x: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[Vector]
  @scala.inline
  def create(x: Double, y: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Vector]
  @scala.inline
  def create(x: Unit, y: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Returns the cross-product of two vectors.
    * @method cross
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The cross product of the two vectors
    */
  @scala.inline
  def cross(vectorA: Vector, vectorB: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the cross-product of three vectors.
    * @method cross3
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} vectorC
    * @return {number} The cross product of the three vectors
    */
  @scala.inline
  def cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cross3")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], vectorC.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Divides a vector and a scalar.
    * @method div
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector divided by scalar
    */
  @scala.inline
  def div(vector: Vector, scalar: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Returns the dot-product of two vectors.
    * @method dot
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @return {number} The dot product of the two vectors
    */
  @scala.inline
  def dot(vectorA: Vector, vectorB: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the magnitude (length) of a vector.
    * @method magnitude
    * @param {vector} vector
    * @return {number} The magnitude of the vector
    */
  @scala.inline
  def magnitude(vector: Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Returns the magnitude (length) of a vector (therefore saving a `sqrt` operation).
    * @method magnitudeSquared
    * @param {vector} vector
    * @return {number} The squared magnitude of the vector
    */
  @scala.inline
  def magnitudeSquared(vector: Vector): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(vector.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Multiplies a vector and a scalar.
    * @method mult
    * @param {vector} vector
    * @param {number} scalar
    * @return {vector} A new vector multiplied by scalar
    */
  @scala.inline
  def mult(vector: Vector, scalar: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("mult")(vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Negates both components of a vector such that it points in the opposite direction.
    * @method neg
    * @param {vector} vector
    * @return {vector} The negated vector
    */
  @scala.inline
  def neg(vector: Vector): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * Normalises a vector (such that its magnitude is `1`).
    * @method normalise
    * @param {vector} vector
    * @return {vector} A new vector normalised
    */
  @scala.inline
  def normalise(vector: Vector): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("normalise")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * Returns the perpendicular vector. Set `negate` to true for the perpendicular in the opposite direction.
    * @method perp
    * @param {vector} vector
    * @param {bool} [negate=false]
    * @return {vector} The perpendicular vector
    */
  @scala.inline
  def perp(vector: Vector): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any]).asInstanceOf[Vector]
  @scala.inline
  def perp(vector: Vector, negate: Boolean): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("perp")(vector.asInstanceOf[js.Any], negate.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Rotates the vector about (0, 0) by specified angle.
    * @method rotate
    * @param {vector} vector
    * @param {number} angle
    * @return {vector} A new vector rotated about (0, 0)
    */
  @scala.inline
  def rotate(vector: Vector, angle: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Rotates the vector about a specified point by specified angle.
    * @method rotateAbout
    * @param {vector} vector
    * @param {number} angle
    * @param {vector} point
    * @param {vector} [output]
    * @return {vector} A new vector rotated about the point
    */
  @scala.inline
  def rotateAbout(vector: Vector, angle: Double, point: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Vector]
  @scala.inline
  def rotateAbout(vector: Vector, angle: Double, point: Vector, output: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAbout")(vector.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * Subtracts the two vectors.
    * @method sub
    * @param {vector} vectorA
    * @param {vector} vectorB
    * @param {vector} [output]
    * @return {vector} A new vector of vectorA and vectorB subtracted
    */
  @scala.inline
  def sub(vectorA: Vector, vectorB: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any])).asInstanceOf[Vector]
  @scala.inline
  def sub(vectorA: Vector, vectorB: Vector, optional: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(vectorA.asInstanceOf[js.Any], vectorB.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Vector]
}
